package floating.ui.core

import floating.ui.utils.Rect
import js.reflect.unsafeCast
import seskar.js.JsValue

sealed /* union */
external interface RootBoundary {
    companion object {
        @JsValue("viewport")
        val viewport: RootBoundary

        @JsValue("document")
        val document: RootBoundary
    }
}

inline fun RootBoundary(
    value: Rect,
): RootBoundary =
    unsafeCast(value)
