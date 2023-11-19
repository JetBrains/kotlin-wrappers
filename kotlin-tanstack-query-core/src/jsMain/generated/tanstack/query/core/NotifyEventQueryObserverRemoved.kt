// Automatically generated - do not modify!

package tanstack.query.core

external interface NotifyEventQueryObserverRemoved : NotifyEvent {
    override var type: NotifyEventType /* 'observerRemoved' */
    var query: Query<*, *, *, *>
    var observer: QueryObserver<*, *, *, *, *>
}
