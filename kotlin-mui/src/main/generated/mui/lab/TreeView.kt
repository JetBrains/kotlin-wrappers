// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TreeView")
@file:JsNonModule

package mui.lab

import kotlinx.js.ReadonlyArray
import mui.material.styles.Theme
import mui.system.SxProps

external interface TreeViewProps : react.Props

external interface TreeViewPropsBase :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLUListElement>,
    react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

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
     * Expanded node ids. (Uncontrolled)
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
     * Expanded node ids. (Controlled)
     */
    var expanded: ReadonlyArray<String>?

    /**
     * This prop is used to help implement the accessibility logic.
     * If you don't provide this prop. It falls back to a randomly generated id.
     */
    override var id: String?

    /**
     * Callback fired when tree items are focused.
     *
     * @param {React.SyntheticEvent} event The event source of the callback **Warning**: This is a generic event not a focus event.
     * @param {string} value of the focused node.
     */
    var onNodeFocus: ((event: react.dom.events.SyntheticEvent<*, *>, nodeId: String) -> Unit)?

    /**
     * Callback fired when tree items are expanded/collapsed.
     *
     * @param {React.SyntheticEvent} event The event source of the callback.
     * @param {array} nodeIds The ids of the expanded nodes.
     */
    var onNodeToggle: ((event: react.dom.events.SyntheticEvent<*, *>, nodeIds: ReadonlyArray<String>) -> Unit)?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>?
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
     *
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
     *
     * @param {React.SyntheticEvent} event The event source of the callback
     * @param {string[] | string} nodeIds Ids of the selected nodes. When `multiSelect` is true
     * this is an array of strings; when false (default) a string.
     */
    var onNodeSelect: ((event: react.dom.events.SyntheticEvent<*, *>, nodeIds: String) -> Unit)?
}

/**
 *
 * Demos:
 *
 * - [Tree View](https://mui.com/components/tree-view/)
 *
 * API:
 *
 * - [TreeView API](https://mui.com/api/tree-view/)
 */
@JsName("default")
external val TreeView: react.FC<TreeViewProps>
