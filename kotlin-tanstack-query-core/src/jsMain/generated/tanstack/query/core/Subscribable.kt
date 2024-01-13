// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

package tanstack.query.core

import js.collections.JsSet

open external class Subscribable<TListener : Function<*>> {
    protected open var listeners: JsSet<TListener>
    open fun subscribe(listener: TListener): () -> Unit
    open fun hasListeners(): Boolean
    protected open fun onSubscribe()
    protected open fun onUnsubscribe()
}
