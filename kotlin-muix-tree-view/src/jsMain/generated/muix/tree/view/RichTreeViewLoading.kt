// Automatically generated - do not modify!

package muix.tree.view

import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

/**
 * The props of the `loading` slot: the `div` props plus the two the loading UI reads
 * (`SlotComponentProps<'div', RichTreeViewLoadingSlotOwnProps, …>` upstream).
 */
external interface RichTreeViewLoadingSlotOwnProps : HTMLAttributes<HTMLDivElement> {
    /**
     * The number of loading rows to render.
     * The children of a lazily loading item use `getChildrenCount()` as the default instead.
     * @default 5
     */
    var itemsCount: Int?

    /**
     * A message describing the loading state.
     * The default loading rows do not render it.
     * It is forwarded to a custom `loading` slot component.
     */
    var message: ReactNode?
}

/**
 * The owner state of the `loading` slot.
 */
external interface RichTreeViewLoadingSlotOwnerState {
    /**
     * The id of the item whose children are loading.
     * `null` while the whole tree is loading.
     */
    var itemId: TreeViewItemId?
}
