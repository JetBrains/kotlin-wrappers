// Automatically generated - do not modify!

package tanstack.query.core

external interface NotifyEventQueryObserverOptionsUpdated : NotifyEvent {
    override var type: NotifyEventType /* 'observerOptionsUpdated' */
    var query: Query<*, *, *, *>
    var observer: QueryObserver<*, *, *, *, *>
}
