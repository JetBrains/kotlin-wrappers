[![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-dom-legacy)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-dom-legacy)

# Module kotlin-react-dom-legacy

Kotlin wrapper for the React DOM library. The major version number of this wrapper matches that of React DOM itself.

> [!WARNING]
> `kotlin-react-dom-legacy` is deprecated

## kotlin-react-dom vs kotlin-react-dom-legacy

`kotlin-react-dom` does not depend on `kotlinx.html`, the HTML typings it provides are generated from TypeScript types
directly. They are therefore more complete and up-to-date.

`kotlin-react-dom-legacy` depends on `kolinx.html` and its HTML typings are maintained manually.

See [CHANGELOG.md](../CHANGELOG.md#pre282) for more details.

### Gradle

```kotlin
repositories {
    mavenCentral()
}

implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom-legacy:VERSION")
```
