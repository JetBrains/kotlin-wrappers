## kotlin-css

Platform-agnostic CSS primitives.

### Installation

To use `kotlin-css` in the browser, install `kotlin-css` and `kotlin-css-js` using npm or Yarn:

1. `npm i @jetbrains/kotlin-css @jetbrains/kotlin-css-js`

2. `npm run gen-idea-libs` 

To use `kotlin-css` on the server, install `kotlin-css` and `kotlin-css-jvm` using Maven or Gradle.

See the [Bintray page](https://bintray.com/kotlin/kotlin-js-wrappers/kotlin-css) for Maven and Gradle installation 
instructions.

### Getting Started

`kotlin-css` is a DSL for authoring stylesheets in Kotlin. The DSL supports most common CSS properties and values, 
including animations, transforms, shadows, flexbox, and grids. **SVG properties are not supported yet, 
contributions are welcome**.

`kotlin-css` is a low-level library. After constructing a stylesheet you can serialize it into a string and do with it 
as you please:

```kotlin
val styles = CSSBuilder().apply {
    body {
        margin = 0.px
        padding = 0.px
    }
}

styles.toString()
```

When writing CSS for the browser you should probably use 
[kotlin-styled](https://github.com/JetBrains/kotlin-wrappers/tree/master/kotlin-styled) instead. It provides a 
user-friendly facade to `kotlin-css`.