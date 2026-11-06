// Automatically generated - do not modify!

package muix.tree.view

import web.cssom.CustomPropertyName
import web.cssom.Length

/**
 * The CSS custom properties the Tree View sets at runtime, for styles that need to read them: the root carries
 * [itemChildrenIndentation] (`useTreeViewRootProps`), every item root carries [itemDepth] and, when the `itemHeight`
 * prop is set, [itemHeight] (`useTreeItem`). Nothing in the package declares them, so they are listed here.
 */
object TreeViewCssVars {
    /**
     * `--TreeView-itemChildrenIndentation`: the `itemChildrenIndentation` prop as a length (`24` becomes `24px`).
     */
    val itemChildrenIndentation: CustomPropertyName<Length> =
        CustomPropertyName("--TreeView-itemChildrenIndentation")

    /**
     * `--TreeView-itemDepth`: the zero-based depth of the item, a plain number.
     */
    val itemDepth: CustomPropertyName<Double> =
        CustomPropertyName("--TreeView-itemDepth")

    /**
     * `--TreeView-itemHeight`: the `itemHeight` prop as a length; only set when the prop is.
     */
    val itemHeight: CustomPropertyName<Length> =
        CustomPropertyName("--TreeView-itemHeight")
}

/**
 * The `data-*` attributes `useTreeItem` puts on the item's content element while the matching status is on
 * (`data-expanded=""`, …), for attribute selectors in styles and DOM queries.
 */
object TreeItemDataAttributes {
    const val expanded: String = "data-expanded"
    const val selected: String = "data-selected"
    const val focused: String = "data-focused"
    const val disabled: String = "data-disabled"
    const val editing: String = "data-editing"
    const val editable: String = "data-editable"
}
