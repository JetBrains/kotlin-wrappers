## kotlin-react-dom

Kotlin wrapper for [React Router DOM library](https://reacttraining.com/react-router/). 
Major version number of this wrapper matches that of React Router DOM itself.
Support only hash routing

### Installation

`npm i @jetbrains/kotlin-react-router-dom`

See the [Bintray page](https://bintray.com/kotlin/kotlin-js-wrappers/kotlin-react-router-dom) for Maven and Gradle installation instructions.

### Examples

```kotlin
interface IdProps : RProps {
    var id: Int
}

class RootComponent : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        hashRouter {
            switch {
                route("/", IndexComponent::class, exact = true)
                route("/login", strict = true) {
                    login(privders = listOf("plain", "facebook"))
                    a(href = "#/") {
                        +"Back"
                    }
                }
                route<IdProps>("/user/:id") { props ->
                    div {
                        +"User id: ${props.match.params.id}"
                    }
                }
            }
        }
    }
}
```
