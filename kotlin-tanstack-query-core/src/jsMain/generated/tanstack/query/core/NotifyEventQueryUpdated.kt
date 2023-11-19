// Automatically generated - do not modify!

package tanstack.query.core

external interface NotifyEventQueryUpdated : NotifyEvent {
    override var type: NotifyEventType /* 'updated' */
    var query: Query<*, *, *, *>
    var action: Action<*, *>
}
