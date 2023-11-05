// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.dom.observers

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface MutationRecordType {
    companion object {
        @JsValue("attributes")
        val attributes: MutationRecordType

        @JsValue("characterData")
        val characterData: MutationRecordType

        @JsValue("childList")
        val childList: MutationRecordType
    }
}
