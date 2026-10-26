package cesium.core

import js.array.Tuple
import js.function.JsFunction
import js.void.Void

typealias EventListener<T /* : Tuple */> = JsFunction<T, Void>

internal fun <T : Tuple> EventListener(
    handler: (T) -> Unit,
): EventListener<T> =
    // language=javascript
    js("((...args) => { handler(args) })")
