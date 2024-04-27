// Automatically generated - do not modify!

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
