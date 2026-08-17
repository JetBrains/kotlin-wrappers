// Automatically generated - do not modify!

package web.notifications

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface NotificationDirection

inline val NotificationDirection.Companion.auto: NotificationDirection
    get() = unsafeCast("auto")

inline val NotificationDirection.Companion.ltr: NotificationDirection
    get() = unsafeCast("ltr")

inline val NotificationDirection.Companion.rtl: NotificationDirection
    get() = unsafeCast("rtl")
