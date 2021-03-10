## kotlin-mocha

Kotlin wrapper for Mocha test framework. Major version number of this wrapper matches that of Mocha itself.

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
        <artifactId>kotlin-mocha</artifactId>
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

implementation("org.jetbrains:kotlin-mocha:VERSION")
```
