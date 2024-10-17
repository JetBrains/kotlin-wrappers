[![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-css)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-css)

# Module kotlin-css

Platform-agnostic CSS primitives.

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
val styles = CssBuilder().apply {
    body {
        margin = Margin(0.px)
        padding = Padding(0.px)

        animation(
            duration = 500.ms,
            iterationCount = IterationCount.infinite,
            fillMode = FillMode.backwards,
            direction = AnimationDirection.alternate,
        ) {
            to {
                backgroundPosition = RelativePosition.left
            }
        }

        backgroundImage = linearGradient(90.deg) {
            colorStop(Color.black)
            colorStop(Color.transparent)
        }

        transform {
            translateY(0.px)
        }
    }
}

styles.toString()
```

When writing CSS for the browser you should probably use
[kotlin-styled-next](https://github.com/JetBrains/kotlin-wrappers/tree/master/kotlin-styled-next) instead. It provides a
user-friendly facade to `kotlin-css`.
