[![Bintray](https://img.shields.io/bintray/v/kotlin/kotlin-js-wrappers/kotlin-redux)](https://bintray.com/kotlin/kotlin-js-wrappers/kotlin-redux)

## kotlin-redux

Kotlin wrapper for Redux library. Major version number of this wrapper matches that of Redux itself.

## Creating and using a store in Kotlin

In Redux, the store is an object that contains state, which could be anything. In Kotlin, this is 
no different. Just note that you must specify the preloaded state. Also, it is encouraged that you
use the `rEnhancer` function to adapt Redux to Kotlin.

```kotlin
val myStore = createStore(::myReducer, someState, rEnhancer())
```
Access the state via the store's `state` field.

```kotlin
myStore.state
```
If you are using `rEnhancer`, `Actions` can be implemented as classes. Just implement the `RAction` interface.

```kotlin
class MyAction : RAction
```

Writing reducers is easy, too:

```kotlin
fun myReducer(state: TypeOfState, action: RAction) = when (action) {
    is MyAction -> someNewState
    else -> state
}
```

You can now dispatch the action as usual.

```kotlin
myStore.dispatch(MyAction())
```

Subscribing to your store works as usual.

```kotlin
val unsubscribe = myStore.subscribe { println(myStore.state) }
```

### Middleware

Middleware works as usual. However, if you are using `rEnhancer`, it is important to keep in mind the
order in which you compose `rEnhancer` and `applyMiddleware`. If you specify `rEnhancer` first, then your
middleware will be passed actions that `rEnhancer` has already processed. If you specify `rEnhancer` 
last, it will be passed your unprocessed `RActions`.

```kotlin
compose(rEnhancer(), applyMiddleware(someMiddleware)) // Middleware works with standard actions

compose(applyMiddleware(someMiddleware), rEnhancer()) // Middleware works with RActions
```

### Serialization

If you need to serialize `RActions` to JSON, you can do so using
[kotlinx.serialization](https://github.com/Kotlin/kotlinx.serialization). Just mark the actions you
want to serialize with `@Serializable`, and you can serialize and deserialize them in a type-safe 
manner using `serializeAction()` and `deserializeAction()`:

```kotlin
val jsonAction = serializeAction(MyAction())

val action = when (Json.parse((StringSerializer to StringSerializer).map, jsonAction)["type"]) {
	"MyAction" -> deserializeAction<MyAction>(jsonAction)
	"MyOtherAction" -> deserializeAction<MyOtherAction>(jsonAction)
	else -> null
}
```

### Limitations

Note that `combineReducers` will convert any Kotlin lists to JavaScript arrays without Kotlin's type
system noticing, which can cause all sorts of nasty errors. If you are using `combineReducers`, make
sure to use arrays and not lists in your state.

### Tutorial

See [lawik123/kotlin-poc-frontend-react-redux](https://github.com/lawik123/kotlin-poc-frontend-react-redux).
This project is an implementation/translation of the react-redux [Todo List example project](https://redux.js.org/basics/example) in Kotlin (with the addition of react-router).
