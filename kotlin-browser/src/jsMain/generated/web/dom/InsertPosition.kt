// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.dom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface InsertPosition {
    companion object {
        @JsValue("afterbegin")
        val afterbegin: InsertPosition

        @JsValue("afterend")
        val afterend: InsertPosition

        @JsValue("beforebegin")
        val beforebegin: InsertPosition

        @JsValue("beforeend")
        val beforeend: InsertPosition
    }
}
