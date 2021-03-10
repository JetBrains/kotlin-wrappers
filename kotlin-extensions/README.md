## kotlin-extensions

Kotlin wrappers for standard JS objects as well as some helpers required for 
[kotlin-react](https://github.com/JetBrains/kotlin-wrappers/tree/master/kotlin-react).

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
        <artifactId>kotlin-extensions</artifactId>
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

implementation("org.jetbrains:kotlin-extensions:VERSION")
```
