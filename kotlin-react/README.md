## kotlin-react

Kotlin wrapper for React library. Major version number of this wrapper matches that of React itself.

### Installation

1. `npm i @jetbrains/kotlin-react`

2. `npm run gen-idea-libs`

See the [Bintray page](https://bintray.com/kotlin/kotlin-js-wrappers/kotlin-react) for Maven and Gradle 
installation instructions.

### Creating a simple React component with Kotlin

As you might know, the simplest way to define a React component in JavaScript is to write a function. Like this:

```jsx
import React from 'react';

export function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}
```

Here's what the roughly equivalent Kotlin code looks like: 

```kotlin
package hello

import react.*
import react.dom.*

fun RBuilder.hello(name: String) {
    h1 {
        +"Hello, $name"
    }
}
```

`RBuilder` lets you construct your component's markup using 
[type-safe builders](https://kotlinlang.org/docs/reference/type-safe-builders.html), similarly to JSX.
  
When writing React code in JavaScript the type annotations for props (via `PropTypes`) are optional, but in Kotlin 
they are not.

Here's an example of a component defined using a class with a `name` property of type `String`:

```kotlin
package welcome

import react.*
import react.dom.*

interface WelcomeProps: RProps {
    var name: String
}

class Welcome: RComponent<WelcomeProps, RState>() {
     override fun RBuilder.render() {
        div {
            +"Hello, ${props.name}"
        }
    }
}

fun RBuilder.welcome(name: String = "John") = child(Welcome::class) {
    attrs.name = name
}
```

And here's how we can use this component in another component:

```kotlin
import welcome.*

fun RBuilder.app {
    welcome("Jane")
}
```

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

### Using the getDerivedStateFromProps lifecycle method (React 16.3+)

There is currently no proper way to declare static members from Kotlin/JS (see [KT-18891](https://youtrack.jetbrains.com/issue/KT-18891)), 
so please do the following instead:

```kotlin
class MyComponent: RComponent<MyComponentProps, MyComponentState>() {
     override fun MyComponentState.init(props: MyComponentProps) {
        // Note: it's MyComponent::class.js, not MyComponent::class 
        MyComponent::class.js.asDynamic().getDerivedStateFromProps = { p: MyComponentProps, s: MyComponentState ->
            console.log(p, s)
        }
     }
}
```

### Internals

[Imports.kt](src/main/kotlin/react/Imports.kt) contains type definitions for React. The remaining classes 
([React.kt](src/main/kotlin/react/React.kt) and others) provide higher-level APIs on top of that definition.
