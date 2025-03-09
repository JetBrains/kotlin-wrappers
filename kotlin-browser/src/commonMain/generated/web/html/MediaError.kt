// Automatically generated - do not modify!

package web.html

/**
 * An error which occurred while handling media in an HTML media element based on HTMLMediaElement, such as <audio> or <video>.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaError)
 */
external class MediaError
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaError/code)
     */
    val code: Code

    /**
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
