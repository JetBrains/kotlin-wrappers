// Automatically generated - do not modify!

package web.notifications

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/dir)
 */
@JsUnion
sealed /* union */
external interface NotificationDirection

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/dir#auto)
 */
inline val NotificationDirection.Companion.auto: NotificationDirection
    get() = unsafeCast("auto")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/dir#ltr)
 */
inline val NotificationDirection.Companion.ltr: NotificationDirection
    get() = unsafeCast("ltr")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/dir#rtl)
 */
inline val NotificationDirection.Companion.rtl: NotificationDirection
    get() = unsafeCast("rtl")
