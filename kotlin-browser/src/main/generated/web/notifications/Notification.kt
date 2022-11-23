// Automatically generated - do not modify!

package web.notifications

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

external class Notification(
    title: String,
    options: NotificationOptions = definedExternally,
) : EventTarget {
    val body: String
    val data: Any?
    val dir: NotificationDirection
    val icon: String
    val lang: String
    var onclick: EventHandler<Event>?
    var onclose: EventHandler<Event>?
    var onerror: EventHandler<Event>?
    var onshow: EventHandler<Event>?
    val tag: String
    val title: String
    fun close()

    companion object {
        val permission: NotificationPermission
        fun requestPermission(deprecatedCallback: NotificationPermissionCallback = definedExternally): Promise<NotificationPermission>
    }
}
