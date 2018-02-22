#!/bin/bash
. util.sh

###
_echo ">> Renew astor project"
if [ ! -d astor ]; then
  git clone 'https://github.com/SpoonLabs/astor.git'
else
  git -C astor fetch
fi
git -C astor checkout -f 43c1d6d7984de6d00fb56bd1d663f2bb2e849dc8

###
_echo ">> Remove dependency for evosuite.org from pom.xml"
perl -i -0pe 's|(<repository>\n.*EvoSuite(.*\n)*?.*</repository>)|<!-- $1 -->|g' astor/pom.xml

###
_echo ">> Compile astor"
mvn -f astor/pom.xml clean compile

###
_echo ">> Set loglevel to DEBUG"
sed -i -e 's|^loglevel=.*|loglevel=DEBUG|' astor/target/classes/configuration.properties
