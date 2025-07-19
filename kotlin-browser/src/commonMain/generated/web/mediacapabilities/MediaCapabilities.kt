// Automatically generated - do not modify!

package web.mediacapabilities

import js.promise.Promise
import js.promise.await
import kotlin.js.JsName

/**
 * The **`MediaCapabilities`** interface of the Media Capabilities API provides information about the decoding abilities of the device, system and browser.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaCapabilities)
 */
open external class MediaCapabilities
private constructor() {
    /**
     * The **`decodingInfo()`** method of the MediaCapabilities interface returns a promise that fulfils with information about how well the user agent can decode/display media with a given configuration.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaCapabilities/decodingInfo)
     */
    @JsName("decodingInfo")
    fun decodingInfoAsync(configuration: MediaDecodingConfiguration): Promise<MediaCapabilitiesDecodingInfo>

    /**
     * The **`encodingInfo()`** method of the MediaCapabilities interface returns a promise that fulfills with the tested media configuration's capabilities for encoding media.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaCapabilities/encodingInfo)
     */
    @JsName("encodingInfo")
    fun encodingInfoAsync(configuration: MediaEncodingConfiguration): Promise<MediaCapabilitiesEncodingInfo>
}

/**
 * The **`decodingInfo()`** method of the MediaCapabilities interface returns a promise that fulfils with information about how well the user agent can decode/display media with a given configuration.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaCapabilities/decodingInfo)
 */
suspend inline fun MediaCapabilities.decodingInfo(configuration: MediaDecodingConfiguration): MediaCapabilitiesDecodingInfo {
    return decodingInfoAsync(
        configuration = configuration,
    ).await()
}

/**
 * The **`encodingInfo()`** method of the MediaCapabilities interface returns a promise that fulfills with the tested media configuration's capabilities for encoding media.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaCapabilities/encodingInfo)
 */
suspend inline fun MediaCapabilities.encodingInfo(configuration: MediaEncodingConfiguration): MediaCapabilitiesEncodingInfo {
    return encodingInfoAsync(
        configuration = configuration,
    ).await()
}
