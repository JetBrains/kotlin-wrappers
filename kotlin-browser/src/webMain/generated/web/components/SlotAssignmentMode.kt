// Automatically generated - do not modify!

package web.components

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface SlotAssignmentMode

inline val SlotAssignmentMode.Companion.manual: SlotAssignmentMode
    get() = unsafeCast("manual")

inline val SlotAssignmentMode.Companion.named: SlotAssignmentMode
    get() = unsafeCast("named")
