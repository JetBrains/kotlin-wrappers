// Automatically generated - do not modify!

package canvas

import js.core.ReadonlyArray

sealed external interface CanvasPathDrawingStyles {
    var lineCap: CanvasLineCap
    var lineDashOffset: Double
    var lineJoin: CanvasLineJoin
    var lineWidth: Double
    var miterLimit: Double
    fun getLineDash(): ReadonlyArray<Double>
    fun setLineDash(segments: ReadonlyArray<Double>)
}
