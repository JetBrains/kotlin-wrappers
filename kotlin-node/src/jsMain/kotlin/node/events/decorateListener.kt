package node.events

import js.array.ArrayLike
import js.array.JsArray
import js.array.JsTuple
import js.symbol.Symbol

private val decoratedListenerKey = Symbol("@@decorated-listener")

fun <P : JsTuple> decorateListener(listener: (P) -> Unit): Function<Unit> {
    if (listener.asDynamic() == null) return undefined.unsafeCast<Function<Unit>>()

    var decoratedListener = listener.asDynamic()[decoratedListenerKey]

    if (decoratedListener == null) {
        decoratedListener = {
            val arguments = JsArray.from(js("arguments").unsafeCast<ArrayLike<*>>())
            listener(arguments.unsafeCast<P>())
        }

        listener.asDynamic()[decoratedListenerKey] = decoratedListener
    }

    return decoratedListener.unsafeCast<Function<Unit>>()
}
