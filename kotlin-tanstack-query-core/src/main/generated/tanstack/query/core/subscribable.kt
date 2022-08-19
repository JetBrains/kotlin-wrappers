// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package tanstack.query.core

import kotlinx.js.ReadonlyArray

typealias Listener = () -> Unit

open external class Subscribable<TListener : Function<*>> {
    protected open var listeners: ReadonlyArray<TListener>
    open fun subscribe(listener: TListener): () -> Unit
    open fun hasListeners(): Boolean
    protected open fun onSubscribe()
    protected open fun onUnsubscribe()
}
