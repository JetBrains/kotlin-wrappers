// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.notifications

import js.reflect.unsafeCast

sealed external interface NotificationDirection {
    companion object
}

inline val NotificationDirection.Companion.auto: NotificationDirection
    get() = unsafeCast("auto")

inline val NotificationDirection.Companion.ltr: NotificationDirection
    get() = unsafeCast("ltr")

inline val NotificationDirection.Companion.rtl: NotificationDirection
    get() = unsafeCast("rtl")
