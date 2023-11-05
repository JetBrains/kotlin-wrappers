// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface Contain {
    companion object {
        @JsValue("content")
        val content: Contain

        @JsValue("inline-size")
        val inlineSize: Contain

        @JsValue("layout")
        val layout: Contain

        @JsValue("paint")
        val paint: Contain

        @JsValue("size")
        val size: Contain

        @JsValue("strict")
        val strict: Contain

        @JsValue("style")
        val style: Contain
    }
}
