// Automatically generated - do not modify!

@file:JsModule("@mui/material/Table")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface TableProps :
    react.dom.html.TableHTMLAttributes<web.html.HTMLTableElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
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
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Table](https://mui.com/material-ui/react-table/)
 *
 * API:
 *
 * - [Table API](https://mui.com/material-ui/api/table/)
 */
@JsName("default")
external val Table: react.FC<TableProps>
