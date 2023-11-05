// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.canvas

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ImageOrientation {
    companion object {
        @JsValue("flipY")
        val flipY: ImageOrientation

        @JsValue("from-image")
        val fromImage: ImageOrientation

        @JsValue("none")
        val none: ImageOrientation
    }
}
