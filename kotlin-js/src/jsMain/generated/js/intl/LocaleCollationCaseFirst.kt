// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface LocaleCollationCaseFirst {
    companion object {
        @JsValue("upper")
        val upper: LocaleCollationCaseFirst

        @JsValue("lower")
        val lower: LocaleCollationCaseFirst

        @JsValue("false")
        val `false`: LocaleCollationCaseFirst
    }
}
