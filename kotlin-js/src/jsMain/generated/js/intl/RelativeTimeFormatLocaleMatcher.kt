// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface RelativeTimeFormatLocaleMatcher {
    companion object {
        @JsValue("lookup")
        val lookup: RelativeTimeFormatLocaleMatcher

        @JsValue("best fit")
        val bestFit: RelativeTimeFormatLocaleMatcher
    }
}
