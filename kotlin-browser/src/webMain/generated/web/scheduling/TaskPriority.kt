// Automatically generated - do not modify!

package web.scheduling

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TaskPriorityChangeEvent/previousPriority)
 */
@JsUnion
sealed /* union */
external interface TaskPriority

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TaskPriorityChangeEvent/previousPriority#background)
 */
inline val TaskPriority.Companion.background: TaskPriority
    get() = unsafeCast("background")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TaskPriorityChangeEvent/previousPriority#user-blocking)
 */
inline val TaskPriority.Companion.userBlocking: TaskPriority
    get() = unsafeCast("user-blocking")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TaskPriorityChangeEvent/previousPriority#user-visible)
 */
inline val TaskPriority.Companion.userVisible: TaskPriority
    get() = unsafeCast("user-visible")
