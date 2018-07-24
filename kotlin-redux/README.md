## kotlin-redux

Kotlin wrapper for Redux library. Major version number of this wrapper matches that of Redux itself.

## Creating and using a store in Kotlin

In Redux, the store is an object that contains a state, which could be anything. In Kotlin, this is 
no different. Just note that you must specify the preloaded state. Also, it is encouraged that you
use the rEnhancer function to adapt redux to kotlin.

```
val myStore = createStore(::myReducer, someState, rEnhancer())
```
Access the state with the store's `state` field.

```
myStore.state
```
If you are using rEnhancer, Actions can be written as classes. Just implement the `RAction` interface.

```
class MyAction : RAction
```

Writing reducers is easy, too:

```
fun myReducer(state: TypeOfState, action: RAction) = when (action) {
    is MyAction -> someNewState
    else -> state
}
```

You can now dispatch the action as usual.

```
myStore.dispatch(MyAction())
```

Subscribing to your store works as usual.

```
val unsubscribe = myStore.subscribe { println(myStore.state) }
```

### Middleware

Middleware works as usual. However, if you are using rEnhancer, it is important to keep in mind the
order in which you compose rEnhacer and applyMiddleware. If you specify rEnhancer first, then your
middleware will be passed actions that rEnhancer has already processed. If you specify rEnhancer 
last, it will be passed your unprocessed RActions.

```
compose(rEnhacer(), applyMiddleware(someMiddleware)) // Middleware works with standard actions

compose(applyMiddleware(someMiddleware), rEnhacer()) // Middleware works with RActions
```

### Serialization

If you need to serialize RActions to json, you can do so using
[kotlinx.serialization](https://github.com/Kotlin/kotlinx.serialization). Just mark the actions you
want to serialize with `@Serializable`, and you can serialize them and deserialize them in a
type-safe manner using `serializeAction()` and `deserializeAction()`:

```
val jsonAction = serializeAction(MyAction())

val action = when (JSON.parse((StringSerializer to StringSerializer).map, jsonAction)["type"]) {
	"MyAction" -> deserializeAction<MyAction>(jsonAction)
	"MyOtherAction" -> deserializeAction<MyOtherAction>(jsonAction)
	else -> null
}
```
