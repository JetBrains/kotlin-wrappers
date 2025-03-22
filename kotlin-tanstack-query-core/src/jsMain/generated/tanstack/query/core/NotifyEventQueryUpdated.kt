// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject

@JsPlainObject
external interface NotifyEventQueryUpdated :
    NotifyEvent {
    override val type: NotifyEventType /* 'updated' */
    val query: Query<*, *, *, *>
    val action: Action_1<*, *>
}
