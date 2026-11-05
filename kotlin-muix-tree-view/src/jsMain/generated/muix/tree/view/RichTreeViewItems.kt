// Automatically generated - do not modify!

package muix.tree.view

import kotlinx.js.JsPlainObject
import react.ElementType
import react.Props
import react.dom.html.HTMLAttributes
import web.html.HTMLUListElement

/**
 * The owner state handed to the `item` slot's props resolver.
 */
@JsPlainObject
external interface RichTreeViewItemsOwnerState {
    var itemId: TreeViewItemId
    var label: String
}

@JsPlainObject
external interface RichTreeViewItemsSlots {
    /**
     * Custom component to render a Tree Item.
     * @default TreeItem.
     */
    var item: ElementType<TreeItemProps>?
}

external interface RichTreeViewItemsSlotProps : Props {
    var item: SlotComponentProps<TreeItemProps, RichTreeViewItemsOwnerState>?
    var root: SlotComponentProps<HTMLAttributes<HTMLUListElement>, RichTreeViewProps<*>>?
}
