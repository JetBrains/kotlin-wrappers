# Kotlin React usage

## Defining an entry point

React needs a root node to render to.
Use the `createRoot(htmlElement)` function to set the given `htmlElement` as a `Root` element,
and call `Root.render(reactNode)` to inject the corresponding `ReactNode` as the root:

```kotlin
fun main() {
    createRoot(document.getElementById("root")).render(App.create())
}

private val App = FC<Props> {
    +"Hello, world!"
}
```

In this example, we made sure a `<div id="root">` is present in our HTML file, and we use that `<div>` as root.

We'll explain the other parts of this code in the next sections.

## Defining a React component in Kotlin

As you might know, the simplest way to define a React component in JavaScript is to write a function,
like this `Welcome` component:

```jsx
import React from 'react';

export function Welcome(props) {
    return <h1>Hello, {props.name}</h1>;
}
```

In Kotlin, we use the `FC` function to define a component (where FC stands for "functional component").
So the equivalent code looks like this:

```kotlin
import react.*
import react.dom.html.ReactHTML.h1

external interface WelcomeProps : Props {
    var name: String
}

private val Welcome = FC<WelcomeProps>("Welcome") { props ->
    h1 {
        +"Hello, ${props.name}"
    }
}
```

`FC` is a generic function that requires us to specify the type of props for our component.
This is why we specify this type between chevrons in the call: `FC<WelcomeProps>`.

When writing React code in JavaScript, the type annotations for props (via `PropTypes`) are optional, but in Kotlin
they are not. This is why we need an explicit interface to define the type of the props for our component.
If we don't need any custom props, we can also use the provided basic `Props` type without defining a custom interface.

We also specify the name of the component as argument to the `FC` function. This is actually optional too.
If we don't provide a name, the component tree in React dev tools will look slightly less nice.

