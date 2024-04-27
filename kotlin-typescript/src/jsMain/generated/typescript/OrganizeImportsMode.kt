// Automatically generated - do not modify!

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
