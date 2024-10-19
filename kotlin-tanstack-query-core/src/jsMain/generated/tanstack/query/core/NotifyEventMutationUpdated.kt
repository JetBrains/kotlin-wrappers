// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface NotifyEventMutationUpdated : NotifyEvent {
    override val type: NotifyEventType /* 'updated' */
    val mutation: Mutation<*, *, *, *>
    val action: Action<*, *, *, *>
}
