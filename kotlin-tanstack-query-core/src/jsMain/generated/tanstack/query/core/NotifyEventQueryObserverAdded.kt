// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface NotifyEventQueryObserverAdded : NotifyEvent {
    override var type: NotifyEventType /* 'observerAdded' */
    var query: Query<*, *, *, *>
    var observer: QueryObserver<*, *, *, *, *>
}
