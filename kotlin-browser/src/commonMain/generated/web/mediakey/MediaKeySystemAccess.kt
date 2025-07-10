// Automatically generated - do not modify!

package web.mediakey

import js.promise.Promise
import js.promise.await
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
     * The **`keySystem`** read-only property of the MediaKeySystemAccess interface returns a string identifying the key system being used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/keySystem)
     */
    val keySystem: String

    /**
     * The `MediaKeySystemAccess.createMediaKeys()` method returns a ```js-nolint createMediaKeys() ``` None.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/createMediaKeys)
     */
    @JsName("createMediaKeys")
    fun createMediaKeysAsync(): Promise<MediaKeys>

    /**
     * The **`getConfiguration()`** method of the MediaKeySystemAccess interface returns an object with the supported combination of the following configuration options: - `initDataTypes` [MISSING: ReadOnlyInline] - : Returns a list of supported initialization data type names.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/getConfiguration)
     */
    fun getConfiguration(): MediaKeySystemConfiguration
}

/**
 * The `MediaKeySystemAccess.createMediaKeys()` method returns a ```js-nolint createMediaKeys() ``` None.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/createMediaKeys)
 */
suspend inline fun MediaKeySystemAccess.createMediaKeys(): MediaKeys {
    return createMediaKeysAsync().await()
}
