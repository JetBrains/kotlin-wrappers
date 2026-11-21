// Automatically generated - do not modify!

package web.canvas

import js.array.ReadonlyArray
import js.numbers.JsDouble
import js.reflect.unsafeCast
import web.geometry.DOMMatrix
import web.geometry.DOMMatrixReadOnly
import web.images.ImageData
import web.images.ImageDataSettings
import web.rendering.OffscreenRenderingContext
import web.rendering.RenderingContextId

/**
 * The **`OffscreenCanvasRenderingContext2D`** interface is a CanvasRenderingContext2D rendering context for drawing to the bitmap of an OffscreenCanvas object. It is similar to the CanvasRenderingContext2D object, with the following differences:
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvasRenderingContext2D)
 */
open external class OffscreenCanvasRenderingContext2D
private constructor() :
    CanvasCompositing,
    CanvasDrawImage,
    CanvasDrawPath,
    CanvasFillStrokeStyles,
    CanvasFilters,
    CanvasImageData,
    CanvasImageSmoothing,
    CanvasPath,
    CanvasPathDrawingStyles,
    CanvasRect,
    CanvasShadowStyles,
    CanvasState,
    CanvasText,
    CanvasTextDrawingStyles,
    CanvasTransform,
    OffscreenRenderingContext {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/canvas)
     */
    open val canvas: OffscreenCanvas

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

    /* `CanvasFilters` overrides */

    override var filter: String

    /* `CanvasImageData` overrides */

    override fun createImageData(
        sw: Int,
        sh: Int,
        settings: ImageDataSettings,
    ): ImageData

    override fun createImageData(imageData: ImageData): ImageData
    override fun getImageData(
        sx: Int,
        sy: Int,
        sw: Int,
        sh: Int,
        settings: ImageDataSettings,
    ): ImageData

    override fun putImageData(
        imageData: ImageData,
        dx: Int,
        dy: Int,
    )

    override fun putImageData(
        imageData: ImageData,
        dx: Int,
        dy: Int,
        dirtyX: Int,
        dirtyY: Int,
        dirtyWidth: Int,
        dirtyHeight: Int,
    )

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

    /* `CanvasText` overrides */

    override fun fillText(
        text: String,
        x: Double,
        y: Double,
        maxWidth: Double,
    )

    override fun measureText(text: String): TextMetrics
    override fun strokeText(
        text: String,
        x: Double,
        y: Double,
        maxWidth: Double,
    )

    /* `CanvasTextDrawingStyles` overrides */

    override var direction: CanvasDirection
    override var font: String
    override var fontKerning: CanvasFontKerning
    override var fontStretch: CanvasFontStretch
    override var fontVariantCaps: CanvasFontVariantCaps
    override var lang: String
    override var letterSpacing: String
    override var textAlign: CanvasTextAlign
    override var textBaseline: CanvasTextBaseline
    override var textRendering: CanvasTextRendering
    override var wordSpacing: String

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

    companion object
}

inline val OffscreenCanvasRenderingContext2D.Companion.ID: RenderingContextId<OffscreenCanvasRenderingContext2D, CanvasRenderingContext2DSettings>
    get() = unsafeCast("2d")
