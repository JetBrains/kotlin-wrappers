// Automatically generated - do not modify!

package web.notifications

import js.core.JsAny
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`Notification`** interface of the Notifications API is used to configure and display desktop notifications to the user.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification)
 */
open external class Notification(
    /**
     * The **`title`** read-only property of the specified in the `title` parameter of the A string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/title)
     */
    val title: String,
    options: NotificationOptions = definedExternally,
) : EventTarget {
    /**
     * The **`body`** read-only property of the specified in the `body` option of the A string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/body)
     */
    val body: String

    /**
     * The **`data`** read-only property of the data, as specified in the `data` option of the The notification's data can be any arbitrary data that you want associated with the notification.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/data)
     */
    val data: JsAny?

    /**
     * The **`dir`** read-only property of the Notification interface indicates the text direction of the notification, as specified in the `dir` option of the Notification.Notification constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/dir)
     */
    val dir: NotificationDirection

    /**
     * The **`icon`** read-only property of the part of the notification, as specified in the `icon` option of the A string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/icon)
     */
    val icon: String

    /**
     * The **`lang`** read-only property of the as specified in the `lang` option of the The language itself is specified using a string representing a language tag according to MISSING: RFC(5646, 'Tags for Identifying Languages (also known as BCP 47)')].
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/lang)
     */
    val lang: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/click_event)
     */
    var onclick: EventHandler<Event, Notification, Notification>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/close_event)
     */
    var onclose: EventHandler<Event, Notification, Notification>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/error_event)
     */
    var onerror: EventHandler<Event, Notification, Notification>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/show_event)
     */
    var onshow: EventHandler<Event, Notification, Notification>?

    /**
     * The **`requireInteraction`** read-only property of the Notification interface returns a boolean value indicating that a notification should remain active until the user clicks or dismisses it, rather than closing automatically.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/requireInteraction)
     */
    val requireInteraction: Boolean

    /**
     * The **`silent`** read-only property of the silent, i.e., no sounds or vibrations should be issued regardless of the device settings.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/silent)
     */
    val silent: Boolean?

    /**
     * The **`tag`** read-only property of the as specified in the `tag` option of the The idea of notification tags is that more than one notification can share the same tag, linking them together.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/tag)
     */
    val tag: String

    /**
     * The **`close()`** method of the Notification interface is used to close/remove a previously displayed notification.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/close)
     */
    fun close()

    companion object {
        /**
         * The **`permission`** read-only static property of the Notification interface indicates the current permission granted by the user for the current origin to display web notifications.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/permission_static)
         */
        val permission: NotificationPermission

        /**
         * The **`requestPermission()`** static method of the Notification interface requests permission from the user for the current origin to display notifications.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/requestPermission_static)
         */
        @JsName("requestPermission")
        fun requestPermissionAsync(deprecatedCallback: NotificationPermissionCallback = definedExternally): Promise<NotificationPermission>
    }
}

/**
 * The **`requestPermission()`** static method of the Notification interface requests permission from the user for the current origin to display notifications.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/requestPermission_static)
 */
suspend inline fun Notification.Companion.requestPermission(noinline deprecatedCallback: NotificationPermissionCallback): NotificationPermission {
    return awaitPromiseLike(requestPermissionAsync(deprecatedCallback = deprecatedCallback))
}

/**
 * The **`requestPermission()`** static method of the Notification interface requests permission from the user for the current origin to display notifications.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/requestPermission_static)
 */
suspend inline fun Notification.Companion.requestPermission(): NotificationPermission {
    return awaitPromiseLike(requestPermissionAsync())
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/click_event)
 */
inline val <C : Notification> C.clickEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "click")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/close_event)
 */
inline val <C : Notification> C.closeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "close")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/error_event)
 */
inline val <C : Notification> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/show_event)
 */
inline val <C : Notification> C.showEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "show")
