// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * Options for creating a [TreeView]
 */
external interface TreeViewOptions<T : JsAny?> {
    /**
     * A data provider that provides tree data.
     */
    var treeDataProvider: TreeDataProvider<T>

    /**
     * Whether to show collapse all action or not.
     */
    var showCollapseAll: Boolean?

    /**
     * Whether the tree supports multi-select. When the tree supports multi-select and a command is executed from the tree,
     * the first argument to the command is the tree item that the command was executed on and the second argument is an
     * array containing all selected tree items.
     */
    var canSelectMany: Boolean?

    /**
     * An optional interface to implement drag and drop in the tree view.
     */
    var dragAndDropController: TreeDragAndDropController<T>?

    /**
     * By default, when the children of a tree item have already been fetched, child checkboxes are automatically managed based on the checked state of the parent tree item.
     * If the tree item is collapsed by default (meaning that the children haven't yet been fetched) then child checkboxes will not be updated.
     * To override this behavior and manage child and parent checkbox state in the extension, set this to `true`.
     *
     * Examples where [TreeViewOptions.manageCheckboxStateManually] is false, the default behavior:
     *
     * 1. A tree item is checked, then its children are fetched. The children will be checked.
     *
     * 2. A tree item's parent is checked. The tree item and all of it's siblings will be checked.
     *   - [ ] Parent
     *     - [ ] Child 1
     *     - [ ] Child 2
     *   When the user checks Parent, the tree will look like this:
     *   - [x] Parent
     *     - [x] Child 1
     *     - [x] Child 2
     *
     * 3. A tree item and all of it's siblings are checked. The parent will be checked.
     *   - [ ] Parent
     *     - [ ] Child 1
     *     - [ ] Child 2
     *   When the user checks Child 1 and Child 2, the tree will look like this:
     *   - [x] Parent
     *     - [x] Child 1
     *     - [x] Child 2
     *
     * 4. A tree item is unchecked. The parent will be unchecked.
     *   - [x] Parent
     *     - [x] Child 1
     *     - [x] Child 2
     *   When the user unchecks Child 1, the tree will look like this:
     *   - [ ] Parent
     *     - [ ] Child 1
     *     - [x] Child 2
     */
    var manageCheckboxStateManually: Boolean?
}
