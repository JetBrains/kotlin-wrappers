// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ListFormatType {
    companion object {
        @JsValue("conjunction")
        val conjunction: ListFormatType

        @JsValue("disjunction")
        val disjunction: ListFormatType

        @JsValue("unit")
        val unit: ListFormatType
    }
}
