// Automatically generated - do not modify!

package web.media.key

import js.promise.Promise
import seskar.js.JsAsync

/**
 * This EncryptedMediaExtensions API interface provides access to a Key System for decryption and/or a content protection provider. You can request an instance of this object using the Navigator.requestMediaKeySystemAccess method.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess)
 */
sealed external class MediaKeySystemAccess {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/keySystem)
     */
    val keySystem: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/createMediaKeys)
     */
    @JsAsync
    suspend fun createMediaKeys(): MediaKeys

    @JsName("createMediaKeys")
    fun createMediaKeysAsync(): Promise<MediaKeys>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/getConfiguration)
     */
    fun getConfiguration(): MediaKeySystemConfiguration
}
