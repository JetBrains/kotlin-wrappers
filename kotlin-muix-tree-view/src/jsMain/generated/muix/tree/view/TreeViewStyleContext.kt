// Automatically generated - do not modify!

package muix.tree.view

import kotlinx.js.JsPlainObject
import react.ElementType
import react.Props
import react.dom.svg.SVGAttributes
import web.svg.SVGElement

@JsPlainObject
external interface TreeViewClasses {
    /** Styles applied to the root element. */
    val root: String

    /** Styles applied to the item's root element. */
    val item: String

    /** Styles applied to the item's content element. */
    val itemContent: String

    /** Styles applied to the item's transition element. */
    val itemGroupTransition: String

    /** Styles applied to the item's icon container element icon. */
    val itemIconContainer: String

    /** Styles applied to the item's label element. */
    val itemLabel: String

    /** Styles applied to the item's label input element (visible only when editing is enabled). */
    val itemLabelInput: String

    /** Styles applied to the item's checkbox element. */
    val itemCheckbox: String

    /** Styles applied to the item's drag and drop overlay element. */
    val itemDragAndDropOverlay: String

    /** Styles applied to the item's error icon element */
    val itemErrorIcon: String

    /** Styles applied to the item's loading icon element */
    val itemLoadingIcon: String

    /** Styles applied to the item loader element. */
    val itemLoader: String
}

@JsPlainObject
external interface TreeViewSlots {
    /**
     * The default icon used to collapse the item.
     */
    val collapseIcon: ElementType<*>?

    /**
     * The default icon used to expand the item.
     */
    val expandIcon: ElementType<*>?

    /**
     * The default icon displayed next to an end item.
     * This is applied to all Tree Items and can be overridden by the TreeItem `icon` slot prop.
     */
    val endIcon: ElementType<*>?
}

external interface TreeViewSlotProps : Props {
    var collapseIcon: SVGAttributes<SVGElement>?

    var expandIcon: SVGAttributes<SVGElement>?

    var endIcon: SVGAttributes<SVGElement>?
}

@JsPlainObject
external interface TreeViewStyleContextSlots : TreeViewSlots {
    /**
     * Component rendered instead of the default loading rows.
     */
    val loading: ElementType<*>?

    /**
     * Component rendered for each loading row. The default renders a skeleton row.
     */
    val itemLoader: ElementType<*>?
}

external interface TreeViewStyleContextSlotProps :
    TreeViewSlotProps {
    var loading: SlotComponentProps<RichTreeViewLoadingSlotOwnProps, RichTreeViewLoadingSlotOwnerState>?

    var itemLoader: SlotComponentProps<TreeItemLoaderProps, TreeItemLoaderOwnerState>?
}

@JsPlainObject
external interface TreeViewStyleContextValue {
    val classes: TreeViewClasses

    val slots: TreeViewStyleContextSlots

    val slotProps: TreeViewStyleContextSlotProps
}
