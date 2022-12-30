// Automatically generated - do not modify!

package web.media.capabilities

import kotlin.js.Promise

sealed external class MediaCapabilities {
    fun decodingInfo(configuration: MediaDecodingConfiguration): Promise<MediaCapabilitiesDecodingInfo>
    fun encodingInfo(configuration: MediaEncodingConfiguration): Promise<MediaCapabilitiesEncodingInfo>
}
