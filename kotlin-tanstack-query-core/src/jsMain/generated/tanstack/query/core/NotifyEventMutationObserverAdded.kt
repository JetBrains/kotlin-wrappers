// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface NotifyEventMutationObserverAdded : NotifyEvent {
    override val type: NotifyEventType /* 'observerAdded' */
    val mutation: Mutation<*, *, *, *>
    val observer: MutationObserver<*, *, *, *>
}
