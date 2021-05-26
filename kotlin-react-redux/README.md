[![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-redux)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-redux)

## kotlin-react-redux

Kotlin wrapper for React Redux library. Major version number of this wrapper matches that of React Redux itself.

### Maven

```xml
<project>
    <dependency>
        <groupId>org.jetbrains.kotlin-wrappers</groupId>
        <artifactId>kotlin-react-redux</artifactId>
        <version>VERSION</version>
    </dependency>
</project>
```

### Gradle

```kotlin
repositories {
    mavenCentral()
}

implementation("org.jetbrains.kotlin-wrappers:kotlin-react-redux:VERSION")
```

### Usage

Using the provider is just like in JavaScript:

```kotlin
provider(store) {
    app()
}
```

However, you may want to use `rConnect` to connect your components, because it allows you to use 
type-safe builders instead of returning props objects. If you would like to just use `connect` as usual,
you can do that too:

```kotlin
val connectedComponent: RClass<ConnectedComponentProps> =
    rConnect<State, RAction, WrapperAction, ConnectedComponentProps, StateProps, DispatchProps, WrappedComponentProps>(
        { state, props ->
            prop1 = state.prop1
            // ...
        }, { dispatch, props ->
        eventHandler1 = { dispatch(SomeAction()) }
        // ...
    }
    )(WrappedComponent::class.rClass)

// ...

class ParentComponent : RComponent {
    override fun RBuilder.render() {
        connectedComponent {}
    }
}
```

### rConnect Type Parameters

```kotlin
interface WrappedComponentProps : RProps {
    var prop1: Int?
    var eventHandler1: (someValue: Int?) -> Unit
}

internal interface StateProps : RProps {
    var prop1: Int?
}

internal interface DispatchProps : RProps {
    var eventHandler1: (someValue: Int?) -> Unit
}

class WrappedComponent(props: WrappedComponentProps) : RComponent<WrappedComponentProps, RState>(props) {
    // ...
}

private val mapStateToProps: StateProps.(AppState, ConnectedComponentProps) -> Unit = { state, props ->
    prop1 = state.prop1
}

private val mapDispatchToProps: DispatchProps.((RAction) -> WrapperAction, ConnectedComponentProps) -> Unit = { dispatch, props ->
    eventHandler1 = { dispatch(SomeAction()) }
}
```

### Tutorial

See [lawik123/kotlin-poc-frontend-react-redux](https://github.com/lawik123/kotlin-poc-frontend-react-redux).
This project is an implementation/translation of the react-redux [Todo List example project](https://redux.js.org/basics/example) in Kotlin (with the addition of react-router).
