// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ObjectFit {
    companion object {
        @JsValue("contain")
        val contain: ObjectFit

        @JsValue("cover")
        val cover: ObjectFit

        @JsValue("fill")
        val fill: ObjectFit

        @JsValue("scale-down")
        val scaleDown: ObjectFit
    }
}
