// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface Position {
    companion object {
        @JsValue("absolute")
        val absolute: Position

        @JsValue("fixed")
        val fixed: Position

        @JsValue("relative")
        val relative: Position

        @JsValue("static")
        val static: Position

        @JsValue("sticky")
        val sticky: Position
    }
}
