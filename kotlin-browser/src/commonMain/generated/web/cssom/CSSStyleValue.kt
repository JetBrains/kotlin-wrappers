// Automatically generated - do not modify!

package web.cssom

import js.array.ReadonlyArray

/**
 * The **`CSSStyleValue`** interface of the CSS Typed Object Model API is the base class of all CSS values accessible through the Typed OM API.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleValue)
 */
open external class CSSStyleValue
private constructor() {
    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleValue/parse_static)
         */
        fun parse(
            property: String,
            cssText: String,
        ): CSSStyleValue

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleValue/parseAll_static)
         */
        fun parseAll(
            property: String,
            cssText: String,
        ): ReadonlyArray<CSSStyleValue>
    }
}
