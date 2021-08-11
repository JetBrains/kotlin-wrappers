// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.query

typealias Listener = () -> Unit

open external class Subscribable<TListener : Function<*>> {
    protected open var listeners: Array<out TListener>
    open fun subscribe(listener: TListener = definedExternally): () -> Unit
    open fun hasListeners(): Boolean
    protected open fun onSubscribe()
    protected open fun onUnsubscribe()
}
