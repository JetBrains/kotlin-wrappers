// Automatically generated - do not modify!

package web.fonts

import js.buffer.BufferSource
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`FontFace`** interface of the CSS Font Loading API represents a single usable font face.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace)
 */
open external class FontFace(
    /**
     * The **`FontFace.family`** property allows the author to get or set the font family of a FontFace object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/family)
     */
    var family: String,
    source: String,
    descriptors: FontFaceDescriptors = definedExternally,
) {
    constructor(
        family: String,
        source: BufferSource,
        descriptors: FontFaceDescriptors = definedExternally,
    )

    /**
     * The **`ascentOverride`** property of the FontFace interface returns and sets the ascent metric for the font, the height above the baseline that CSS uses to lay out line boxes in an inline formatting context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/ascentOverride)
     */
    var ascentOverride: String

    /**
     * The **`descentOverride`** property of the FontFace interface returns and sets the value of the @font-face/descent-override descriptor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/descentOverride)
     */
    var descentOverride: String

    /**
     * The **`display`** property of the FontFace interface determines how a font face is displayed based on whether and when it is downloaded and ready to use.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/display)
     */
    var display: FontDisplay

    /**
     * The **`featureSettings`** property of the FontFace interface retrieves or sets infrequently used font features that are not available from a font's variant properties.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/featureSettings)
     */
    var featureSettings: String

    /**
     * The **`lineGapOverride`** property of the FontFace interface returns and sets the value of the @font-face/line-gap-override descriptor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/lineGapOverride)
     */
    var lineGapOverride: String

    /**
     * The **`loaded`** read-only property of the FontFace interface returns a Promise that resolves with the current `FontFace` object when the font specified in the object's constructor is done loading or rejects with a `SyntaxError`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/loaded)
     */
    val loaded: Promise<FontFace>

    /**
     * The **`status`** read-only property of the FontFace interface returns an enumerated value indicating the status of the font, one of `'unloaded'`, `'loading'`, `'loaded'`, or `'error'`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/status)
     */
    val status: FontFaceLoadStatus

    /**
     * The **`stretch`** property of the FontFace interface retrieves or sets how the font stretches.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/stretch)
     */
    var stretch: String

    /**
     * The **`style`** property of the FontFace interface retrieves or sets the font's style.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/style)
     */
    var style: String

    /**
     * The **`unicodeRange`** property of the FontFace interface retrieves or sets the range of unicode code points encompassing the font.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/unicodeRange)
     */
    var unicodeRange: String

    /**
     * The **`weight`** property of the FontFace interface retrieves or sets the weight of the font.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/weight)
     */
    var weight: String

    /**
     * The **`load()`** method of the FontFace interface requests and loads a font whose `source` was specified as a URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/load)
     */
    @JsName("load")
    fun loadAsync(): Promise<FontFace>
}

/**
 * The **`load()`** method of the FontFace interface requests and loads a font whose `source` was specified as a URL.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/load)
 */
suspend inline fun FontFace.load(): FontFace {
    return awaitPromiseLike(loadAsync())
}
