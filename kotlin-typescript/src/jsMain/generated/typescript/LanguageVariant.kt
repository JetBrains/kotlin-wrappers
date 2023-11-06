// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsUnion

@JsUnion
sealed external interface LanguageVariant {
    companion object {
        @JsIntValue(0)
        val Standard: LanguageVariant

        @JsIntValue(1)
        val JSX: LanguageVariant
    }
}
