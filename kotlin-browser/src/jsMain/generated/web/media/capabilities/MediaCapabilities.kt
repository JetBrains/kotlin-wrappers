// Automatically generated - do not modify!

package web.media.capabilities

import kotlin.js.Promise

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaCapabilities) */
sealed external class MediaCapabilities {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaCapabilities/decodingInfo) */
    fun decodingInfo(configuration: MediaDecodingConfiguration): Promise<MediaCapabilitiesDecodingInfo>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaCapabilities/encodingInfo) */
    fun encodingInfo(configuration: MediaEncodingConfiguration): Promise<MediaCapabilitiesEncodingInfo>
}
