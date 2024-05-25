// Automatically generated - do not modify!

@file:JsModule("@mui/x-tree-view/TreeItemContent")

package muix.tree.view

import web.cssom.ClassName
import web.html.HTMLElement

external interface TreeItemContentProps :
    react.dom.html.HTMLAttributes<HTMLElement>,
    react.PropsWithClassName {
    override var className: ClassName?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic

    /**
     * The tree item label.
     */
    var label: react.ReactNode?

    /**
     * The id of the item.
     */
    var itemId: String

    /**
     * The icon to display next to the tree item's label.
     */
    var icon: react.ReactNode?

    /**
     * The icon to display next to the tree item's label. Either an expansion or collapse icon.
     */
    var expansionIcon: react.ReactNode?

    /**
     * The icon to display next to the tree item's label. Either a parent or end icon.
     */
    var displayIcon: react.ReactNode?
}

/**
 * @ignore - internal component.
 */
external val TreeItemContent: react.FC<TreeItemContentProps>
