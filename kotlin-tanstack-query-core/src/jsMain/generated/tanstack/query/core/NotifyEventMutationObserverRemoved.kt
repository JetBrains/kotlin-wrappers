// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface NotifyEventMutationObserverRemoved : NotifyEvent {
    override val type: NotifyEventType /* 'observerRemoved' */
    val mutation: Mutation<*, *, *, *>
    val observer: MutationObserver<*, *, *, *>
}
