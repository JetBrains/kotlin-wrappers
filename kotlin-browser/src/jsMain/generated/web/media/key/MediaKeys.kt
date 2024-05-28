// Automatically generated - do not modify!

package web.media.key

import js.buffer.BufferSource
import js.promise.Promise
import seskar.js.JsAsync

/**
 * This EncryptedMediaExtensions API interface the represents a set of keys that an associated HTMLMediaElement can use for decryption of media data during playback.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys)
 */
sealed external class MediaKeys {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys/createSession)
     */
    fun createSession(sessionType: MediaKeySessionType = definedExternally): MediaKeySession

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys/setServerCertificate)
     */
    @JsAsync
    suspend fun setServerCertificate(serverCertificate: BufferSource): Boolean

    @JsName("setServerCertificate")
    fun setServerCertificateAsync(serverCertificate: BufferSource): Promise<Boolean>
}
