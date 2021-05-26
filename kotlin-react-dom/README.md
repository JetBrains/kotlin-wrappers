[![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-dom)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-dom)

## kotlin-react-dom

Kotlin wrapper for React DOM library. Major version number of this wrapper matches that of React DOM itself.

### Maven

```xml
<project>
    <dependency>
        <groupId>org.jetbrains.kotlin-wrappers</groupId>
        <artifactId>kotlin-react-dom</artifactId>
        <version>VERSION</version>
    </dependency>
</project>
```

### Gradle

```kotlin
repositories {
    mavenCentral()
}

implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:VERSION")
```

### Internals
[Imports.kt](src/main/kotlin/react/dom/Imports.kt) contains type definitions for ReactDOM. The remaining classes 
([ReactDOM.kt](src/main/kotlin/react/dom/ReactDOM.kt) and others) provide higher-level APIs on top of that definition.
