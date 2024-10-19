// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface NotifyEventMutationObserverAdded : NotifyEvent {
    override var type: NotifyEventType /* 'observerAdded' */
    var mutation: Mutation<*, *, *, *>
    var observer: MutationObserver<*, *, *, *>
}
