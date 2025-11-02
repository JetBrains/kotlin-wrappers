// Automatically generated - do not modify!

package web.codecs

import kotlin.js.definedExternally

/**
 * The **`VideoColorSpace`** interface of the WebCodecs API represents the color space of a video.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace)
 */
open external class VideoColorSpace(
    init: VideoColorSpaceInit = definedExternally,
) {
    /**
     * The **`fullRange`** read-only property of the VideoColorSpace interface returns true if full-range color values are used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/fullRange)
     */
    val fullRange: Boolean?

    /**
     * The **`matrix`** read-only property of the VideoColorSpace interface returns the matrix coefficient of the video. Matrix coefficients describe the relationship between sample component values and color coordinates.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/matrix)
     */
    val matrix: VideoMatrixCoefficients?

    /**
     * The **`primaries`** read-only property of the VideoColorSpace interface returns the color gamut of the video.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/primaries)
     */
    val primaries: VideoColorPrimaries?

    /**
     * The **`transfer`** read-only property of the VideoColorSpace interface returns the opto-electronic transfer characteristics of the video.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/transfer)
     */
    val transfer: VideoTransferCharacteristics?

    /**
     * The **`toJSON()`** method of the VideoColorSpace interface is a serializer that returns a JSON representation of the VideoColorSpace object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/toJSON)
     */
    fun toJSON(): VideoColorSpaceInit
}
