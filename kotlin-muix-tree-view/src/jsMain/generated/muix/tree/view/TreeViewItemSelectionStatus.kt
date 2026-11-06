// Automatically generated - do not modify!

package muix.tree.view

import seskar.js.JsValue

sealed /* union */
external interface TreeViewItemSelectionStatus {
    companion object {
        @JsValue("selected")
        val selected: TreeViewItemSelectionStatus

        @JsValue("indeterminate")
        val indeterminate: TreeViewItemSelectionStatus

        @JsValue("unselected")
        val unselected: TreeViewItemSelectionStatus
    }
}
