// Automatically generated - do not modify!

@file:JsModule("@mui/x-tree-view/TreeItemContent")

package muix.tree.view

import web.cssom.ClassName

external interface TreeItemContentProps :
    react.dom.html.HTMLAttributes<web.html.HTMLElement>,
    react.PropsWithClassName {
    override var className: ClassName?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: Classes

    interface Classes {
        val root: ClassName
        val expanded: ClassName
        val selected: ClassName
        val focused: ClassName
        val disabled: ClassName
        val iconContainer: ClassName
        val label: ClassName
        val checkbox: ClassName
        val labelInput: ClassName
        val editing: ClassName
        val editable: ClassName
    }

    /**
     * The Tree Item label.
     */
    var label: react.ReactNode?

    /**
     * The id of the item.
     */
    var itemId: String

    /**
     * The icon to display next to the Tree Item's label.
     */
    var icon: react.ReactNode?

    /**
     * The icon to display next to the Tree Item's label. Either an expansion or collapse icon.
     */
    var expansionIcon: react.ReactNode?

    /**
     * The icon to display next to the Tree Item's label. Either a parent or end icon.
     */
    var displayIcon: react.ReactNode?

    var dragAndDropOverlayProps: TreeItem2DragAndDropOverlayProps?

    var labelInputProps: TreeItem2LabelInputProps?
}

/**
 * @ignore - internal component.
 */
external val TreeItemContent: react.FC<TreeItemContentProps>
