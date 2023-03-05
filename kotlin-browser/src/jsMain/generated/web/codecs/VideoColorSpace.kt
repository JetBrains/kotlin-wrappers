// Automatically generated - do not modify!

package web.codecs

external class VideoColorSpace(
    init: VideoColorSpaceInit = definedExternally,
) {
    val fullRange: Boolean?
    val matrix: VideoMatrixCoefficients?
    val primaries: VideoColorPrimaries?
    val transfer: VideoTransferCharacteristics?
    fun toJSON(): VideoColorSpaceInit
}
