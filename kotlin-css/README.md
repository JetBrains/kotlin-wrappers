[![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-css)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-css)

## kotlin-css

Platform-agnostic CSS primitives.

### Maven

```xml
<project>
    <dependency>
        <groupId>org.jetbrains.kotlin-wrappers</groupId>
        <artifactId>kotlin-css</artifactId>
        <version>VERSION</version>
    </dependency>
</project>
```

### Gradle

```kotlin
repositories {
    mavenCentral()
}

implementation("org.jetbrains.kotlin-wrappers:kotlin-css:VERSION")
```

### Getting Started

`kotlin-css` is a DSL for authoring stylesheets in Kotlin. The DSL supports most common CSS properties and values, 
including animations, transforms, shadows, flexbox, and grids. **SVG properties are not supported yet, 
contributions are welcome**.

`kotlin-css` is a low-level library. After constructing a stylesheet you can serialize it into a string and do with it 
as you please:

```kotlin
val styles = CSSBuilder().apply {
    body {
        margin(0.px)
        padding(0.px)
    }
}

styles.toString()
```

When writing CSS for the browser you should probably use 
[kotlin-styled](https://github.com/JetBrains/kotlin-wrappers/tree/master/kotlin-styled) instead. It provides a 
user-friendly facade to `kotlin-css`.
