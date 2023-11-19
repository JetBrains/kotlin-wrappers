// Automatically generated - do not modify!

package tanstack.query.core

external interface NotifyEventMutationObserverOptionsUpdated : NotifyEvent {
    override var type: NotifyEventType /* 'observerOptionsUpdated' */
    var mutation: Mutation<*, *, *, *>
    var observer: MutationObserver<*, *, *, *>
}
