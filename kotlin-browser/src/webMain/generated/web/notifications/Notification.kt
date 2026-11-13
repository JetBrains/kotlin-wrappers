// Automatically generated - do not modify!

package web.notifications

import js.array.ReadonlyArray
import js.promise.Promise
import js.promise.await
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget

/**
 * The **`Notification`** interface of the Notifications API is used to configure and display desktop notifications to the user.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification)
 */
open external class Notification(
    /**
     * The **`title`** read-only property of the Notification interface indicates the title of the notification, as specified in the title parameter of the Notification() constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/title)
     */
    open val title: String,
    options: NotificationOptions = definedExternally,
) : EventTarget {
    /**
     * The **`actions`** read-only property of the Notification interface provides the actions available for users to select when interacting with the notification.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/actions)
     */
    open val actions: ReadonlyArray<NotificationAction>

    /**
     * The **`body`** read-only property of the Notification interface indicates the body string of the notification, as specified in the body option of the Notification() constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/body)
     */
    open val body: String

    /**
     * The **`data`** read-only property of the Notification interface returns a structured clone of the notification's data, as specified in the data option of the Notification() constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/data)
     */
    open val data: JsAny?

    /**
     * The **`dir`** read-only property of the Notification interface indicates the text direction of the notification, as specified in the dir option of the Notification() constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/dir)
     */
    open val dir: NotificationDirection

    /**
     * The **`icon`** read-only property of the Notification interface returns a string containing the URL of a small image that reinforces the notification — for example, an app logo or a photo of the message sender. It is displayed alongside the notification title and body.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/icon)
     */
    open val icon: String

    /**
     * The **`lang`** read-only property of the Notification interface indicates the language used in the notification, as specified in the lang option of the Notification() constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/lang)
     */
    open val lang: String

    /**
     * The **`navigate`** read-only property of the Notification interface contains the URL the user agent will navigate to when the user activates the notification.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/navigate)
     */
    open val navigate: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/click_event)
     */
    open var onclick: EventHandler<Event, Notification, Notification>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/close_event)
     */
    open var onclose: EventHandler<Event, Notification, Notification>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/error_event)
     */
    open var onerror: EventHandler<Event, Notification, Notification>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/show_event)
     */
    open var onshow: EventHandler<Event, Notification, Notification>?

    /**
     * The **`requireInteraction`** read-only property of the Notification interface returns a boolean value indicating that a notification should remain active until the user clicks or dismisses it, rather than closing automatically.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/requireInteraction)
     */
    open val requireInteraction: Boolean

    /**
     * The **`silent`** read-only property of the Notification interface specifies whether the notification should be silent, i.e., no sounds or vibrations should be issued regardless of the device settings. This is controlled via the silent option of the Notification() constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/silent)
     */
    open val silent: Boolean?

    /**
     * The **`tag`** read-only property of the Notification interface signifies an identifying tag for the notification, as specified in the tag option of the Notification() constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/tag)
     */
    open val tag: String

    /**
     * The **`close()`** method of the Notification interface is used to close/remove a previously displayed notification.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/close)
     */
    open fun close()

    companion object {
        /**
         * The **`maxActions`** read-only static property of the Notification interface returns the maximum number of actions that can be displayed in a notification.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/maxActions_static)
         */
        val maxActions: Int

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
suspend inline fun Notification.Companion.requestPermission(): NotificationPermission {
    return requestPermissionAsync().await()
}

/**
 * The **`requestPermission()`** static method of the Notification interface requests permission from the user for the current origin to display notifications.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/requestPermission_static)
 */
suspend inline fun Notification.Companion.requestPermission(noinline deprecatedCallback: NotificationPermissionCallback): NotificationPermission {
    return requestPermissionAsync(
        deprecatedCallback = deprecatedCallback,
    ).await()
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
