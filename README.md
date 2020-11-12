# java_maven_template
Java Maven template using IntelliJ

# steps to make this template
- Open IntelliJ
- File > New > Project
- Select Maven. Do not tick `Create from archetype` so we will use the default Maven directory structure. Select JDK version, here we selected 11. Click Next.
- Fill up Name, Location and the Artifact Coordinates - GroupId, ArtifactId, Version. Click Finish.

# add maven compiler plugin
- Open pom.xml
- Code > Generate > Dependency
- type `maven-compiler-plugin` and select `org.apache.maven.plugins:maven-compiler-plugin:3.8.1`. Click Add.
- Import changes if asked.

# add junit for unit testing
- Open pom.xml
- Code > Generate > Dependency
- type `junit` and select `junit:junit:4.13.1`. Click Add.
- Import changes if asked.

# specify the maven compiler version to use
- add the following to the pom.xml <project> element
```
<properties>
    <maven.compiler.source>11</maven.compiler.source>
    <maven.compiler.target>11</maven.compiler.target>
    <maven.compiler.release>11</maven.compiler.release>
</properties>
```
- Import changes if asked.
    
# add `Playground` java class
- right click on src/main/java folder. Select New > Java Class
- type `com.wembikon.javamaven.Playground` to automatically create the package and file for the corresponding class.

# add `Playground` unit test java class
- right click on the `Playground` class name. Select Show Context Actions > Create Test.
- just use the default class name which is `PlaygroundTest` and destination package.
- select the methods to test e.g. getData
- finally select the Testing library version: JUnit4. Press OK.
