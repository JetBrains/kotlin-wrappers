// Automatically generated - do not modify!

package web.serial

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface FlowControlType

inline val FlowControlType.Companion.hardware: FlowControlType
    get() = unsafeCast("hardware")

inline val FlowControlType.Companion.none: FlowControlType
    get() = unsafeCast("none")
