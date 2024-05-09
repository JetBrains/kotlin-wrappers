// Automatically generated - do not modify!

package web.media.capabilities

import js.promise.Promise

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaCapabilities)
 */
sealed external class MediaCapabilities {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaCapabilities/decodingInfo)
     */
    suspend fun decodingInfo(configuration: MediaDecodingConfiguration): MediaCapabilitiesDecodingInfo

    @JsName("decodingInfo")
    fun decodingInfoAsync(configuration: MediaDecodingConfiguration): Promise<MediaCapabilitiesDecodingInfo>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaCapabilities/encodingInfo)
     */
    suspend fun encodingInfo(configuration: MediaEncodingConfiguration): MediaCapabilitiesEncodingInfo

    @JsName("encodingInfo")
    fun encodingInfoAsync(configuration: MediaEncodingConfiguration): Promise<MediaCapabilitiesEncodingInfo>
}
