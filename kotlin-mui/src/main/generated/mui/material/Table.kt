// Automatically generated - do not modify!

@file:JsModule("@mui/material/Table")
@file:JsNonModule

package mui.material

external interface TableProps : react.PropsWithChildren {
    /**
     * The content of the table, normally `TableHead` and `TableBody`.
     */
    override var children: Array<out react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TableClasses

    /**
     * Allows TableCells to inherit padding of the Table.
     * @default 'normal'
     */
    var padding: Union /* 'normal' | 'checkbox' | 'none' */

    /**
     * Allows TableCells to inherit size of the Table.
     * @default 'medium'
     */
    var size: Union /* 'small' | 'medium', TablePropsSizeOverrides */

    /**
     * Set the header sticky.
     *
     * ⚠️ It doesn't work with IE11.
     * @default false
     */
    var stickyHeader: Boolean

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>
}

/**
 *
 * Demos:
 *
 * - [Tables](https://mui.com/components/tables/)
 *
 * API:
 *
 * - [Table API](https://mui.com/api/table/)
 */
@JsName("default")
external val Table: react.FC<TableProps>
