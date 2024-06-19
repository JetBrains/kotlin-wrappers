// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsValue

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
