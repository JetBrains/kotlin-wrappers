// Automatically generated - do not modify!

package muix.tree.view

import seskar.js.JsValue

sealed /* union */
external interface TreeViewItemsReorderingAction {
    companion object {
        @JsValue("reorder-above")
        val reorderAbove: TreeViewItemsReorderingAction

        @JsValue("reorder-below")
        val reorderBelow: TreeViewItemsReorderingAction

        @JsValue("make-child")
        val makeChild: TreeViewItemsReorderingAction

        @JsValue("move-to-parent")
        val moveToParent: TreeViewItemsReorderingAction
    }
}
