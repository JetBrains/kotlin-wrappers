// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

package tanstack.query.core

open external class Subscribable<TListener : Function<*>> {
    protected open var listeners: Set<TListener>
    open fun subscribe(listener: TListener): () -> Unit
    open fun hasListeners(): Boolean
    protected open fun onSubscribe()
    protected open fun onUnsubscribe()
}
