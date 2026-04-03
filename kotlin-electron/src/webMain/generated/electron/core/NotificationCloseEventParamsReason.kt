// Automatically generated - do not modify!

package electron.core

sealed external interface NotificationCloseEventParamsReason {
    companion object
}

inline val NotificationCloseEventParamsReason.Companion.userCanceled: NotificationCloseEventParamsReason
    get() = js.reflect.unsafeCast("userCanceled")

inline val NotificationCloseEventParamsReason.Companion.applicationHidden: NotificationCloseEventParamsReason
    get() = js.reflect.unsafeCast("applicationHidden")

inline val NotificationCloseEventParamsReason.Companion.timedOut: NotificationCloseEventParamsReason
    get() = js.reflect.unsafeCast("timedOut")
