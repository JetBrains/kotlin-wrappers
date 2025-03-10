// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.html

import seskar.js.JsValue

sealed external interface SelectType {
    companion object {
        @JsValue("select-one")
        val selectOne: SelectType

        @JsValue("select-multiple")
        val selectMultiple: SelectType
    }
}
