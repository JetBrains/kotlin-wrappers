// Automatically generated - do not modify!

package web.media.key

import js.buffer.BufferSource
import js.core.JsBoolean
import js.promise.Promise
import seskar.js.JsAsync
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`MediaKeys`** interface of Encrypted Media Extensions API represents a set of keys that an associated HTMLMediaElement can use for decryption of media data during playback.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys)
 */
external class MediaKeys
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys/createSession)
     */
    fun createSession(sessionType: MediaKeySessionType = definedExternally): MediaKeySession

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys/getStatusForPolicy)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getStatusForPolicy(policy: MediaKeysPolicy = definedExternally): MediaKeyStatus

    @JsName("getStatusForPolicy")
    fun getStatusForPolicyAsync(policy: MediaKeysPolicy = definedExternally): Promise<MediaKeyStatus>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys/setServerCertificate)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun setServerCertificate(serverCertificate: BufferSource): Boolean

    @JsName("setServerCertificate")
    fun setServerCertificateAsync(serverCertificate: BufferSource): Promise<JsBoolean>
}
