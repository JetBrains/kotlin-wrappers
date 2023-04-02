[![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-emotion)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-emotion)

# kotlin-emotion

Kotlin wrapper for [Emotion](https://emotion.sh/) library

## Get started

Defining your React css styles with `kotlin-emotion` is very similar to creating a typical css stylesheet, and
most css properties match the css specification. However, there are a few things to keep in mind when defining properties
with Kotlin. This guide is designed to help you get you up and running fast.

To create a React HTML element style, first, create a `css` block. Next, define your css properties. The
example below isn't the most elegant `div` tag, but it does showcase some common css properties and how to define
them. Once you have your frontend up and running, have fun and experiment!

> If you need a starter project, refer to
> [Build a web application with React and Kotlin/JS — tutorial](https://kotlinlang.org/docs/js-react.html).

```kotlin
div {

    css {
        margin = Auto.auto
        width = 70.pct
        padding = 10.px
        fontSize = 22.pt
        color = NamedColor.white
        fontWeight = FontWeight.bold
        border = Border(4.px, LineStyle.solid)
        borderColor = Color("purple")
        backgroundImage = linearGradient(angle = 90.deg, Color("#8150fe"), Color("#e3465b"))
        borderRadius = 6.em
        boxSizing = BoxSizing.borderBox
        position = Position.fixed
        opacity = number(.75)
        overflow = Overflow.hidden
        visibility = Visibility.visible
    }

    +"Welcome to the kotlin-emotion wrapper"

}
```

### Colors

You can use `NamedColor` or specify an HTML color string with `Color`.

* `NamedColor.white`
* `Color("#8150fe")`
* `Color("purple")`

### Numbers & percents

Properties that support `Number` or `Percent` values accept various css number types (e.g., em, px, pt, cm, in, pct).
You can also define `auto` values, for example:

* `margin = Auto.auto`
* `width = 10.px`
* `width = 10.em`
* `width = 100.pct`

These number types are included in the `csstype` package. For more information, refer to (_Number - Length.kt_).

### Fonts

You can use `fontFace` to define custom fonts. Then, you can specify your `fontFamily` with your custom name.

```kotlin
css {
    fontFace {
        this.fontFamily = "OpenSans"
        this.src = "url(./fonts/opensans.ttf)"
    }
    fontFamily = string("OpenSans")
}
```

### Background images

Add background images with `url`:

```kotlin
div {
    css {
        height = 150.px
        backgroundImage = url("https://kotlinlang.org/docs/images/kotlin-logo.png")
        backgroundSize = BackgroundSize.contain
        backgroundRepeat = BackgroundRepeat.noRepeat
    }
}
```

## How it works

By default, a unique class is rendered for each HTML element. Here's an example of a rendered `div`.

```html
<div><div class="css-vawiuz">Welcome to the kotlin-emotion wrapper</div></div>
```

Then, each class/style is defined in the rendered `head` HTML block.

```html
<style data-emotion="css" data-s="">.css-vawiuz{margin:auto;width:50pc;padding:10px;font-size:22pt;
color:#FFFFFF;font-weight:bold;border:1px solid;border-color:#800080;
background-image:linear-gradient(90deg,#8150fe,#e3465b);border-radius:6em;}
</style>
```

You can also specify a class name. This is helpful if you've already defined an external css file,
for example, `index.css`, and you'd like to add additional properties to your HTML element.

```kotlin
css(ClassName("kotlin-emotion")) {
    margin = Auto.auto
    width = 50.pc
}
```

Providing a class name with additional css properties renders:

```html
<div class="kotlin-emotion css-vawiuz">Welcome to the kotlin-emotion wrapper</div>
```

## Dynamic css

One of the most powerful features of `kotlin-emotion` is the ability to build dynamic css output based
on your component `Props` and app state. In the example below, if the `accountBalance` is positive, the
text will be `green`. Otherwise, it's `red`.

```kotlin
css {
    color = if (it.accountBalance >= 0 )
        NamedColor.green
    else
        NamedColor.red
}
```

## Reusable css

Here's an example of how to create a global button to use throughout your project. First, define
the `css` block:

```kotlin
private fun ButtonHTMLAttributes<HTMLButtonElement>.buttonClass() {
    css {
        borderRadius = 20.px
        width = 200.px
        backgroundColor = Color("#0087ff")
        color = Color("#e2e2ef")
        padding = 10.px
    }
}
```

Next, create your button:

```kotlin
fun ChildrenBuilder.appButton(text: String, buttonEvent: () -> Unit) {
    button {
        buttonClass()
        +text
        onClick = {
            buttonEvent.invoke()
        }
    }
}
```

Now, you can use your styled button anywhere:

```kotlin
div {

    css {
        display = Display.flex
        alignItems = AlignItems.center
        padding = 14.px
    }

    h2 {

        css {
            width = 30.pc
        }

        +"Global Button"
    }

    appButton("Click Me", {})

}
```

Inside the `css` block, we also have access to the `PropertiesBuilder`. Alternatively, you can define
global properties:

```kotlin
private fun PropertiesBuilder.commonProperties() {
    display = Display.flex
    alignItems = AlignItems.center
    padding = 14.px
}
```

Next, you can call them as needed inside your `css` block:

```kotlin
css {
    commonProperties()
}
```
