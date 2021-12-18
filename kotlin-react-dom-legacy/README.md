[![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-dom-legacy)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-dom-legacy)

## kotlin-react-dom-legacy

Kotlin wrapper for React DOM library. Major version number of this wrapper matches that of React DOM itself.

## kotlin-react-dom vs kotlin-react-dom-legacy

`kotlin-react-dom` does not depend on `kotlinx.html`, the HTML typings it provides are generated from TypeScript types
directly. They are therefore more complete and up-to-date.

`kotlin-react-dom-legacy` depends on `kolinx.html` and its HTML typings are maintained manually.

See [CHANGELOG.md](../CHANGELOG.md#pre282) for more details.

### Maven

```xml
<project>
    <dependency>
        <groupId>org.jetbrains.kotlin-wrappers</groupId>
        <artifactId>kotlin-react-dom-legacy</artifactId>
        <version>VERSION</version>
    </dependency>
</project>
```

### Gradle

```kotlin
repositories {
    mavenCentral()
}

implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom-legacy:VERSION")
```
