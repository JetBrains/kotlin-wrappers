// Automatically generated - do not modify!

package web.dom.observers

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
