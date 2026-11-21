package web.css.painting

import js.array.ReadonlyArray
import js.numbers.JsDouble
import web.canvas.*
import web.experimental.ExperimentalWebApi
import web.geometry.DOMMatrix
import web.geometry.DOMMatrixReadOnly

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaintRenderingContext2D)
 */
@ExperimentalWebApi
open external class PaintRenderingContext2D
private constructor() :
    CanvasCompositing,
    CanvasDrawImage,
    CanvasDrawPath,
    CanvasFillStrokeStyles,
    CanvasImageSmoothing,
    CanvasPath,
    CanvasPathDrawingStyles,
    CanvasRect,
    CanvasShadowStyles,
    CanvasState,
    CanvasTransform {
    /* `CanvasCompositing` overrides */

    override var globalAlpha: Double
    override var globalCompositeOperation: GlobalCompositeOperation

    /* `CanvasDrawImage` overrides */

    override fun drawImage(
        image: CanvasImageSource,
        dx: Double,
        dy: Double,
    )

    override fun drawImage(
        image: CanvasImageSource,
        dx: Double,
        dy: Double,
        dw: Double,
        dh: Double,
    )

    override fun drawImage(
        image: CanvasImageSource,
        sx: Double,
        sy: Double,
        sw: Double,
        sh: Double,
        dx: Double,
        dy: Double,
        dw: Double,
        dh: Double,
    )

    /* `CanvasDrawPath` overrides */

    override fun beginPath()
    override fun clip(fillRule: CanvasFillRule)
    override fun clip(
        path: Path2D,
        fillRule: CanvasFillRule,
    )

    override fun fill(fillRule: CanvasFillRule)
    override fun fill(
        path: Path2D,
        fillRule: CanvasFillRule,
    )

    override fun isPointInPath(
        x: Double,
        y: Double,
        fillRule: CanvasFillRule,
    ): Boolean

    override fun isPointInPath(
        path: Path2D,
        x: Double,
        y: Double,
        fillRule: CanvasFillRule,
    ): Boolean

    override fun isPointInStroke(
        x: Double,
        y: Double,
    ): Boolean

    override fun isPointInStroke(
        path: Path2D,
        x: Double,
        y: Double,
    ): Boolean

    override fun stroke()
    override fun stroke(path: Path2D)

    /* `CanvasFillStrokeStyles` overrides */

    override var fillStyle: JsAny /* string | CanvasGradient | CanvasPattern */
    override var strokeStyle: JsAny /* string | CanvasGradient | CanvasPattern */
    override fun createConicGradient(
        startAngle: Double,
        x: Double,
        y: Double,
    ): CanvasGradient

    override fun createLinearGradient(
        x0: Double,
        y0: Double,
        x1: Double,
        y1: Double,
    ): CanvasGradient

    override fun createPattern(
        image: CanvasImageSource,
        repetition: String?,
    ): CanvasPattern?

    override fun createRadialGradient(
        x0: Double,
        y0: Double,
        r0: Double,
        x1: Double,
        y1: Double,
        r1: Double,
    ): CanvasGradient

    /* `CanvasImageSmoothing` overrides */

    override var imageSmoothingEnabled: Boolean
    override var imageSmoothingQuality: ImageSmoothingQuality

    /* `CanvasPath` overrides */

    override fun arc(
        x: Double,
        y: Double,
        radius: Double,
        startAngle: Double,
        endAngle: Double,
        counterclockwise: Boolean,
    )

    override fun arcTo(
        x1: Double,
        y1: Double,
        x2: Double,
        y2: Double,
        radius: Double,
    )

    override fun bezierCurveTo(
        cp1x: Double,
        cp1y: Double,
        cp2x: Double,
        cp2y: Double,
        x: Double,
        y: Double,
    )

    override fun closePath()
    override fun ellipse(
        x: Double,
        y: Double,
        radiusX: Double,
        radiusY: Double,
        rotation: Double,
        startAngle: Double,
        endAngle: Double,
        counterclockwise: Boolean,
    )

    override fun lineTo(
        x: Double,
        y: Double,
    )

    override fun moveTo(
        x: Double,
        y: Double,
    )

    override fun quadraticCurveTo(
        cpx: Double,
        cpy: Double,
        x: Double,
        y: Double,
    )

    override fun rect(
        x: Double,
        y: Double,
        w: Double,
        h: Double,
    )

    override fun roundRect(
        x: Double,
        y: Double,
        w: Double,
        h: Double,
        radii: JsAny, /* number | DOMPointInit | (number | DOMPointInit)[] */
    )

    /* `CanvasPathDrawingStyles` overrides */

    override var lineCap: CanvasLineCap
    override var lineDashOffset: Double
    override var lineJoin: CanvasLineJoin
    override var lineWidth: Double
    override var miterLimit: Double
    override fun getLineDash(): ReadonlyArray<JsDouble>
    override fun setLineDash(segments: ReadonlyArray<JsDouble>)

    /* `CanvasRect` overrides */

    override fun clearRect(
        x: Double,
        y: Double,
        w: Double,
        h: Double,
    )

    override fun fillRect(
        x: Double,
        y: Double,
        w: Double,
        h: Double,
    )

    override fun strokeRect(
        x: Double,
        y: Double,
        w: Double,
        h: Double,
    )

    /* `CanvasShadowStyles` overrides */

    override var shadowBlur: Double
    override var shadowColor: String
    override var shadowOffsetX: Double
    override var shadowOffsetY: Double

    /* `CanvasState` overrides */

    override fun isContextLost(): Boolean
    override fun reset()
    override fun restore()
    override fun save()

    /* `CanvasTransform` overrides */

    override fun getTransform(): DOMMatrix
    override fun resetTransform()
    override fun rotate(angle: Double)
    override fun scale(
        x: Double,
        y: Double,
    )

    override fun setTransform(
        a: Double,
        b: Double,
        c: Double,
        d: Double,
        e: Double,
        f: Double,
    )

    override fun setTransform(transform: DOMMatrixReadOnly /* DOMMatrix2DInit */)
    override fun transform(
        a: Double,
        b: Double,
        c: Double,
        d: Double,
        e: Double,
        f: Double,
    )

    override fun translate(
        x: Double,
        y: Double,
    )
}
