// Automatically generated - do not modify!

package web.canvas

sealed external interface CanvasDrawImage {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawImage) */
    fun drawImage(
        image: CanvasImageSource,
        dx: Number,
        dy: Number,
    )

    fun drawImage(
        image: CanvasImageSource,
        dx: Number,
        dy: Number,
        dw: Number,
        dh: Number,
    )

    fun drawImage(
        image: CanvasImageSource,
        sx: Number,
        sy: Number,
        sw: Number,
        sh: Number,
        dx: Number,
        dy: Number,
        dw: Number,
        dh: Number,
    )
}
