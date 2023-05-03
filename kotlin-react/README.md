[![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-react)

# kotlin-react

Kotlin wrapper for the React library. The major version number of this wrapper matches that of React itself.

## kotlin-react vs kotlin-react-legacy

`kotlin-react` only supports the new DSL for React elements (`ChildrenBuilder`, aka "no attrs"),
while `kotlin-react-legacy` provides the familiar `RBuilder` DSL.

See [CHANGELOG.md](../CHANGELOG.md#pre282) for more details.

## Setup

### Maven

```xml
<project>
    <dependency>
        <groupId>org.jetbrains.kotlin-wrappers</groupId>
        <artifactId>kotlin-react</artifactId>
        <version>VERSION</version>
    </dependency>
</project>
```

### Gradle

```kotlin
repositories {
    mavenCentral()
}

implementation("org.jetbrains.kotlin-wrappers:kotlin-react:VERSION")
```

## Usage

Please refer to the [Kotlin React guide](../docs/guide/react.md) for how to use the Kotlin React DSL.
