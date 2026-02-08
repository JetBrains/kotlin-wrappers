// Automatically generated - do not modify!

package electron.core

sealed external interface NotificationUrgency {
    companion object
}

inline val NotificationUrgency.Companion.normal: NotificationUrgency
    get() = js.reflect.unsafeCast("normal")

inline val NotificationUrgency.Companion.critical: NotificationUrgency
    get() = js.reflect.unsafeCast("critical")

inline val NotificationUrgency.Companion.low: NotificationUrgency
    get() = js.reflect.unsafeCast("low")
