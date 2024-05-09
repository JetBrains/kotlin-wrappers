[![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-legacy)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-legacy)

## kotlin-react-legacy

Kotlin wrapper for the React library. The major version number of this wrapper matches that of React itself.

## kotlin-react vs kotlin-react-legacy

`kotlin-react` only supports the new DSL for React elements (`ChildrenBuilder`, aka "no attrs"),
while `kotlin-react-legacy`
provides the familiar `RBuilder` DSL.

See [CHANGELOG.md](../CHANGELOG.md#pre282) for more details.

> [!WARNING]
> `kotlin-react-legacy` is deprecated

### Maven

```xml
<project>
    <dependency>
        <groupId>org.jetbrains.kotlin-wrappers</groupId>
        <artifactId>kotlin-react-legacy</artifactId>
        <version>VERSION</version>
    </dependency>
</project>
```

### Gradle

```kotlin
repositories {
    mavenCentral()
}

implementation("org.jetbrains.kotlin-wrappers:kotlin-react-legacy:VERSION")
```

### Getting started

#### Defining an entry point

React needs a root node to render to, in this case a `div` named `root`. Make sure the corresponding `<div id="root">`
is present in the HTML file you are using.

```kotlin
fun main() {
    render(document.getElementById("root")) {
        // app child components go here!
        child(MyClassComponent::class) {}
        child(myFunctionComponent) {}
    }
}
```

#### Creating a React function component with Kotlin

As you might know, the simplest way to define a React component in JavaScript is to write a function. Like
this `Welcome` component:

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

external interface WelcomeProps : Props {
    var name: String
}

private val welcome = fc<WelcomeProps> { props ->
    h1 {
        +"Hello, ${props.name}"
    }
}
```

As you can see, you can use a _DSL_ inside the body of a component: `RBuilder` lets you construct your component's
markup using [type-safe builders](https://kotlinlang.org/docs/reference/type-safe-builders.html) on the basis
of [kotlinx.html](https://github.com/Kotlin/kotlinx.html). This means that similar to JSX in JavaScript, you can
intertwine HTML-like tags with Kotlin logic, string interpolation, loops, etc.

Note that when writing React code in JavaScript the type annotations for props (via `PropTypes`) are optional, but in
Kotlin they are not.

##### Using a React function component

By default, you can use the component from another component by using the `child` function:

```kotlin
child(welcome) {
    attrs.name = "Kotlin"
}
```

Because this can be quite cumbersome to write, you can define an `RBuilder` extension function to make the call site a
bit cleaner, allowing you to write `welcome("Kotlin")` instead:

```kotlin
fun RBuilder.welcome(name: String) = child(welcome) {
    attrs.name = name
}
```

Alternatively, you can specify an `RBuilder` extension function which passes a handler function, allowing you to
write `welcome { name = "Kotlin" }` instead:

```kotlin
fun RBuilder.welcome(handler: WelcomeProps.() -> Unit) = child(welcome) {
    attrs {
        handler()
    }
}
```

#### Creating a React class component with Kotlin

Here's an example of a component defined using a class with a `name` property of type `String` and a matching component
state to hold the `name` property:

```kotlin
import react.*
import react.dom.*

external interface WelcomeProps : Props {
    var name: String
}

external interface WelcomeState : State {
    var name: String
}

@JsExport
class Welcome(props: WelcomeProps) : RComponent<WelcomeProps, WelcomeState>(props) {

    override fun WelcomeState.init(props: WelcomeProps) {
        name = props.name
    }

    override fun RBuilder.render() {
        div {
            +"Hello, ${state.name}"
        }
    }
}
```

##### Using a React class component

Just like function components, you can use the `child` function to use a React class component:

```kotlin
child(Welcome::class) {
    attrs.name = "Kotlin"
}
```

To make the call site more concise, allowing you to write `welcome("Kotlin")` instead, define an `RBuilder` extension:

```kotlin
fun RBuilder.welcome(name: String) = child(Welcome::class) {
    attrs.name = name
}
```

Alternatively, specify an `RBuilder` extension which passes a `handler` to write `welcome { name = "Kotlin" }` at the
call site instead:

```kotlin
fun RBuilder.welcome(handler: WelcomeProps.() -> Unit) = child(Welcome::class) {
    attrs {
        handler()
    }
}
```

#### Using `RBuilder` extensions to structure complex components

If a single component contains a lot of code, you can use `RBuilder` extension functions to group and structure code
that belongs together.

```kotlin
val myComplexComponent = fc<Props> {
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

Note that this is not the same as creating new React components – for the React renderer and reconciler, this is a
single component.

#### Using Hooks

React 16.8 introduced Hooks as a novel way of using state and other React features without writing a
class. `kotlin-react-legacy` also supports working with Hooks.

##### The `useState` Hook

You can use the `useState` Hook when you want to keep track of state without the need for a class component. Consider
the following implementation of a counter inside a `fc`:

```kotlin
val counter = fc<Props> {
    val (count, setCount) = useState(0)
    button {
        attrs.onClickFunction = { setCount(count + 1) }
        +count.toString()
    }
}
```

Calling `useState` returns a pair (that is directly destructured): a reference to your state (here, `count` of
type `Int`), and a function that can be used to set the state (here, `setCount` of type `RSetState<Int>`).

Note that unlike properties in a React class component, the `setCount` function can be called without having to use
a `setState` lambda.

It is also possible to use the State Hook via
Kotlin's [delegation syntax](https://kotlinlang.org/docs/reference/delegated-properties.html), which can simplify the
code even more:

```kotlin
val counter = fc<Props> {
    var count by useState(0)
    button {
        attrs.onClickFunction = { count += 1 }
        +count.toString()
    }
}
```

In this example, assignments to the `count` variable are automatically wrapped with the appopriate hook calls under the
hood.

To learn more about the State Hook, check out
the [official React documentation](https://reactjs.org/docs/hooks-state.html).

##### The `useEffect` Hook

The Effect Hook can be used to perform side effects without the need for a class component, such as querying an API or
establishing a connection. Consider the following implementation of a `fc`
which `fetch`es a random fact and displays it in a `h3` tag:

```kotlin
val randomFact = fc<Props> {
    val (randomFact, setRandomFact) = useState<String?>(null)
    useEffect(*emptyArray()) { // or useEffectOnce
        window.fetch("http://numbersapi.com/42").then {
            it.text().then { fact -> setRandomFact(fact) }
        }
    }
    h3 { +(randomFact ?: "Fetching...") }
}
```

Note that in this example, `useEffect` gets passed a list of (empty) dependencies. If `*emptyArray()` is
omitted, `useEffect` will be called after each invocation of `setRandomFact`, resulting in an endless loop.

We might want to set up a subscription to some external data source. In that case, it is important to clean up so that
we don't introduce a memory leak. The following example illustrates how to write effects with cleanup:

```kotlin
// Same example in JavaScript: https://codesandbox.io/s/jvvkoo8pq3?file=/src/index.js
data class Hit(val objectID: String, val url: String, val title: String)
data class Data(val hit: List<Hit>)

val searchResults = fc<Props> {
    var data by useState(Data(emptyList()))
    var query by useState("react")

    useEffect(listOf(query)) {
        var ignore = false

        val job = MainScope().launch {
            window.fetch("https://hn.algolia.com/api/v1/search?query=${query}").then {
                if (!ignore)
                    it.text().then { fetched -> data = JSON.parse(fetched) }
            }
        }

        cleanup {
            job.cancel()
            ignore = true
        }
    }

    input {
        attrs {
            value = query
            onChangeFunction = {
                query = (it.target as HTMLInputElement).value
            }
        }
    }
    ul {
        for (item in data.hit) {
            li {
                key = item.objectID
                a {
                    attrs {
                        href = item.url
                    }
                    +item.title
                }
            }
        }
    }
}
```

To learn more about the Effect Hook, check out
the [official React documentation](https://reactjs.org/docs/hooks-effect.html).

##### The "Custom" Hook

Building your own Hooks lets you extract component logic into reusable functions.

A custom Hook is a Kotlin function whose name starts with "use" and that may call other Hooks:

```kotlin
fun useCards(): List<String> {
    val (cardsInDeck, setCardsInDeck) = useState(emptyList<String>())

    useEffectOnce {
        val job = MainScope().launch {
            val results = List(52) { i -> i.toString() }
            setCardsInDeck(results)
        }

        cleanup {
            job.cancel()
        }
    }

    return cardsInDeck
}
// now we can use this hook in any component!
val randomFact = fc<Props> {
    val cardsInDeck = useCards()
    h3 {
        for (card in cardsInDeck) {
            p {
                +card
            }
        }
    }
}
```

To learn more about the Custom Hook, check out
the [official React documentation](https://reactjs.org/docs/hooks-custom.html).

### Type-safe inline styles

There is no built-in capability for writing inline styles in a type-safe manner. However, it can be done by adding a
dependency on [kotlin-css](https://github.com/JetBrains/kotlin-wrappers/tree/master/kotlin-css) and a simple utility
function.

```kotlin
var Tag.style: RuleSet
    get() = error("style cannot be read from props")
    set(value) = jsStyle {
        CssBuilder().apply(value).declarations.forEach {
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

You might also be interested in giving the Kotlin wrappers for `styled-components` a try, which you can find
under `kotlin-styled`.

### Declaring static fields and lifecycle methods (contextType, getDerivedStateFromProps(), etc.)

There is currently no easy way to declare static members from Kotlin/JS (
see [KT-18891](https://youtrack.jetbrains.com/issue/KT-18891)), so please do the following instead:

```kotlin
class MyComponent : RComponent<MyComponentProps, MyComponentState>() {
    companion object : RStatics<MyComponentProps, MyComponentState, MyComponent, Nothing>(MyComponent::class) {
        init {
            getDerivedStateFromProps = { props, state ->
                // ...
            }
        }
    }
}
```
