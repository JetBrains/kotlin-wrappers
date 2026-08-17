// Automatically generated - do not modify!

package web.notifications

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface NotificationPermission

inline val NotificationPermission.Companion.default: NotificationPermission
    get() = unsafeCast("default")

inline val NotificationPermission.Companion.denied: NotificationPermission
    get() = unsafeCast("denied")

inline val NotificationPermission.Companion.granted: NotificationPermission
    get() = unsafeCast("granted")
