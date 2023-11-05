// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface DisplayNamesType {
    companion object {
        @JsValue("language")
        val language: DisplayNamesType

        @JsValue("region")
        val region: DisplayNamesType

        @JsValue("script")
        val script: DisplayNamesType

        @JsValue("calendar")
        val calendar: DisplayNamesType

        @JsValue("dateTimeField")
        val dateTimeField: DisplayNamesType

        @JsValue("currency")
        val currency: DisplayNamesType
    }
}
