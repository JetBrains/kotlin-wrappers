// Automatically generated - do not modify!

package web.cssom

import js.core.ReadonlyArray

sealed external class CSSStyleValue {
    companion object {
        fun parse(
            property: String,
            cssText: String,
        ): CSSStyleValue

        fun parseAll(
            property: String,
            cssText: String,
        ): ReadonlyArray<CSSStyleValue>
    }
}
