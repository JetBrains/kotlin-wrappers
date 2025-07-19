@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.scheduling

import js.reflect.unsafeCast

sealed external interface TaskPriority {
    companion object
}

inline val TaskPriority.Companion.userBlocking: TaskPriority
    get() = unsafeCast("user-blocking")

inline val TaskPriority.Companion.userVisible: TaskPriority
    get() = unsafeCast("user-visible")

inline val TaskPriority.Companion.background: TaskPriority
    get() = unsafeCast("background")
