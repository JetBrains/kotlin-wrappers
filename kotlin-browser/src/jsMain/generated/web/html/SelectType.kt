// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface SelectType {
    companion object {
        @JsValue("select-one")
        val selectOne: SelectType

        @JsValue("select-multiple")
        val selectMultiple: SelectType
    }
}
