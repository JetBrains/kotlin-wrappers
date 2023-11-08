// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.canvas

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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

    sealed interface canvas : RenderingContextId
    sealed interface bitmaprenderer : RenderingContextId
    sealed interface webgl : RenderingContextId
    sealed interface webgl2 : RenderingContextId
}
