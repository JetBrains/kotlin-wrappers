// Automatically generated - do not modify!

package media.capabilities

sealed external interface VideoConfiguration {
    var bitrate: Int
    var colorGamut: ColorGamut?
    var contentType: String
    var framerate: Double
    var hdrMetadataType: HdrMetadataType?
    var height: Double
    var scalabilityMode: String?
    var transferFunction: TransferFunction?
    var width: Double
}
