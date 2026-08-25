// Automatically generated - do not modify!

package electron.core

@js.union.JsUnion
sealed external interface NotificationCloseEventParamsReason

inline val NotificationCloseEventParamsReason.Companion.userCanceled: NotificationCloseEventParamsReason
    get() = js.reflect.unsafeCast("userCanceled")

inline val NotificationCloseEventParamsReason.Companion.applicationHidden: NotificationCloseEventParamsReason
    get() = js.reflect.unsafeCast("applicationHidden")

inline val NotificationCloseEventParamsReason.Companion.timedOut: NotificationCloseEventParamsReason
    get() = js.reflect.unsafeCast("timedOut")
