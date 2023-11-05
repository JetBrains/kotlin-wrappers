// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface GeometryPosition :
    BackgroundPosition,
    MaskPosition,
    ObjectPosition,
    OffsetAnchor,
    OffsetPosition,
    PerspectiveOrigin,
    TransformOrigin {
    companion object {
        @JsValue("bottom")
        val bottom: GeometryPosition

        @JsValue("center")
        val center: GeometryPosition

        @JsValue("left")
        val left: GeometryPosition

        @JsValue("right")
        val right: GeometryPosition

        @JsValue("top")
        val top: GeometryPosition
    }
}
