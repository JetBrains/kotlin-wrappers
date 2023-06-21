// Automatically generated - do not modify!

package web.cssom

import js.core.ReadonlyArray

sealed external class CSSStyleValue {
    companion object {
        /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleValue/parse_static) */
        fun parse(
            property: String,
            cssText: String,
        ): CSSStyleValue

        /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleValue/parseAll_static) */
        fun parseAll(
            property: String,
            cssText: String,
        ): ReadonlyArray<CSSStyleValue>
    }
}
