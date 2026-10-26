package cesium.core

import js.array.Tuple
import js.function.JsFunction
import js.reflect.unsafeCast
import js.void.Void

typealias EventListener<T /* : Tuple */> = JsFunction<T, Void>

internal fun EventListener(
    handler: () -> Unit,
): EventListener<Tuple> =
    unsafeCast(handler)

internal fun <T : Tuple> EventListener(
    handler: (T) -> Unit,
): EventListener<T> =
    // language=javascript
    js("((...args) => { handler(args) })")
