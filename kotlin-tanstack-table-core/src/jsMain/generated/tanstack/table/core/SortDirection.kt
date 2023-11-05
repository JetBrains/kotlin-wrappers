// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package tanstack.table.core

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface SortDirection {
    companion object {
        @JsValue("asc")
        val asc: SortDirection

        @JsValue("desc")
        val desc: SortDirection
    }
}
