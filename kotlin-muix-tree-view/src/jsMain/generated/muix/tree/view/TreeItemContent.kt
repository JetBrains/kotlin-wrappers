// Automatically generated - do not modify!

@file:JsModule("@mui/x-tree-view/TreeItemContent")

package muix.tree.view

import web.cssom.ClassName

external interface TreeItemContentProps :
    react.dom.html.HTMLAttributes<web.html.HTMLElement>,
    react.PropsWithClassName {
    /**
     * className applied to the root element.
     */
    override var className: ClassName?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic

    /**
     * The tree node label.
     */
    var label: react.ReactNode?

    /**
     * The id of the node.
     */
    var nodeId: String

    /**
     * The icon to display next to the tree node's label.
     */
    var icon: react.ReactNode?

    /**
     * The icon to display next to the tree node's label. Either an expansion or collapse icon.
     */
    var expansionIcon: react.ReactNode?

    /**
     * The icon to display next to the tree node's label. Either a parent or end icon.
     */
    var displayIcon: react.ReactNode?
}

/**
 * @ignore - internal component.
 */
@JsName("default")
external val TreeItemContent: react.FC<TreeItemContentProps>
