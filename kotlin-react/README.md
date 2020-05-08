[![Bintray](https://img.shields.io/bintray/v/kotlin/kotlin-js-wrappers/kotlin-react)](https://bintray.com/kotlin/kotlin-js-wrappers/kotlin-react)

## kotlin-react

Kotlin wrapper for React library. Major version number of this wrapper matches that of React itself.

### Setup

#### Using Gradle

As for all wrappers, make sure that you have the Bintray repository added to your build file:

```kotlin
repositories {
    // . . .
    jcenter() // or maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
    // . . .
}
```

To start using `kotlin-react` in your Kotlin/JS project, add the following four dependencies to the `dependencies` block for your JavaScript target inside your `build.gradle.kts` or `build.gradle` file:

```kotlin
implementation("org.jetbrains:kotlin-react:16.13.1-pre.104-kotlin-1.3.72")
implementation("org.jetbrains:kotlin-react-dom:16.13.1-pre.104-kotlin-1.3.72")
implementation(npm("react", "16.13.1"))
implementation(npm("react-dom", "16.13.1"))
```

React follows [semantic versioning (semver)](https://semver.org/) principles, meaning you should be able to specify other API-compatible versions of the `npm` dependencies without issue.

#### Other installation methods

For Maven, please see the [Bintray page](https://bintray.com/kotlin/kotlin-js-wrappers/kotlin-react).

For NPM, first run `npm i @jetbrains/kotlin-react`, then run `npm run gen-idea-libs`.

### Getting started

#### Defining an entry point

React needs a root node to render to, in this case a `div` named `root`. Make sure the corresponding `<div id="root">` is present in the HTML file you are using.

```kotlin
fun main() {
    render(document.getElementById("root")) {
        // app child components go here!
        child(MyClassComponent::class) {}
        child(myFunctionalComponent) {}
    }
}
```

#### Creating a React function component with Kotlin

As you might know, the simplest way to define a React component in JavaScript is to write a function. Like this `Welcome` component:

```jsx
import React from 'react';

export function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}
```

Here's what the equivalent Kotlin code looks like: 

```kotlin
import react.*
import react.dom.*

external interface WelcomeProps : RProps {
    var name: String
}

private val welcome = functionalComponent<WelcomeProps> { props -> 
    h1 {
        +"Hello, ${props.name}"
    }
}
```

As you can see, you can use a _DSL_ inside the body of a component: `RBuilder` lets you construct your component's markup using [type-safe builders](https://kotlinlang.org/docs/reference/type-safe-builders.html) on the basis of [kotlinx.html](https://github.com/Kotlin/kotlinx.html). This means that similar to JSX in JavaScript, you can intertwine HTML-like tags with Kotlin logic, string interpolation, loops, etc.

Note that when writing React code in JavaScript the type annotations for props (via `PropTypes`) are optional, but in Kotlin they are not.

##### Using a React function component

By default, you can use the component from another component by using the `child` function:

```kotlin
child(welcome) {
    attrs.name = "Kotlin"
}
```

Because this can be quite cumbersome to write, you can define an `RBuilder` extension function to make the call site a bit cleaner, allowing you to write `welcome("Kotlin")` instead:

```kotlin
fun RBuilder.welcome(name: String) = child(welcome) {
    attrs.name = name
}
```

Alternatively, you can specify an `RBuilder` extension function which passes a handler function, allowing you to write `welcome { name = "Kotlin" }` instead:

```kotlin
fun RBuilder.welcome(handler: WelcomeProps.() -> Unit) = child(welcome) {
    attrs {
        handler()
    }
}
```

#### Creating a React class component with Kotlin

Here's an example of a component defined using a class with a `name` property of type `String`:

```kotlin
import react.*
import react.dom.*

external interface WelcomeProps : RProps {
    var name: String
}

class Welcome: RComponent<WelcomeProps, RState>() {
     override fun RBuilder.render() {
        div {
            +"Hello, ${props.name}"
        }
    }
}
```

##### Using a React class component

Just like functional components, you can use the `child` function to use a React class component:

```kotlin
child(Welcome::class) {
    attrs.name ="Kotlin"
}
```

To make the call site more concise, allowing you to write `welcome("Kotlin")` instead, define an `RBuilder` extension:

```kotlin
fun RBuilder.welcome(name: String) = child(Welcome::class) {
    attrs.name = name
}
```

Alternatively, specify an `RBuilder` extension which passes a `handler` to write `welcome { name = "Kotlin" }` at the call site instead:

```kotlin
fun RBuilder.welcome(handler: WelcomeProps.() -> Unit) = child(Welcome::class) {
    attrs {
        handler()
    }
}
```
#### Using `RBuilder` extensions to structure complex components

If a single component contains a lot of code, you can use `RBuilder` extension functions to group and structure code that belongs together. 

```kotlin
val myComplexComponent = functionalComponent<RProps> {
    myHeader("complex")
    myFooter("!")
}

fun RBuilder.myHeader(adjective: String) {
    h1 {
        +"Hello, $adjective Header!"
    }
    // . . . more complex code
}

fun RBuilder.myFooter(punctuation: String) {
    h1 {
        +"Hello, Footer $punctuation"
    }
    // . . . more complex code
}
```

Note that this is not the same as creating new React components – for the React renderer and reconciler, this is a single component. 

#### Using Hooks

React 16.8 introduced Hooks as a novel way of using state and other React features without writing a class. `kotlin-react` also supports working with Hooks.

##### The `useState` Hook

You can use the `useState` Hook when you want to keep track of state without the need for a class component. Consider the following implementation of a counter inside a `functionalComponent`:

```kotlin
val counter = functionalComponent<RProps> {
    val (count, setCount) = useState(0)
    button {
        attrs.onClickFunction = { setCount(count + 1) }
        +count.toString()
    }
}
```

Calling `useState` returns a pair (that is directly destructured): a reference to your state (here, `count` of type `Int`), and a function that can be used to set the state (here, `setCount` of type `RSetState<Int>`).

Note that unlike properties in a React class component, the `setCount` function can be called without having to use a `setState` lambda.

To learn more about the State Hook, check out the [official React documentation](https://reactjs.org/docs/hooks-state.html).

##### The `useEffect` Hook

The Effect Hook can be used to perform side effects without the need for a class component, such as querying an API or establishing a connection. Consider the following implementation of a `functionalComponent` which `fetch`es a random fact and displays it in a `h3` tag:

```kotlin
val randomFact = functionalComponent<RProps> {
    val (randomFact, setRandomFact) = useState<String?>(null)
    useEffect(listOf()) {
        window.fetch("http://numbersapi.com/42").then { 
            it.text().then { fact -> setRandomFact(fact) }
        }
    }
    h3 { +(randomFact ?: "Fetching...") }
}
```

Note that in this example, `useEffect` gets passed a list of (empty) dependencies. If `listOf()` is omitted, `useEffect` will be called after each invocation of `setRandomFact`, resulting in an endless loop.

To learn more about the Effect Hook, check out the [official React documentation](https://reactjs.org/docs/hooks-effect.html).

### Type-safe inline styles

There is no built-in capability for writing inline styles in a type-safe manner. However, it can be done by adding a 
dependency on [kotlin-css](https://github.com/JetBrains/kotlin-wrappers/tree/master/kotlin-css) and a simple utility function.

```kotlin
var Tag.style: RuleSet
    get() = error("style cannot be read from props")
    set(value) = jsStyle {
        CSSBuilder().apply(value).declarations.forEach {
            this[it.key] = when (it.value) {
                !is String, !is Number -> it.value.toString()
                else -> it.value
            }
        }
    }
    
fun Tag.style(handler: RuleSet) {
    style = handler
}
```

You might also be interested in giving the Kotlin wrappers for `styled-components` a try, which you can find under `kotlin-styled`.

### Declaring static fields and lifecycle methods (contextType, getDerivedStateFromProps(), etc.)

There is currently no easy way to declare static members from Kotlin/JS (see [KT-18891](https://youtrack.jetbrains.com/issue/KT-18891)), 
so please do the following instead:

```kotlin
class MyComponent: RComponent<MyComponentProps, MyComponentState>() {
    companion object : RStatics<MyComponentProps, MyComponentState, MyComponent, Nothing>(MyComponent::class) {
        init {
            getDerivedStateFromProps = { props, state ->
                // ...
            }
        }
    }
}
```

### Internals

[Imports.kt](src/main/kotlin/react/Imports.kt) contains type definitions for React. The remaining classes 
([React.kt](src/main/kotlin/react/React.kt) and others) provide higher-level APIs on top of that definition.
