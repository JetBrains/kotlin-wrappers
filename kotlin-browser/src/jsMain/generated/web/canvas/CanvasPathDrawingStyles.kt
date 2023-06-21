// Automatically generated - do not modify!

package web.canvas

import js.core.ReadonlyArray

sealed external interface CanvasPathDrawingStyles {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineCap) */
    var lineCap: CanvasLineCap

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineDashOffset) */
    var lineDashOffset: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineJoin) */
    var lineJoin: CanvasLineJoin

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineWidth) */
    var lineWidth: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/miterLimit) */
    var miterLimit: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getLineDash) */
    fun getLineDash(): ReadonlyArray<Double>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/setLineDash) */
    fun setLineDash(segments: ReadonlyArray<Double>)
}
