## kotlin-redux

Kotlin wrapper for Redux library. Major version number of this wrapper matches that of Redux itself.

## Creating and using a store in Kotlin

In Redux, the store is an object that contains a state, which could be anything. In Kotlin, this is 
no different; just use RStore instead of createStore. Note that initializing the state is
mandatory.

```
val myStore = RStore(::myReducer, someState)
```
Access the state with the store's `state` field.

```
myStore.state
```
In Kotlin, Actions can be written as classes. Just implement the `RAction` interface.

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

Note that internally, kotlin-redux uses a single action type and reducer to dispatch the actions
that you write in Kotlin. This is done to adapt Redux to a type-safe environment.

Subscribing to your store works as usual.

```
unsubscribe = myStore.subscribe { println(myStore.state) }
```

### Serialization

If you need to serialize actions, you can do so using
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