As you can see, you can use a *DSL* inside the body of a component: `ChildrenBuilder` lets you construct your component's
markup using [type-safe builders](https://kotlinlang.org/docs/reference/type-safe-builders.html).
All the standard HTML elements are available in the `react.dom.html.ReactHTML` object and can be used in this DSL, like
the `h1` in the example above.
This means that, similar to JSX in JavaScript, you can intertwine HTML-like tags with Kotlin logic, string interpolation,
loops, etc.

### Defining a component without properties

As we've seen, if you don't need any special props in your component, you can use `FC<Props>`.
If you want to simplify, you can use the `VFC` (Void Function Component) convenience function instead:

```kotlin
private val SimpleComponent = VFC("SimpleComponent") {
    // ...
}
```

`VFC` is also a typealias for the `FC<Props>`.

### What about class components?

Class components (which allow state and lifecycle handlers) are discouraged now, and shouldn't be used in new code.
Please define your components as functions instead, and use hooks to store the state or run effects.

## Using a React component

You can use a component in mainly 2 ways.

### ...as a child

The most common is to use the component as part of the DSL in contexts where a `ChildrenBuilder` is available,
usually nested inside other components or HTML elements.
Just call the component like a function with a lambda parameter, so it looks like a block:

```kotlin
div {
    Welcome {
        name = "Kotlin"
    }
}
```

When used like this, the component is automatically appended as a child of the parent component.

Inside the block of your component, you can set values for its props, or nest other components.

### ...as a standalone component

Sometimes, you need to create a standalone "instance" of a component without attaching it as a child of the parent
component.
This is the case when defining the root component for instance.
This may also be necessary if a library requires you to pass a component as a property of another component.

To do so, simply call `.create()` on your component (you don't need a `ChildrenBuilder` in this case):

```kotlin
val myComponentInstance = Welcome.create {
    name = "Kotlin"
}
```

## Using `ChildrenBuilder` extensions to structure complex components [bad advice]

If a single component contains a lot of code, you can use `ChildrenBuilder` extension functions to group and structure
code that belongs together.

```kotlin
val myComplexComponent = FC<Props> {
    myHeader("complex")
    myFooter("!")
}

fun ChildrenBuilder.myHeader(adjective: String) {
    h1 {
        +"Hello, $adjective Header!"
    }
    // . . . more complex code
}

fun ChildrenBuilder.myFooter(punctuation: String) {
    h1 {
        +"Hello, Footer $punctuation"
    }
    // . . . more complex code
}
```

Note that this is not the same as creating new React components – for the React renderer and reconciler, this is a
single component.

## Using Hooks

React 16.8 introduced Hooks as a novel way of using state and other React features without writing a class.

### The `useState` Hook

You can use the `useState` Hook when you want to keep track of state without the need for a class component. Consider
the following implementation of a counter inside a `FC`:

```kotlin
val counter = FC<Props> {
    val (count, setCount) = useState(0)
    button {
        onClick = { setCount(count + 1) }
        +count.toString()
    }
}
```

Calling `useState` returns a pair (that is directly destructured): a reference to your state (here, `count` of
type `Int`), and a function that can be used to set the state (here, `setCount` of type `RSetState<Int>`).

Note that unlike properties in a React class component, the `setCount` function can be called without having to use
a `setState` lambda.

It is also possible to use the State Hook via Kotlin's
[delegation syntax](https://kotlinlang.org/docs/reference/delegated-properties.html), which can simplify the code
even more:

```kotlin
val counter = FC<Props> {
    var count by useState(0)
    button {
        onClick = { count += 1 }
        +count.toString()
    }
}
```

In this example, assignments to the `count` variable are automatically wrapped with the appopriate hook calls under the
hood.

To learn more about the State Hook, check out the
[official React documentation](https://reactjs.org/docs/hooks-state.html).

### The `useEffect` Hook

The Effect Hook can be used to perform side effects without the need for a class component, such as querying an API or
establishing a connection.
Consider the following implementation of a `FC` which `fetch`es a random fact and displays it in a `h3` tag:

```kotlin
val randomFact = FC<Props> {
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

val searchResults = FC<Props> {
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
        value = query
        onChange = {
            query = (it.target as HTMLInputElement).value
        }
    }
    ul {
        for (item in data.hit) {
            li {
                key = item.objectID
                a {
                    href = item.url

                    +item.title
                }
            }
        }
    }
}
```

To learn more about the Effect Hook, check out the
[official React documentation](https://reactjs.org/docs/hooks-effect.html).

### "Custom" Hooks

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
val randomFact = VFC {
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

To learn more about the Custom Hook, check out the
[official React documentation](https://reactjs.org/docs/hooks-custom.html).

## Type-safe inline styles

There is no built-in capability for writing inline styles in a type-safe manner.
However, it can be done by adding a dependency on
[kotlin-emotion](https://github.com/JetBrains/kotlin-wrappers/tree/master/kotlin-emotion).
Note that `kotlin-styled-next` is not compatible with the `kotlin-react` module (only the `kotlin-react-legacy`).

### Using `kotlin-emotion` with `kotlin-react`

`kotlin-emotion` allows you to style built-in HTML elements and custom components if their props type extends
`PropsWithClassName` instead of just `Props`.
To do so, call the `css { ... }` function inside your component, and set type-safe CSS properties as you see fit:

```kotlin
div {
    css {
        backgroundColor = NamedColor.blue
        width = 20.px
        height = 20.px
        borderRadius = 50.pct
    }
}
```

Note that this `css { ... }` helper is actually a shorthand for assigning the `className` property.
This is important to understand because it has several consequences:

* it is only available in components that have the `className` property (from `PropsWithClassName`)
* calling `css { ... }` multiple times will override previous styles - the last block takes precedence
* mixing a `className` assignment with `css` blocks also has the same consequence
* you can "transfer" the CSS properties of your component (passed by the caller) to a child of your component by simply transferring
  the `className` property

For example, if you want to create a stylable component (so callers can use `css {...}`) and you want to transfer all the CSS
properties to a child in your component, you actually just have to transfer the `className` property:

```kotlin
private val Circle = FC<PropsWithClassName>("Circle") { props ->
    div {
        className = props.className

        +"Hello"
    }
}


// later in a ChildrenBuilder context
Circle {
    css {
        width = 20.px
    }
}
```

You can also combine the existing properties with new CSS properties by using an overload of the `css` function that takes a
class name as a first argument:

```kotlin
private val Circle = FC<PropsWithClassName>("Circle") { props ->
    div {
        css(props.className) { // using props.className respects the CSS passed by the caller
            // here we can add more CSS
            backgroundColor = NamedColor.red
        }

        +"Hello"
    }
}
```
