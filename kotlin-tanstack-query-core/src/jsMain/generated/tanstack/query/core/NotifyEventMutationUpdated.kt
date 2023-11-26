// Automatically generated - do not modify!

package tanstack.query.core

external interface NotifyEventMutationUpdated : NotifyEvent {
    override var type: NotifyEventType /* 'updated' */
    var mutation: Mutation<*, *, *, *>
    var action: Action_1<*, *, *, *>
}
