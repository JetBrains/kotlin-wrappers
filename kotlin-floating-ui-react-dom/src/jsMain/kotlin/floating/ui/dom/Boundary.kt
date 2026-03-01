package floating.ui.dom

import floating.ui.utils.Rect
import js.array.ReadonlyArray
import js.reflect.unsafeCast
import seskar.js.JsValue
import web.dom.Element

sealed /* union */
external interface Boundary {
    companion object {
        @JsValue("clippingAncestors")
        val clippingAncestors: Boundary
    }
}

inline fun Boundary(
    value: Element,
): Boundary =
    unsafeCast(value)

inline fun Boundary(
    value: ReadonlyArray<Element>,
): Boundary =
    unsafeCast(value)

inline fun Boundary(
    value: Rect,
): Boundary =
    unsafeCast(value)
