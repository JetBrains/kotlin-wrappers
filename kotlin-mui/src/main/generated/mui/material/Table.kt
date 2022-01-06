// Automatically generated - do not modify!

@file:JsModule("@mui/material/Table")
@file:JsNonModule

package mui.material

external interface TableProps :
    react.dom.html.TableHTMLAttributes<org.w3c.dom.HTMLTableElement>,
    react.PropsWithChildren,
    mui.types.PropsWithComponent {
    /**
     * The content of the table, normally `TableHead` and `TableBody`.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TableClasses?

    /**
     * Allows TableCells to inherit padding of the Table.
     * @default 'normal'
     */
    var padding: TablePadding?

    /**
     * Allows TableCells to inherit size of the Table.
     * @default 'medium'
     */
    var size: BaseSize?

    /**
     * Set the header sticky.
     *
     * ⚠️ It doesn't work with IE11.
     * @default false
     */
    var stickyHeader: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?
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
