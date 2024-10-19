// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface NotifyEventQueryObserverOptionsUpdated : NotifyEvent {
    override val type: NotifyEventType /* 'observerOptionsUpdated' */
    val query: Query<*, *, *, *>
    val observer: QueryObserver<*, *, *, *, *>
}
