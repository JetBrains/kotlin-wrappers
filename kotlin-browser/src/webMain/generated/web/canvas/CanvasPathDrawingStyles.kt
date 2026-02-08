// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.canvas

import js.array.ReadonlyArray
import js.core.JsDouble
import js.internal.InternalApi
import kotlin.js.definedExternally

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface CanvasPathDrawingStyles {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineCap)
     */
    var lineCap: CanvasLineCap
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineDashOffset)
     */
    var lineDashOffset: Double
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineJoin)
     */
    var lineJoin: CanvasLineJoin
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineWidth)
     */
    var lineWidth: Double
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/miterLimit)
     */
    var miterLimit: Double
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getLineDash)
     */
    fun getLineDash(): ReadonlyArray<JsDouble> = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/setLineDash)
     */
    fun setLineDash(segments: ReadonlyArray<JsDouble>): Unit = definedExternally
}
