// Automatically generated - do not modify!

package web.components

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/slotAssignment)
 */
@JsUnion
sealed /* union */
external interface SlotAssignmentMode

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/slotAssignment#manual)
 */
inline val SlotAssignmentMode.Companion.manual: SlotAssignmentMode
    get() = unsafeCast("manual")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/slotAssignment#named)
 */
inline val SlotAssignmentMode.Companion.named: SlotAssignmentMode
    get() = unsafeCast("named")
