// Automatically generated - do not modify!

package muix.tree.view

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import react.dom.events.SyntheticEvent
import web.html.HTMLElement

/**
 * The item model of a `SimpleTreeView` (`SimpleTreeViewItem` of `internals/SimpleTreeViewStore`).
 */
@JsPlainObject
external interface SimpleTreeViewItem {
    var id: TreeViewItemId
    var label: String
    var children: ReadonlyArray<SimpleTreeViewItem>?
}

@JsPlainObject
external interface SetIsItemDisabledParameters {
    var itemId: TreeViewItemId
    var shouldBeDisabled: Boolean?
}

@JsPlainObject
external interface SetItemExpansionParameters {
    var itemId: TreeViewItemId
    var event: SyntheticEvent<*, *>?
    var shouldBeExpanded: Boolean?
}

@JsPlainObject
external interface SetItemSelectionParameters {
    var itemId: TreeViewItemId
    var event: SyntheticEvent<*, *>?

    /**
     * If `true` the item will be selected. If `false` the item will be deselected. If not defined, the item's
     * selection status will be toggled.
     */
    var shouldBeSelected: Boolean?

    /**
     * If `true`, the other already selected items will remain selected, otherwise, they will be deselected.
     * Only relevant when `multiSelect` is `true`.
     */
    var keepExistingSelection: Boolean?
}

@JsPlainObject
external interface AddItemsParameters<R : Any> {
    /**
     * The items to add to the tree.
     */
    var items: ReadonlyArray<R>

    /**
     * The id of the item to add the items to.
     * If `null` or not defined, the items are added at the root level.
     * @default null
     */
    var parentId: TreeViewItemId?

    /**
     * The position in the parent's children at which the items are inserted.
     * If not defined, the items are appended after the existing children.
     */
    var index: Int?
}

/**
 * The object `apiRef` points at once the Tree View has rendered: the API of `MinimalTreeViewStore`, shared by
 * `SimpleTreeView` and `RichTreeView` (`TreeViewPublicAPI<TStore>` upstream).
 */
external interface TreeViewPublicAPI<out R : Any> {
    fun getItem(itemId: TreeViewItemId): R
    fun getItemDOMElement(itemId: TreeViewItemId): HTMLElement?
    fun getItemOrderedChildrenIds(itemId: TreeViewItemId?): ReadonlyArray<TreeViewItemId>
    fun getItemTree(): ReadonlyArray<R>
    fun getParentId(itemId: TreeViewItemId): TreeViewItemId?
    fun setIsItemDisabled(parameters: SetIsItemDisabledParameters)
    fun isItemExpanded(itemId: TreeViewItemId): Boolean
    fun setItemExpansion(parameters: SetItemExpansionParameters)
    fun focusItem(event: SyntheticEvent<*, *>?, itemId: TreeViewItemId)
    fun getItemSelection(itemId: TreeViewItemId): TreeViewItemSelectionStatus
    fun setItemSelection(parameters: SetItemSelectionParameters)
}

/**
 * The API of `RichTreeViewStore`: everything of [TreeViewPublicAPI] plus label editing and imperative item updates.
 */
external interface RichTreeViewPublicAPI<R : Any> : TreeViewPublicAPI<R> {
    fun setEditedItem(itemId: TreeViewItemId?)
    fun updateItemLabel(itemId: TreeViewItemId, label: String)
    fun addItems(parameters: AddItemsParameters<R>)
}
