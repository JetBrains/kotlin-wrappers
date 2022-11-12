// Automatically generated - do not modify!

package canvas

sealed external interface CanvasImageData {
    fun createImageData(
        sw: Number,
        sh: Number,
        settings: ImageDataSettings = definedExternally,
    ): ImageData

    fun createImageData(imagedata: ImageData): ImageData
    fun getImageData(
        sx: Number,
        sy: Number,
        sw: Number,
        sh: Number,
        settings: ImageDataSettings = definedExternally,
    ): ImageData

    fun putImageData(
        imagedata: ImageData,
        dx: Number,
        dy: Number,
    )

    fun putImageData(
        imagedata: ImageData,
        dx: Number,
        dy: Number,
        dirtyX: Number,
        dirtyY: Number,
        dirtyWidth: Number,
        dirtyHeight: Number,
    )
}
