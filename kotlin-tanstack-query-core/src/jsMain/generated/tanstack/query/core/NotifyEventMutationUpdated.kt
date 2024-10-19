// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface NotifyEventMutationUpdated : NotifyEvent {
    override var type: NotifyEventType /* 'updated' */
    var mutation: Mutation<*, *, *, *>
    var action: Action<*, *, *, *>
}
