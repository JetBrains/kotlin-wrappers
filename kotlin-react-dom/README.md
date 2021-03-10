## kotlin-react-dom

Kotlin wrapper for React DOM library. Major version number of this wrapper matches that of React DOM itself.

### Maven

```xml
<project>
    <repositories>
        <repository>
            <id>space-kotlin-js-wrappers</id>
            <url>https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers</url>
        </repository>
    </repositories>
    
    <dependency>
        <groupId>org.jetbrains</groupId>
        <artifactId>kotlin-react-dom</artifactId>
        <version>VERSION</version>
    </dependency>
</project>
```

### Gradle

```kotlin
repositories {
    maven {
        url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers")
    }
}

implementation("org.jetbrains:kotlin-react-dom:VERSION")
```

### Internals
[Imports.kt](src/main/kotlin/react/dom/Imports.kt) contains type definitions for ReactDOM. The remaining classes 
([ReactDOM.kt](src/main/kotlin/react/dom/ReactDOM.kt) and others) provide higher-level APIs on top of that definition.
