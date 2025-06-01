// Automatically generated - do not modify!

package web.mediakey

import js.promise.Promise
import seskar.js.JsAsync
import kotlin.js.JsName

/**
 * The **`MediaKeySystemAccess`** interface of the Encrypted Media Extensions API provides access to a Key System for decryption and/or a content protection provider.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess)
 */
external class MediaKeySystemAccess
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/keySystem)
     */
    val keySystem: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/createMediaKeys)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun createMediaKeys(): MediaKeys

    @JsName("createMediaKeys")
    fun createMediaKeysAsync(): Promise<MediaKeys>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/getConfiguration)
     */
    fun getConfiguration(): MediaKeySystemConfiguration
}
