// Automatically generated - do not modify!

package muix.tree.view

import js.core.ReadonlyArray
import mui.material.styles.Theme
import mui.system.SxProps
import web.cssom.ClassName

external interface TreeViewPropsBase :
    react.dom.html.HTMLAttributes<web.html.HTMLUListElement>,
    react.PropsWithChildren,
    react.PropsWithClassName,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * className applied to the root element.
     */
    override var className: ClassName?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TreeViewClasses?

    /**
     * The default icon used to collapse the node.
     */
    var defaultCollapseIcon: react.ReactNode?

    /**
     * The default icon displayed next to a end node. This is applied to all
     * tree nodes and can be overridden by the TreeItem `icon` prop.
     */
    var defaultEndIcon: react.ReactNode?

    /**
     * Expanded node ids.
     * Used when the item's expansion are not controlled.
     * @default []
     */
    var defaultExpanded: ReadonlyArray<String>?

    /**
     * The default icon used to expand the node.
     */
    var defaultExpandIcon: react.ReactNode?

    /**
     * The default icon displayed next to a parent node. This is applied to all
     * parent nodes and can be overridden by the TreeItem `icon` prop.
     */
    var defaultParentIcon: react.ReactNode?

    /**
     * If `true`, will allow focus on disabled items.
     * @default false
     */
    var disabledItemsFocusable: Boolean?

    /**
     * If `true` selection is disabled.
     * @default false
     */
    var disableSelection: Boolean?

    /**
     * Expanded node ids.
     * Used when the item's expansion are controlled.
     */
    var expanded: ReadonlyArray<String>?

    /**
     * This prop is used to help implement the accessibility logic.
     * If you don't provide this prop. It falls back to a randomly generated id.
     */
    override var id: String?

    /**
     * Callback fired when tree items are focused.
     * @param {React.SyntheticEvent} event The event source of the callback **Warning**: This is a generic event not a focus event.
     * @param {string} nodeId The id of the node focused.
     * @param {string} value of the focused node.
     */
    var onNodeFocus: ((event: react.dom.events.SyntheticEvent<*, *>, nodeId: String) -> Unit)?

    /**
     * Callback fired when tree items are expanded/collapsed.
     * @param {React.SyntheticEvent} event The event source of the callback.
     * @param {array} nodeIds The ids of the expanded nodes.
     */
    var onNodeToggle: ((event: react.dom.events.SyntheticEvent<*, *>, nodeIds: ReadonlyArray<String>) -> Unit)?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface MultiSelectTreeViewProps :
    TreeViewPropsBase {
    /**
     * Selected node ids. (Uncontrolled)
     * When `multiSelect` is true this takes an array of strings; when false (default) a string.
     * @default []
     */
    var defaultSelected: ReadonlyArray<String>?

    /**
     * Selected node ids. (Controlled)
     * When `multiSelect` is true this takes an array of strings; when false (default) a string.
     */
    var selected: ReadonlyArray<String>?

    /**
     * If true `ctrl` and `shift` will trigger multiselect.
     * @default false
     */
    var multiSelect: Boolean? /* true */

    /**
     * Callback fired when tree items are selected/unselected.
     * @param {React.SyntheticEvent} event The event source of the callback
     * @param {string[] | string} nodeIds Ids of the selected nodes. When `multiSelect` is true
     * this is an array of strings; when false (default) a string.
     */
    var onNodeSelect: ((event: react.dom.events.SyntheticEvent<*, *>, nodeIds: ReadonlyArray<String>) -> Unit)?
}

external interface SingleSelectTreeViewProps :
    TreeViewPropsBase {
    /**
     * Selected node ids. (Uncontrolled)
     * When `multiSelect` is true this takes an array of strings; when false (default) a string.
     * @default []
     */
    var defaultSelected: String?

    /**
     * Selected node ids. (Controlled)
     * When `multiSelect` is true this takes an array of strings; when false (default) a string.
     */
    var selected: String?

    /**
     * If true `ctrl` and `shift` will trigger multiselect.
     * @default false
     */
    var multiSelect: Boolean? /* false */

    /**
     * Callback fired when tree items are selected/unselected.
     * @param {React.SyntheticEvent} event The event source of the callback
     * @param {string[] | string} nodeIds Ids of the selected nodes. When `multiSelect` is true
     * this is an array of strings; when false (default) a string.
     */
    var onNodeSelect: ((event: react.dom.events.SyntheticEvent<*, *>, nodeIds: String) -> Unit)?
}

external interface TreeViewNode {
    var id: String

    var idAttribute: String

    var index: Number

    var parentId: String?

    var expandable: Boolean

    var disabled: dynamic
}

external interface TreeViewItemRange {
    var start: String?

    var end: String?

    var next: String?

    var current: String?
}

external interface TreeViewContextValue {
    var registerNode: (node: TreeViewNode) -> Unit

    var unregisterNode: (nodeId: String) -> Unit

    var isFocused: (nodeId: String) -> Boolean

    var isSelected: (nodeId: String) -> Boolean

    var isExpanded: (nodeId: String) -> Boolean

    var isExpandable: (nodeId: String) -> Boolean

    var isDisabled: (nodeId: String) -> Boolean

    var mapFirstChar: (nodeId: String, firstChar: String) -> Unit

    var unMapFirstChar: (nodeId: String) -> Unit

    var focus: (event: react.dom.events.SyntheticEvent<*, *>, nodeId: String) -> Unit

    var toggleExpansion: (event: react.dom.events.SyntheticEvent<*, *>, value: String?) -> Unit

    var selectNode: (event: react.dom.events.SyntheticEvent<*, *>, nodeId: String, multiple: Boolean?) -> Unit

    var selectRange: (event: react.dom.events.SyntheticEvent<*, *>, nodes: TreeViewItemRange, stacked: Boolean?) -> Unit

    var multiSelect: Boolean

    var disabledItemsFocusable: Boolean

    var treeId: String

    var icons: dynamic
}
