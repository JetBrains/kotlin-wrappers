// Automatically generated - do not modify!

package web.highlight

import js.array.ReadonlyArray
import js.collections.MutableMapLike
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * The **`HighlightRegistry`** interface of the CSS Custom Highlight API is used to register Highlight objects to be styled using the API. It is accessed via CSS.highlights.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HighlightRegistry)
 */
sealed /* final */
external class HighlightRegistry
private constructor() :
    MutableMapLike<JsString, Highlight> {
    /**
     * The **`highlightsFromPoint()`** method of the HighlightRegistry interface returns an array of objects representing the custom highlights applied at a specific point within the viewport.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HighlightRegistry/highlightsFromPoint)
     */
    fun highlightsFromPoint(
        x: Float,
        y: Float,
        options: HighlightsFromPointOptions = definedExternally,
    ): ReadonlyArray<HighlightHitResult>
}
