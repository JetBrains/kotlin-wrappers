// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import seskar.js.JsValue

sealed external interface LocaleMatcher {
    companion object {
        @JsValue("lookup")
        val lookup: LocaleMatcher

        @JsValue("best fit")
        val bestFit: LocaleMatcher
    }
}
