package node.events

import js.array.JsTuple
import js.array.JsTuple1
import js.function.JsFunction
import js.function.invoke
import js.symbol.Symbol

private val DECORATED_LISTENER = Symbol("@@decorated-listener")

private val toNodeListener = JsFunction<JsTuple1<Function<Unit>>, Function<Unit>>(
    parameterNames = arrayOf("f"),
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
