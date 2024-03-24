package node.events

import js.array.JsTuple
import js.function.JsFunction
import js.symbol.Symbol

private val DECORATED_LISTENER = Symbol("@@decorated-listener")

private val toNodeListener: (Function<Unit>) -> Function<Unit> = JsFunction(
    argumentNames = arrayOf("f"),
    // language=javascript
    body = "return (...args) => { f(args) }",
)

internal fun <P : JsTuple> decorateListener(
    listener: (P) -> Unit,
): Function<Unit> {
    if (listener.asDynamic() == null) return undefined.unsafeCast<Function<Unit>>()

    return listener.asDynamic()[DECORATED_LISTENER] ?: run {
        val nodeListener = toNodeListener(listener)
        listener.asDynamic()[DECORATED_LISTENER] = nodeListener
        nodeListener
    }
}
