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
