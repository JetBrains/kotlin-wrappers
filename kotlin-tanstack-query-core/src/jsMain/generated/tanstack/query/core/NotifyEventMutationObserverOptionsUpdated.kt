// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject

@JsPlainObject
external interface NotifyEventMutationObserverOptionsUpdated : NotifyEvent {
    override val type: NotifyEventType /* 'observerOptionsUpdated' */
    val mutation: Mutation<*, *, *, *>?
    val observer: MutationObserver<*, *, *, *>
}
