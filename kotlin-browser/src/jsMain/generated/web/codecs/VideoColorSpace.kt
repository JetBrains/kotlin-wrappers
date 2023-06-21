// Automatically generated - do not modify!

package web.codecs

external class VideoColorSpace(
    init: VideoColorSpaceInit = definedExternally,
) {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/fullRange) */
    val fullRange: Boolean?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/matrix) */
    val matrix: VideoMatrixCoefficients?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/primaries) */
    val primaries: VideoColorPrimaries?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/transfer) */
    val transfer: VideoTransferCharacteristics?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/toJSON) */
    fun toJSON(): VideoColorSpaceInit
}
