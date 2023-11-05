// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface BackgroundSize {
    companion object {
        @JsValue("contain")
        val contain: BackgroundSize

        @JsValue("cover")
        val cover: BackgroundSize
    }
}
