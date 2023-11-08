// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface OrganizeImportsMode {
    companion object {
        @JsValue("All")
        val All: OrganizeImportsMode

        @JsValue("SortAndCombine")
        val SortAndCombine: OrganizeImportsMode

        @JsValue("RemoveUnused")
        val RemoveUnused: OrganizeImportsMode
    }
}
