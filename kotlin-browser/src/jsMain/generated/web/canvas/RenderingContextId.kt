// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.canvas

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface RenderingContextId {
    companion object {
        // `2d`
        @JsValue("2d")
        val canvas: canvas

        @JsValue("bitmaprenderer")
        val bitmaprenderer: bitmaprenderer

        @JsValue("webgl")
        val webgl: webgl

        @JsValue("webgl2")
        val webgl2: webgl2
    }

    interface canvas : RenderingContextId
    interface bitmaprenderer : RenderingContextId
    interface webgl : RenderingContextId
    interface webgl2 : RenderingContextId
}
