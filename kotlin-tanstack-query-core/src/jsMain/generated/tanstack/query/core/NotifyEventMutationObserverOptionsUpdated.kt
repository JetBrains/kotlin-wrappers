// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface NotifyEventMutationObserverOptionsUpdated : NotifyEvent {
    override var type: NotifyEventType /* 'observerOptionsUpdated' */
    var mutation: Mutation<*, *, *, *>?
    var observer: MutationObserver<*, *, *, *>
}
