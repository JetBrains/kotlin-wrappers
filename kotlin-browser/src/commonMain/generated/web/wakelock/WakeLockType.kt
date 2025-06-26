// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.wakelock

import js.reflect.unsafeCast

sealed external interface WakeLockType {
    companion object
}

inline val WakeLockType.Companion.screen: WakeLockType
    get() = unsafeCast("screen")
