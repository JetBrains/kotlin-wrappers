// Automatically generated - do not modify!

@file:JsModule("@mui/material/TableSortLabel")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.*
import react.dom.html.HTMLAttributes
import web.html.HTMLSpanElement

external interface TableSortLabelProps :
    TableSortLabelOwnProps,
    HTMLAttributes<HTMLSpanElement>,
    PropsWithComponent

external interface TableSortLabelSlots {
    /**
     * The component that renders the root slot.
     * @default span
     */
    var root: ElementType<*>?

    /**
     * The component that renders the icon slot.
     * @default ArrowDownwardIcon
     */
    var icon: ElementType<*>?
}

external interface TableSortLabelSlotProps : Props {
    /** TS: SlotProps< React.ElementType<React.HTMLAttributes<HTMLSpanElement>>, TableSortLabelRootSlotPropsOverrides, TableSortLabelOwnerState > */
    var root: Any?

    /** TS: SlotProps< React.ElementType<React.SVGAttributes<SVGSVGElement>>, TableSortLabelIconSlotPropsOverrides, TableSortLabelOwnerState > */
    var icon: Any?
}

external interface TableSortLabelSlotsAndSlotProps : Props {
    var slots: TableSortLabelSlots?

    var slotProps: TableSortLabelSlotProps?
}

external interface TableSortLabelOwnerState

external interface TableSortLabelOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * If `true`, the label will have the active styling (should be true for the sorted column).
     * @default false
     */
    var active: Boolean?

    /**
     * Label contents, the arrow will be appended automatically.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TableSortLabelClasses?

    /**
     * The current sort direction.
     * @default 'asc'
     */
    var direction: TableSortLabelDirection?

    /**
     * Hide sort icon when active is false.
     * @default false
     */
    var hideSortIcon: Boolean?

    /**
     * Sort icon to use.
     * @default ArrowDownwardIcon
     */
    var IconComponent: ComponentType<*>?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 * A button based label for placing inside `TableCell` for column sorting.
 *
 * Demos:
 *
 * - [Table](https://v6.mui.com/material-ui/react-table/)
 *
 * API:
 *
 * - [TableSortLabel API](https://v6.mui.com/material-ui/api/table-sort-label/)
 * - inherits [ButtonBase API](https://v6.mui.com/material-ui/api/button-base/)
 */
@JsName("default")
external val TableSortLabel: FC<TableSortLabelProps>
