#!/usr/bin/bash

unalias java 2>/dev/null

RED='\033[0;31m'
RESET='\033[0m'

###
echo -e "${RED}>> Renew astor project${RESET}"
if [ ! -d astor ]; then
  git clone 'https://github.com/SpoonLabs/astor.git'
else
  git -C astor pull
fi

###
echo -e "${RED}>> Build astor.jar${RESET}"
mvn -f astor/pom.xml package -DskipTests=true

###
echo -e "${RED}>> Confirm astor.jar${RESET}"
if [ $(ls astor/target/*jar-with-dependencies.jar -1 | wc -l) -ne 1 ]; then
  echo -e "${RED}>> maven build failed${RESET}"
  exit 1
fi

### !!! 相対パスだとfail (NullPointerException) するので注意！！！！！！
ASTOR_JAR=$(ls astor/target/*jar-with-dependencies.jar -1 --color=never | xargs readlink -f)

###
echo -e "${RED}>> Compile and test an example project (math_70)${RESET}"
mvn -f astor/examples/math_70/pom.xml test
### expected: Tests run: 2181, Failures: 0, Errors: 1, Skipped: 0

### 
java -cp $ASTOR_JAR fr.inria.main.evolution.AstorMain \
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

exit
################################################################################

java -cp $ASTOR_JAR fr.inria.main.evolution.AstorMain \
  -location apr-example \
  -mode jgenprog \
  -scope package \
  -failing jp.ac.osakau.apr.RepairMeTest \
  -srcjavafolder /src/main/java/ \
  -srctestfolder /src/test/java/ \
  -binjavafolder /target/classes \
  -bintestfolder /target/test-classes \
  -dependencies astor/examples/libs/junit-4.4.jar \
  -flthreshold 0.5 -seed 10 -maxtime 100 -stopfirst true 

java -cp $ASTOR_JAR fr.inria.main.evolution.AstorMain \
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

java -cp /home/shin/apr-trial/astor/target/astor-0.0.2-SNAPSHOT-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain \
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
  
java -cp /home/shin/apr-trial/astor/target/astor-0.0.2-SNAPSHOT-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain \
  -location astor/examples/math_70 \
  -mode jgenprog \
  -scope package \
  -failing org.apache.commons.math.analysis.solvers.BisectionSolverTest \
  -dependencies /home/shin/.m2/repository/junit/junit/4.12/junit-4.12.jar \
  -srcjavafolder /src/main/java/ \
  -srctestfolder /src/test/java/ \
  -binjavafolder /target/classes \
  -bintestfolder /target/test-classes \
  -flthreshold 0.5 -seed 10 -maxtime 100 -stopfirst true 
  

java -cp /home/shin/apr-trial/astor/target/astor-0.0.2-SNAPSHOT-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain \
  -location apr-example/ -mode jgenprog -scope package
  -failing jp.ac.osakau.apr.CalculatorTest \
  -dependencies /home/shin/.m2/repository/junit/junit/4.12/junit-4.12.jar \
  -srcjavafolder /src/main/java/ \
  -srctestfolder /src/test/java/ \
  -binjavafolder /target/classes \
  -bintestfolder /target/test-classes \
  -flthreshold 0.5 -seed 10 -maxtime 100 -stopfirst true 
  
########
java -cp target/astor-0.0.2-SNAPSHOT-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain \
  -location examples/math_70 \
  -mode jgenprog \
  -scope package \
  -failing org.apache.commons.math.analysis.solvers.BisectionSolverTest \
  -srcjavafolder /src/main/java/ \
  -srctestfolder /src/test/java/ \
  -binjavafolder /target/classes \
  -bintestfolder /target/test-classes \
  -dependencies examples/libs/junit-4.4.jar \
  -flthreshold 0.5 -seed 10 -maxtime 100 -stopfirst true



$ cp target/astor-0.0.2-SNAPSHOT-jar-with-dependencies.jar ./astor.jar

$ java -cp astor.jar fr.inria.main.evolution.AstorMain \
-location ./examples/math_70 \
-mode jgenprog -scope package -failing \
org.apache.commons.math.analysis.solvers.BisectionSolverTest \
-dependencies ./examples/libs/junit-4.4.jar \
-srcjavafolder /src/main/java/ -srctestfolder /src/test/java/ \
-binjavafolder /target/classes \
-bintestfolder /target/test-classes \
-flthreshold 0.5 -seed 10 -maxtime 100 -stopfirst true




### on eclipse
import


fr.inria.main.evolution.AstorMain.java


-location ./examples/math_70
-mode jgenprog -scope package -failing
org.apache.commons.math.analysis.solvers.BisectionSolverTest
-dependencies ./examples/libs/junit-4.4.jar
-srcjavafolder /src/java/
-srctestfolder /src/test/
-binjavafolder /target/classes
-bintestfolder /target/test-classes
-flthreshold 0.5 -seed 10 -maxtime 100 -stopfirst true


### switch to ubuntu

- abbr.



$ java -cp /home/shin/astor/astor.jar fr.inria.main.evolution.AstorMain -location ./examples/math_70 -mode jgenprog -scope package -failing org.apache.commons.math.analysis.solvers.BisectionSolverTest -dependencies ./examples/libs/junit-4.4.jar -srcjavafolder /src/main/java/ -srctestfolder /src/test/java/ -binjavafolder /target/classes -bintestfolder /target/test-classes -flthreshold 0.5 -seed 10 -maxtime 100 -stopfirst true




java \
-cp /home/shin/apr-trial/astor/target/astor-0.0.2-SNAPSHOT-jar-with-dependencies.jar \
fr.inria.main.evolution.AstorMain \
-location apr-example/ -mode jgenprog -scope package \
-failing jp.ac.osakau.apr.CalculatorTest \
-dependencies /home/shin/.m2/repository/junit/junit/4.12/junit-4.12.jar \
-srcjavafolder /src/main/java/ \
-srctestfolder /src/test/java/ \
-binjavafolder /target/classes \
-bintestfolder /target/test-classes \
-flthreshold 0.5 -seed 10 -maxtime 100 -stopfirst true \




-Dlog4j.configuration=log4j.properties \
-Dlogging.level=DEBUG \






java \
  -cp $ASTOR_JAR fr.inria.main.evolution.AstorMain \
  -location apr-example -mode jgenprog -scope package \
  -failing jp.ac.osakau.apr.CalculatorTest \
  -srcjavafolder /src/main/java/ \
  -srctestfolder /src/test/java/ \
  -binjavafolder /target/classes/ \
  -bintestfolder /target/test-classes/ \
  -flthreshold 0.5 -seed 10 -maxtime 100 -stopfirst true

