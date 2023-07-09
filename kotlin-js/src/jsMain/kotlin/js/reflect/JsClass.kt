package js.reflect

fun <T : Any> JsClass<T>.newInstance(): T =
    Reflect.construct(
        target = this,
        argumentsList = emptyArray(),
    )
