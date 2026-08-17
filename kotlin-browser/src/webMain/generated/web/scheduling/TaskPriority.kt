// Automatically generated - do not modify!

package web.scheduling

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface TaskPriority

inline val TaskPriority.Companion.background: TaskPriority
    get() = unsafeCast("background")

inline val TaskPriority.Companion.userBlocking: TaskPriority
    get() = unsafeCast("user-blocking")

inline val TaskPriority.Companion.userVisible: TaskPriority
    get() = unsafeCast("user-visible")
