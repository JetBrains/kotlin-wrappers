// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject

@JsPlainObject
external interface NotifyEventQueryObserverRemoved : NotifyEvent {
    override val type: NotifyEventType /* 'observerRemoved' */
    val query: Query<*, *, *, *>
    val observer: QueryObserver<*, *, *, *, *>
}
