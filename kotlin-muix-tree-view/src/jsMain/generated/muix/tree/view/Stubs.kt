// Automatically generated - do not modify!

package muix.tree.view

import js.array.ReadonlyArray
import react.Props
import react.dom.events.MouseEvent
import react.dom.events.SyntheticEvent

typealias TreeViewItemId = String

external interface TreeViewStoreParameters : Props {
    var disabledItemsFocusable: Boolean?
    var expandedItems: ReadonlyArray<TreeViewItemId>?
    var defaultExpandedItems: ReadonlyArray<TreeViewItemId>?
    var onExpandedItemsChange: ((event: SyntheticEvent<*, *>?, itemIds: ReadonlyArray<TreeViewItemId>) -> Unit)?
    var onItemExpansionToggle: ((event: SyntheticEvent<*, *>?, itemId: TreeViewItemId, isExpanded: Boolean) -> Unit)?
    var expansionTrigger: String?
    var disableSelection: Boolean?
    var selectedItems: Any?
    var defaultSelectedItems: Any?
    var multiSelect: Boolean?
    var checkboxSelection: Boolean?
    var onSelectedItemsChange: ((event: SyntheticEvent<*, *>?, itemIds: Any?) -> Unit)?
    var onItemSelectionToggle: ((event: SyntheticEvent<*, *>?, itemId: TreeViewItemId, isSelected: Boolean) -> Unit)?
    var onItemClick: ((event: MouseEvent<*, *>, itemId: TreeViewItemId) -> Unit)?
    var onItemFocus: ((event: SyntheticEvent<*, *>?, itemId: TreeViewItemId) -> Unit)?
    var itemChildrenIndentation: Any?
    var itemHeight: Double?
}

external interface RichTreeViewStoreParameters : TreeViewStoreParameters {
    var items: ReadonlyArray<*>?
    var isItemDisabled: ((item: Any) -> Boolean)?
    var isItemSelectionDisabled: ((item: Any) -> Boolean)?
    var getItemLabel: ((item: Any) -> String)?
    var getItemId: ((item: Any) -> TreeViewItemId)?
    var getItemChildren: ((item: Any) -> ReadonlyArray<*>?)?
    var isItemEditable: Any?
    var onItemLabelChange: ((itemId: TreeViewItemId, newLabel: String) -> Unit)?
}
