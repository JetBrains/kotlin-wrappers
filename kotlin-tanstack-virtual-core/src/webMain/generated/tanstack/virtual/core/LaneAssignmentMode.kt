// Automatically generated - do not modify!

package tanstack.virtual.core

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface LaneAssignmentMode

inline val LaneAssignmentMode.Companion.estimate: LaneAssignmentMode
    get() = unsafeCast("estimate")

inline val LaneAssignmentMode.Companion.measured: LaneAssignmentMode
    get() = unsafeCast("measured")
