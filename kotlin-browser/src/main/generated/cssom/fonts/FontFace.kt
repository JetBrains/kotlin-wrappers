// Automatically generated - do not modify!

package cssom.fonts

import kotlin.js.Promise

external class FontFace(
    family: String,
    source: String, /* | BinaryData */
    descriptors: FontFaceDescriptors = definedExternally,
) {
    var ascentOverride: String
    var descentOverride: String
    var display: String
    var family: String
    var featureSettings: String
    var lineGapOverride: String
    val loaded: Promise<FontFace>
    val status: FontFaceLoadStatus
    var stretch: String
    var style: String
    var unicodeRange: String
    var variant: String
    var variationSettings: String
    var weight: String
    fun load(): Promise<FontFace>
}
