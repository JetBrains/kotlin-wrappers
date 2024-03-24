package node.events

import js.array.ArrayLike
import js.array.JsArray
import js.array.JsTuple
import js.symbol.Symbol

private val DECORATED_LISTENER = Symbol("@@decorated-listener")

fun <P : JsTuple> decorateListener(
    listener: (P) -> Unit,
): Function<Unit> {
    if (listener.asDynamic() == null) return undefined.unsafeCast<Function<Unit>>()

    var decoratedListener: Function<Unit>? = listener.asDynamic()[DECORATED_LISTENER]

    if (decoratedListener == null) {
        decoratedListener = {
            val arguments = JsArray.from(js("arguments").unsafeCast<ArrayLike<*>>())
            listener(arguments.unsafeCast<P>())
        }

        listener.asDynamic()[DECORATED_LISTENER] = decoratedListener
    }

    return decoratedListener
}
