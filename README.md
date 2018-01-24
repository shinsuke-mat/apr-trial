# a

export PATH=$PATH:/d/prog/apache-maven-3.5.2/bin/




### cloninig
git clone git@github.com:SpoonLabs/astor.git
cd astor

### build
// mvn package
mvn package -DskipTests=true

### confirm built jav
ls target/

### compile example project
$ cd examples/math_70/
$ mvn compile test

Tests run: 2181, Failures: 0, Errors: 1, Skipped: 0


unalias java


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
-srcjavafolder /src/java/ -srctestfolder /src/test/
-binjavafolder /target/classes
-bintestfolder /target/test-classes
-flthreshold 0.5 -seed 10 -maxtime 100 -stopfirst true


### switch to ubuntu

- abbr.



$ java -cp /home/shin/astor/astor.jar fr.inria.main.evolution.AstorMain -location ./examples/math_70 -mode jgenprog -scope package -failing org.apache.commons.math.analysis.solvers.BisectionSolverTest -dependencies ./examples/libs/junit-4.4.jar -srcjavafolder /src/main/java/ -srctestfolder /src/test/java/ -binjavafolder /target/classes -bintestfolder /target/test-classes -flthreshold 0.5 -seed 10 -maxtime 100 -stopfirst true




java \
-Dlog4j.configuration=log4j.properties \
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


-Dlogging.level=DEBUG \
