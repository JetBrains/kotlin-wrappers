package js.reflect

import js.array.ReadonlyArray

fun <T : Any> JsClass<T>.newInstance(argumentList: ReadonlyArray<Any?> = emptyArray()): T =
    Reflect.construct(
        target = this,
        argumentsList = argumentList,
    )
