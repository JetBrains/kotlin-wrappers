// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface NotifyEventQueryObserverOptionsUpdated : NotifyEvent {
    override var type: NotifyEventType /* 'observerOptionsUpdated' */
    var query: Query<*, *, *, *>
    var observer: QueryObserver<*, *, *, *, *>
}
