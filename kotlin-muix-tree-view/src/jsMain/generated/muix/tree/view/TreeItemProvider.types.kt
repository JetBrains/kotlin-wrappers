// Automatically generated - do not modify!

package muix.tree.view

import react.PropsWithChildren
import react.ReactNode
import web.dom.ElementId

external interface TreeItemProviderProps : PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

    /**
     * The id of the item.
     */
    var itemId: String

    /**
     * The id attribute of the item.
     */
    var id: ElementId?
}
