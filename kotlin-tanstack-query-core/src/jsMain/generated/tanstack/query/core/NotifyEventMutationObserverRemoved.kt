// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject

@JsPlainObject
external interface NotifyEventMutationObserverRemoved : NotifyEvent {
    override val type: NotifyEventType /* 'observerRemoved' */
    val mutation: Mutation<*, *, *, *>
    val observer: MutationObserver<*, *, *, *>
}
