// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TreeView")
@file:JsNonModule

package mui.lab

import kotlinext.js.ReadonlyArray

external interface TreeViewProps : react.Props

external interface MultiSelectTreeViewProps : react.Props {
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
    var multiSelect: dynamic

    /**
     * Callback fired when tree items are selected/unselected.
     *
     * @param {React.SyntheticEvent} event The event source of the callback
     * @param {string[] | string} nodeIds Ids of the selected nodes. When `multiSelect` is true
     * this is an array of strings; when false (default) a string.
     */
    var onNodeSelect: ((event: react.dom.events.SyntheticEvent<*, *>, nodeIds: ReadonlyArray<String>) -> Unit)?
}

external interface SingleSelectTreeViewProps : react.Props {
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
    var multiSelect: dynamic

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
