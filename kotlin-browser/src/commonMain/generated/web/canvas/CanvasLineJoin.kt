// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.canvas

import seskar.js.JsValue

sealed external interface CanvasLineJoin {
    companion object {
        @JsValue("bevel")
        val bevel: CanvasLineJoin

        @JsValue("miter")
        val miter: CanvasLineJoin

        @JsValue("round")
        val round: CanvasLineJoin
    }
}
