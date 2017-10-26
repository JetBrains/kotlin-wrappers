## kotlin-react

Kotlin wrapper for React library. Major version number of this wrapper matches that of React itself.

### Installation

`npm i @jetbrains/kotlin-react`

See the [Bintray page](https://bintray.com/kotlin/kotlin-js-wrappers/kotlin-react) for Maven and Gradle installation instructions.

### Creating a simple React component with Kotlin

As you might know, the simplest way to define a React component in JavaScript is to write a function. Like this:

```jsx
import React from 'react';

export function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}
```

Here's what the equivalent Kotlin code looks like: 

```kotlin
package hello

import react.*
import react.dom.*

fun RBuilder.hello(name: String") {
    div {
        +"Hello, $name"
    }
}
```

`RBuilder` lets you construct your component's markup using [type-safe builders](https://kotlinlang.org/docs/reference/type-safe-builders.html), similarly to JSX.
  
When writing React code in JavaScript the type annotations for props (via `PropTypes`) are optional, but in Kotlin they are not.

Here's an example of a component defined using a class with a `name` property of type `String`:

```kotlin
package welcome

import react.*
import react.dom.*

interface WelcomeProps: RProps {
    var name: String
}

class Welcome(props: WelcomeProps): RComponent<WelcomeProps, RState>() {
    val name = props.name
    override fun RBuilder.render() {
        div {
            key = "welcome"
            +"Hello, $name"
        }
    }
}

fun RBuilder.welcome(name: String = "John") = child(Welcome::class) {
    attrs.name = name
}
```