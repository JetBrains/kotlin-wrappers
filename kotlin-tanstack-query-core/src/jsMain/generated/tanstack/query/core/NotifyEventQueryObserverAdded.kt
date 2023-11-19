// Automatically generated - do not modify!

package tanstack.query.core

external interface NotifyEventQueryObserverAdded : NotifyEvent {
    override var type: NotifyEventType /* 'observerAdded' */
    var query: Query<*, *, *, *>
    var observer: QueryObserver<*, *, *, *, *>
}
