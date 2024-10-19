// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface NotifyEventQueryObserverAdded : NotifyEvent {
    override val type: NotifyEventType /* 'observerAdded' */
    val query: Query<*, *, *, *>
    val observer: QueryObserver<*, *, *, *, *>
}
