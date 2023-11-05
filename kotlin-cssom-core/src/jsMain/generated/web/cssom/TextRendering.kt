// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface TextRendering {
    companion object {
        @JsValue("geometricPrecision")
        val geometricPrecision: TextRendering

        @JsValue("optimizeLegibility")
        val optimizeLegibility: TextRendering

        @JsValue("optimizeSpeed")
        val optimizeSpeed: TextRendering
    }
}
