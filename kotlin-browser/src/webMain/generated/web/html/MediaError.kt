// Automatically generated - do not modify!

package web.html

import js.errors.JsErrorLike

/**
 * The **`MediaError`** interface represents an error which occurred while handling media in an HTML media element based on HTMLMediaElement, such as audio or video.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaError)
 */
open external class MediaError
private constructor() :
    JsErrorLike {
    /**
     * The read-only property **`MediaError.code`** returns a numeric value which represents the kind of error that occurred on a media element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaError/code)
     */
    val code: Code

    /**
     * The read-only property **`MediaError.message`** returns a human-readable string offering specific diagnostic details related to the error described by the `MediaError` object, or an empty string (`''`) if no diagnostic information can be determined or provided.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaError/message)
     */
    val message: String
    val MEDIA_ERR_ABORTED: Code
    val MEDIA_ERR_NETWORK: Code
    val MEDIA_ERR_DECODE: Code
    val MEDIA_ERR_SRC_NOT_SUPPORTED: Code

    companion object {
        val MEDIA_ERR_ABORTED: Code
        val MEDIA_ERR_NETWORK: Code
        val MEDIA_ERR_DECODE: Code
        val MEDIA_ERR_SRC_NOT_SUPPORTED: Code
    }

    sealed interface Code
}
