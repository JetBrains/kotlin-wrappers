[![Bintray](https://img.shields.io/bintray/v/kotlin/kotlin-js-wrappers/kotlin-react-redux)](https://bintray.com/kotlin/kotlin-js-wrappers/kotlin-react-redux)

## kotlin-react-redux

Kotlin wrapper for React Redux library. Major version number of this wrapper matches that of React Redux itself.

### Installation

1. `npm i @jetbrains/kotlin-react-redux`

2. `npm run gen-idea-libs`

See the [Bintray page](https://bintray.com/kotlin/kotlin-js-wrappers/kotlin-react-redux) for Maven and Gradle 
installation instructions.

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

private val mapStateToProps: StateProps.(AppState, WrappedComponentProps) -> Unit = { state, props ->
    prop1 = state.prop1
}

private val mapDispatchToProps: DispatchProps.((RAction) -> WrapperAction, WrappedComponentProps) -> Unit = { dispatch, props ->
    eventHandler1 = { dispatch(SomeAction()) }
}
```

### Tutorial

See [lawik123/kotlin-poc-frontend-react-redux](https://github.com/lawik123/kotlin-poc-frontend-react-redux).
This project is an implementation/translation of the react-redux [Todo List example project](https://redux.js.org/basics/example) in Kotlin (with the addition of react-router).
