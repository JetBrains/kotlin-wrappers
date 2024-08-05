// Automatically generated - do not modify!

package muix.tree.view

import seskar.js.JsValue

sealed external interface TreeItem2DragAndDropOverlayAction {
    companion object {
        @JsValue("reorder-above")
        val reorderAbove: TreeItem2DragAndDropOverlayAction

        @JsValue("reorder-below")
        val reorderBelow: TreeItem2DragAndDropOverlayAction

        @JsValue("make-child")
        val makeChild: TreeItem2DragAndDropOverlayAction

        @JsValue("move-to-parent")
        val moveToParent: TreeItem2DragAndDropOverlayAction
    }
}
