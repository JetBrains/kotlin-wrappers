// Automatically generated - do not modify!

package web.mediakey

import js.buffer.BufferSource
import js.core.JsBoolean
import js.core.JsPrimitives.toBoolean
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
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
     * The `createSession()` method of the MediaKeys interface returns a new MediaKeySession object, which represents a context for message exchange with a content decryption module (CDM).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys/createSession)
     */
    fun createSession(sessionType: MediaKeySessionType = definedExternally): MediaKeySession

    /**
     * The `getStatusForPolicy()` method of the MediaKeys interface is used to check whether the Content Decryption Module (CDM) would allow the presentation of encrypted media data using the keys, based on the specified policy requirements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys/getStatusForPolicy)
     */
    @JsName("getStatusForPolicy")
    fun getStatusForPolicyAsync(policy: MediaKeysPolicy = definedExternally): Promise<MediaKeyStatus>

    /**
     * The **`setServerCertificate()`** method of the MediaKeys interface provides a server certificate to be used to encrypt messages to the license server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys/setServerCertificate)
     */
    @JsName("setServerCertificate")
    fun setServerCertificateAsync(serverCertificate: BufferSource): Promise<JsBoolean>
}

/**
 * The `getStatusForPolicy()` method of the MediaKeys interface is used to check whether the Content Decryption Module (CDM) would allow the presentation of encrypted media data using the keys, based on the specified policy requirements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys/getStatusForPolicy)
 */
suspend inline fun MediaKeys.getStatusForPolicy(policy: MediaKeysPolicy): MediaKeyStatus {
    return awaitPromiseLike(getStatusForPolicyAsync(policy = policy))
}

/**
 * The `getStatusForPolicy()` method of the MediaKeys interface is used to check whether the Content Decryption Module (CDM) would allow the presentation of encrypted media data using the keys, based on the specified policy requirements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys/getStatusForPolicy)
 */
suspend inline fun MediaKeys.getStatusForPolicy(): MediaKeyStatus {
    return awaitPromiseLike(getStatusForPolicyAsync())
}

/**
 * The **`setServerCertificate()`** method of the MediaKeys interface provides a server certificate to be used to encrypt messages to the license server.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys/setServerCertificate)
 */
suspend inline fun MediaKeys.setServerCertificate(serverCertificate: BufferSource): Boolean {
    return awaitPromiseLike(setServerCertificateAsync(serverCertificate = serverCertificate)).toBoolean()
}
