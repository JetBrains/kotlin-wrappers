[![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-styled-next)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-styled-next)

## kotlin-styled-next

This is a reimplementation of `kotlin-styled` in pure Kotlin that doesn't use styled-components. It is designed to be a
drop-in replacement for `kotlin-styled`. It's currently feature-complete and its performance characteristics are very
similar to `kotlin-styled`, but we are still testing and fine-tuning it.

### Maven

```xml
<project>
    <dependency>
        <groupId>org.jetbrains.kotlin-wrappers</groupId>
        <artifactId>kotlin-styled-next</artifactId>
        <version>VERSION</version>
    </dependency>
</project>
```

### Gradle

```kotlin
repositories {
    mavenCentral()
}

implementation("org.jetbrains.kotlin-wrappers:kotlin-styled-next:VERSION")
```

### Getting Started

`kotlin-styled-next` is a great fit for applications built using `kotlin-react`. It gives you not only a type-safe way
of authoring stylesheets, but it also takes care of adding vendor prefixes for your CSS rules, assembling stylesheets,
and injecting them into the DOM.

If you are not familiar with [styled-components](https://www.styled-components.com/) or CSS-in-JS in general, now would
be a good time to [inform yourself about the concept](https://blog.codecarrot.net/all-you-need-to-know-about-css-in-js/)
, because `kotlin-styled-next` implements this exact idea... in Kotlin.

When using just `kotlin-react` you would create a regular CSS file and then you would reference CSS classes from Kotlin
like this:

```kotlin
fun RBuilder.div() {
    div("some-class") {
        +"Hello world!"
    }
}
```

With `kotlin-styled-next` you never have to leave Kotlin:

```kotlin
fun RBuilder.div() {
    styledDiv {
        css {
            padding(vertical = 16.px)

            backgroundColor = Color.green
        }

        +"Hello world!"
    }
}
```

While you can mix markup and styles in one-off scenarios like the example above, most times you would probably want to
have them separated to enable code reuse:

```kotlin
object ComponentStyles : StyleSheet("ComponentStyles", isStatic = true) {
    val wrapper by css {
        padding(vertical = 16.px)

        backgroundColor = Color.green
    }
}

fun RBuilder.div() {
    styledDiv {
        css {
            +ComponentStyles.wrapper
        }

        +"Hello world!"
    }
}
```

The latter is much easier to debug in the browser as well: when inspecting the element you'll see readable class names,
e.g. `class="ComponentStyles-wrapper"` rather than generated ones.

### CSS Properties

The DSL supports most common CSS properties and values, including animations, transforms, shadows, flexbox, and grids.
**SVG properties are not supported yet, contributions are welcome**. However, you can use `put("property", "value")`
syntax for any unsupported property:

```kotlin
fun RBuilder.div() {
    styledDiv {
        css {
            put("will-change", "transform")
        }
    }
}
```

### CSS Selectors

The DSL allows you to use most CSS selectors. See
[CssBuilder](https://github.com/JetBrains/kotlin-wrappers/blob/master/kotlin-css/src/commonMain/kotlin/kotlinx/css/CssBuilder.kt)
for more details. **Contributions are welcome**.

After creating a `StyleSheet` just go ahead and start using it in a component, it will be injected automatically.

```kotlin
object ComponentStyles : StyleSheet("ComponentStyles") {
    // Example of an ".element:hover" selector
    val element by css {
        backgroundColor = Color.green

        hover {
            backgroundColor = Color.red
        }
    }

    // Example of a ".wrapper > *" selector
    val wrapper by css {
        children {
            // CSS properties
        }
    }

    // Example of a ".wrapper > div" selector
    val wrapper by css {
        children("div") {
            // CSS properties
        }
    }

    // Example of a ".wrapper:hover .inner" selector 
    val wrapper by css {
        // CSS properties
    }

    val inner by css {
        backgroundColor = Color.green

        // Use reflection to refer to other elements, it's longer but safer than using hard-coded class names
        ancestorHover("${ComponentStyles.name}-${ComponentStyles::wrapper.name}") {
            backgroundColor = Color.red
        }
    }
}

fun RBuilder.div() {
    styledDiv {
        css {
            +ComponentStyles.element
        }

        +"An element"
    }

    styledDiv {
        css {
            +ComponentStyles.wrapper
        }

        styledDiv {
            css {
                +ComponentStyles.inner
            }

            +"Inner element"
        }
    }
}
```

### Debugging

By default, kotlin-styled-next uses the CSSOM API for stylesheet creation both in development in production modes,
because it's much more performant than setting the text content of a `<style>` tag. This, however, makes the generated
styles harder to debug. To ease debugging, a special API is available in development mode that you can use from the
browser console:

```js
StyledNext.downloadCss() // download all CSS generated by the application
StyledNext.getCss() // get list of all CSS rules
StyledNext.downloadCss("some-classname") // download a .css file with rules that contain some-classname
StyledNext.getCss("some-classname") // get list of CSS rules that contain some-classname
```

Alternatively, you can disable the CSSOM API in development mode altogether by calling `GlobalStyles.useDevSheet()` in
your application code or `StyledNext.useDevSheet(isDev: Boolean = true)` in the browser console.

### Global Styles

To create a global stylesheet use the `CssBuilder` class and the `StyledComponents.injectGlobal()` function:

```kotlin
val styles = CssBuilder(allowClasses = false).apply {
    body {
        margin(0.px)
        padding(0.px)
    }

    "[draggable=\"true\"]" {
        put("user-select", "none")
    }
}

StyledComponents.injectGlobal(styles)
```
