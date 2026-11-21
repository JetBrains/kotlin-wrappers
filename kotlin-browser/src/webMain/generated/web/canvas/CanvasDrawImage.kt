// Automatically generated - do not modify!

package web.canvas

import js.internal.InternalApi
import web.errors.DOMExceptionType.InvalidStateError
import web.errors.JsThrows

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface CanvasDrawImage {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawImage)
     */
    @JsThrows(InvalidStateError::class)
    fun drawImage(
        image: CanvasImageSource,
        dx: Double,
        dy: Double,
    )

    @JsThrows(InvalidStateError::class)
    fun drawImage(
        image: CanvasImageSource,
        dx: Double,
        dy: Double,
        dw: Double,
        dh: Double,
    )

    @JsThrows(InvalidStateError::class)
    fun drawImage(
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
}
