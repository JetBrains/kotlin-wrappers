// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.dom.observers

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ResizeObserverBoxOptions {
    companion object {
        @JsValue("border-box")
        val borderBox: ResizeObserverBoxOptions

        @JsValue("content-box")
        val contentBox: ResizeObserverBoxOptions

        @JsValue("device-pixel-content-box")
        val devicePixelContentBox: ResizeObserverBoxOptions
    }
}
