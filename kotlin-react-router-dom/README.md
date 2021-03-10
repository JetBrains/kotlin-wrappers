## kotlin-react-router-dom

Kotlin wrapper for [React Router DOM library](https://reacttraining.com/react-router/). 
Major version number of this wrapper matches that of React Router DOM itself.

Both BrowserRouter and HashRouter are supported.

### Maven

```xml
<project>
    <repositories>
        <repository>
            <id>space-kotlin-js-wrappers</id>
            <url>https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers</url>
        </repository>
    </repositories>
    
    <dependency>
        <groupId>org.jetbrains</groupId>
        <artifactId>kotlin-react-router-dom</artifactId>
        <version>VERSION</version>
    </dependency>
</project>
```

### Gradle

```kotlin
repositories {
    maven {
        url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers")
    }
}

implementation("org.jetbrains:kotlin-react-router-dom:VERSION")
```

### Examples

```kotlin
interface IdProps : RProps {
    var id: Int
}

class RootComponent : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        hashRouter { // or "browserRouter"
            switch {
                route("/", IndexComponent::class, exact = true)
                route("/login", strict = true) {
                    login(providers = listOf("plain", "facebook"))
                    a(href = "#/") {
                        +"Back"
                    }
                }
                route<IdProps>("/user/:id") { props ->
                    div {
                        +"User id: ${props.match.params.id}"
                    }
                }
                redirect(from = "/redirect", to = "/redirected")
            }
        }
    }
}
```

### Tutorial

See [lawik123/kotlin-poc-frontend-react-redux](https://github.com/lawik123/kotlin-poc-frontend-react-redux).
This project is an implementation/translation of the react-redux [Todo List example project](https://redux.js.org/basics/example) in Kotlin (with the addition of react-router).
