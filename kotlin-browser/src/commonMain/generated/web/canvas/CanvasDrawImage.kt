// Automatically generated - do not modify!

package web.canvas

sealed external interface CanvasDrawImage {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawImage)
     */
    fun drawImage(
        image: CanvasImageSource,
        dx: Double,
        dy: Double,
    )

    fun drawImage(
        image: CanvasImageSource,
        dx: Double,
        dy: Double,
        dw: Double,
        dh: Double,
    )

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
