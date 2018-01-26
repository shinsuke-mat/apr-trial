#!/bin/bash
. util.sh

###
if [ $# -ne 1 ]; then
  echo "Specify a test class".
  exit 1
fi

###
_echo ">> Compile and test an example project"
mvn -f guineapig/pom.xml clean compile test

###
_echo ">> Retrieve dependencies for executing astor"
mvn -f astor/pom.xml dependency:build-classpath \
  | egrep -v "(^\[INFO\]|^\[WARNING\])" \
  | tee /tmp/astor-classpath.txt

ASTOR_CP=$(cat /tmp/astor-classpath.txt):astor/target/classes

###
_echo ">> Temporally disable untargetted test classes"
find guineapig/target/test-classes/ -name '*.class' | egrep -v $1 | xargs -I_ mv _ _.bak

###
_echo ">> Execute astor for example"
java -cp $ASTOR_CP fr.inria.main.evolution.AstorMain \
  -location guineapig \
  -mode jgenprog \
  -scope package \
  -failing jp.ac.osakau.apr.$1 \
  -srcjavafolder /src/main/java/ \
  -srctestfolder /src/test/java/ \
  -binjavafolder /target/classes \
  -bintestfolder /target/test-classes \
  -dependencies astor/examples/libs/junit-4.4.jar \
  -flthreshold 0.1 -seed 1 -maxtime 100 \
  -maxgen 200 \
  -stopfirst false \
