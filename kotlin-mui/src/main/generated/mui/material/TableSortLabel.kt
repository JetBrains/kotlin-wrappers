// Automatically generated - do not modify!

@file:JsModule("@mui/material/TableSortLabel")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface TableSortLabelProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLSpanElement>,
    react.PropsWithChildren {
    /**
     * If `true`, the label will have the active styling (should be true for the sorted column).
     * @default false
     */
    var active: Boolean?

    /**
     * Label contents, the arrow will be appended automatically.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TableSortLabelClasses?

    /**
     * The current sort direction.
     * @default 'asc'
     */
    var direction: mui.system.Union? /* 'asc' | 'desc' */

    /**
     * Hide sort icon when active is false.
     * @default false
     */
    var hideSortIcon: Boolean?

    /**
     * Sort icon to use.
     * @default ArrowDownwardIcon
     */
    var IconComponent: react.ComponentType<*>?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 * A button based label for placing inside `TableCell` for column sorting.
 *
 * Demos:
 *
 * - [Tables](https://mui.com/components/tables/)
 *
 * API:
 *
 * - [TableSortLabel API](https://mui.com/api/table-sort-label/)
 * - inherits [ButtonBase API](https://mui.com/api/button-base/)
 */
@JsName("default")
external val TableSortLabel: react.FC<TableSortLabelProps>
