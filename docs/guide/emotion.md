# `kotlin-emotion`

## Get started

Defining your CSS styles with `kotlin-emotion` is very similar to creating a typical CSS stylesheet, and
most CSS properties match the CSS specification. However, there are a few things to keep in mind when defining properties
with Kotlin. This guide is designed to help you get up and running fast.

To style an HTML element, first, create a `css` block. Next, define your CSS properties. The
example below isn't the most elegant `div` tag, but it does showcase some common CSS properties and how to define
them. Once you have your frontend up and running, have fun and experiment!

> If you need a starter project, refer to
> [Build a web application with React and Kotlin/JS — tutorial](https://kotlinlang.org/docs/js-react.html).

```kotlin
div {
    css {
        position = Position.fixed
        boxSizing = BoxSizing.borderBox

        opacity = number(.75)
        overflow = Overflow.hidden
        visibility = Visibility.visible

        width = 70.pct
        margin = Auto.auto
        padding = 10.px

        border = Border(4.px, LineStyle.solid)
        borderColor = Color("purple")
        borderRadius = 6.em
        backgroundImage = linearGradient(angle = 90.deg, Color("#8150fe"), Color("#e3465b"))

        color = NamedColor.white
        fontSize = 22.pt
        fontWeight = FontWeight.bold
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

Properties that support `Number` or `Percent` values accept various CSS number types (e.g., `em`, `px`, pt, `cm`, `in`, `pct`).
You can also define `auto` values, for example:

* `width = 10.px`
* `width = 10.em`
* `width = 100.pct`
* `margin = Auto.auto`

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
        backgroundSize = BackgroundSize.contain
        backgroundRepeat = BackgroundRepeat.noRepeat
        backgroundImage = url("https://kotlinlang.org/docs/images/kotlin-logo.png")
    }
}
```

## How it works

By default, a unique class is generated for each HTML element. Here's an example of a rendered `div`.

```html

<div>
    <div class="css-vawiuz">Welcome to the kotlin-emotion wrapper</div>
</div>
```

Then, each class/style is defined in the rendered `head` HTML block.

```html

<style data-emotion="css" data-s="">.css-vawiuz {
    margin: auto;
    width: 50pc;
    padding: 10px;
    font-size: 22pt;
    color: #FFFFFF;
    font-weight: bold;
    border: 1px solid;
    border-color: #800080;
    background-image: linear-gradient(90deg, #8150fe, #e3465b);
    border-radius: 6em;
}
</style>
```

You can also specify a class name. This is helpful if you've already defined an external CSS file,
for example, `index.css`, and you'd like to add additional properties to your HTML element.

```kotlin
css(ClassName("kotlin-emotion")) {
    width = 50.pc
    margin = Auto.auto
}
```

Providing a class name with additional CSS properties renders:

```html

<div class="kotlin-emotion css-vawiuz">Welcome to the kotlin-emotion wrapper</div>
```

## Dynamic CSS

One of the most powerful features of `kotlin-emotion` is the ability to build dynamic CSS output based
on your component `Props` and app state. In the example below, if the `accountBalance` is positive, the
text will be `green`. Otherwise, it's `red`.

```kotlin
css {
    color = if (it.accountBalance >= 0) NamedColor.green else NamedColor.red
}
```
