// Automatically generated - do not modify!

package muix.tree.view

import react.ElementType
import react.Props

external interface TreeViewClasses {
    /** Styles applied to the root element. */
    var root: String

    /** Styles applied to the item's root element. */
    var item: String

    /** Styles applied to the item's content element. */
    var itemContent: String

    /** Styles applied to the item's transition element. */
    var itemGroupTransition: String

    /** Styles applied to the item's icon container element icon. */
    var itemIconContainer: String

    /** Styles applied to the item's label element. */
    var itemLabel: String

    /** Styles applied to the item's label input element (visible only when editing is enabled). */
    var itemLabelInput: String

    /** Styles applied to the item's checkbox element. */
    var itemCheckbox: String

    /** Styles applied to the item's drag and drop overlay element. */
    var itemDragAndDropOverlay: String

    /** Styles applied to the item's error icon element */
    var itemErrorIcon: String

    /** Styles applied to the item's loading icon element */
    var itemLoadingIcon: String

    /** Styles applied to the item loader element. */
    var itemLoader: String
}

external interface TreeViewSlots {
    /**
     * The default icon used to collapse the item.
     */
    var collapseIcon: ElementType<*>?

    /**
     * The default icon used to expand the item.
     */
    var expandIcon: ElementType<*>?

    /**
     * The default icon displayed next to an end item.
     * This is applied to all Tree Items and can be overridden by the TreeItem `icon` slot prop.
     */
    var endIcon: ElementType<*>?
}

external interface TreeViewSlotProps : Props {
    var collapseIcon: Props?

    var expandIcon: Props?

    var endIcon: Props?
}

external interface TreeViewStyleContextSlots : TreeViewSlots {
    /**
     * Component rendered instead of the default loading rows.
     */
    var loading: ElementType<*>?

    /**
     * Component rendered for each loading row. The default renders a skeleton row.
     */
    var itemLoader: ElementType<*>?
}

external interface TreeViewStyleContextSlotProps :
    TreeViewSlotProps {
    var loading: Props?

    var itemLoader: Props?
}

external interface TreeViewStyleContextValue {
    var classes: TreeViewClasses

    var slots: TreeViewStyleContextSlots

    var slotProps: TreeViewStyleContextSlotProps
}
