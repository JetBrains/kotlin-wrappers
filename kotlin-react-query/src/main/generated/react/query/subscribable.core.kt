// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.query

import kotlinx.js.ReadonlyArray

typealias Listener = () -> Unit

open external class Subscribable<TListener : Function<*>> {
    protected open var listeners: ReadonlyArray<TListener>
    open fun subscribe(listener: TListener = definedExternally): () -> Unit
    open fun hasListeners(): Boolean
    protected open fun onSubscribe()
    protected open fun onUnsubscribe()
}
