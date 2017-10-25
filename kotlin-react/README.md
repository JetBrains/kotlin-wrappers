## kotlin-react

Kotlin wrapper for React library. Major version number of this wrapper matches that of React itself.

### Installation

`npm i @jetbrains/kotlin-react`

See the [Bintray page](https://bintray.com/kotlin/kotlin-js-wrappers/kotlin-react) for Maven and Gradle installation instructions.

### Creating a simple React components with Kotlin

As you might know, the simplest way to define a React component in JavaScript is to write a function. Like this:

```jsx
import React from 'react';

export function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}
```

Here's how we can write this component in Kotlin: 

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

`RBuilder` is a class responsible for working with the DSL that provides JSX-like syntax.
  
While in JavaScript the type annotations for props using PropTypes are optional, in Kotlin you have to add a type annotation for `name`.

Here's an example of a component defined using a class:

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