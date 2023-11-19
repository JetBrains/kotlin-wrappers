// Automatically generated - do not modify!

package tanstack.query.core

external interface NotifyEventMutationObserverRemoved : NotifyEvent {
    override var type: NotifyEventType /* 'observerRemoved' */
    var mutation: Mutation<*, *, *, *>
    var observer: MutationObserver<*, *, *, *>
}
