#!/bin/bash
. util.sh

###
_echo ">> Compile and test an example project (math_70)"
mvn -f astor/examples/math_70/pom.xml clean compile test

###
_echo ">> Retrieve dependencies for executing astor"
mvn -f astor/pom.xml dependency:build-classpath \
  | egrep -v "(^\[INFO\]|^\[WARNING\])" \
  | tee /tmp/astor-classpath.txt

ASTOR_CP=$(cat /tmp/astor-classpath.txt):astor/target/classes

###
_echo ">> Execute astor for math_70"
java -cp $ASTOR_CP fr.inria.main.evolution.AstorMain \
  -location astor/examples/math_70 \
  -mode jgenprog \
  -scope package \
  -failing org.apache.commons.math.analysis.solvers.BisectionSolverTest \
  -srcjavafolder /src/main/java/ \
  -srctestfolder /src/test/java/ \
  -binjavafolder /target/classes \
  -bintestfolder /target/test-classes \
  -dependencies astor/examples/libs/junit-4.4.jar \
  -flthreshold 0.5 -seed 10 -maxtime 100 -stopfirst true
