// Automatically generated - do not modify!

package web.fonts

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferView
import kotlin.js.Promise

external class FontFace(
    family: String,
    source: String,
    descriptors: FontFaceDescriptors = definedExternally,
) {
    constructor(
        family: String,
        source: ArrayBuffer,
        descriptors: FontFaceDescriptors = definedExternally,
    )

    constructor(
        family: String,
        source: ArrayBufferView,
        descriptors: FontFaceDescriptors = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/ascentOverride) */
    var ascentOverride: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/descentOverride) */
    var descentOverride: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/display) */
    var display: FontDisplay

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/family) */
    var family: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/featureSettings) */
    var featureSettings: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/lineGapOverride) */
    var lineGapOverride: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/loaded) */
    val loaded: Promise<FontFace>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/status) */
    val status: FontFaceLoadStatus

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/stretch) */
    var stretch: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/style) */
    var style: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/unicodeRange) */
    var unicodeRange: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/variant) */
    var variant: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/weight) */
    var weight: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/load) */
    fun load(): Promise<FontFace>
}
