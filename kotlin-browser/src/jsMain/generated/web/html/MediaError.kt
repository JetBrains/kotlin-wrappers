// Automatically generated - do not modify!

package web.html

/**
 * An error which occurred while handling media in an HTML media element based on HTMLMediaElement, such as <audio> or <video>.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaError)
 */
sealed external class MediaError {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaError/code) */
    val code: Short

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaError/message) */
    val message: String
    val MEDIA_ERR_ABORTED: Short
    val MEDIA_ERR_NETWORK: Short
    val MEDIA_ERR_DECODE: Short
    val MEDIA_ERR_SRC_NOT_SUPPORTED: Short

    companion object {
        val MEDIA_ERR_ABORTED: Short
        val MEDIA_ERR_NETWORK: Short
        val MEDIA_ERR_DECODE: Short
        val MEDIA_ERR_SRC_NOT_SUPPORTED: Short
    }
}
