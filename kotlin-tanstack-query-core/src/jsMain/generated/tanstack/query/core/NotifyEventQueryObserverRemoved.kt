// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface NotifyEventQueryObserverRemoved : NotifyEvent {
    override var type: NotifyEventType /* 'observerRemoved' */
    var query: Query<*, *, *, *>
    var observer: QueryObserver<*, *, *, *, *>
}
