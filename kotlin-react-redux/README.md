## kotlin-react-redux

Kotlin wrapper for React Redux library. Major version number of this wrapper matches that of React Redux itself.

### Installation

1. `npm i @jetbrains/kotlin-react-redux`

2. `npm run gen-idea-libs`

See the [Bintray page](https://bintray.com/kotlin/kotlin-js-wrappers/kotlin-react-redux) for Maven and Gradle 
installation instructions.

### Usage

Using the provider is just like in javascript.

```
provider(store) {
    app()
}
```

However, you may want to use `rConnect` to connect your components, because it allows you to use 
typesafe-builders instead of returning props objects. If you would like to just use `connect` as usual,
you can do that too.

```
val connectedComponent: RClass<OwnProps> = 
        rConnect<State, RAction, WrapperAction, OwnProps, StateProps, DispatchProps, WrappedComponentProps>(
            { state, ownProps ->
                someProp = state.something
            }, { state, ownProps ->
               someOtherProp = { dispatch(SomeAction()) }
           }
        )(someComponent)
```
