// Automatically generated - do not modify!

@file:JsModule("@mui/material/Table")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.TableHTMLAttributes
import web.html.HTMLTableElement

external interface TableProps :
    TableOwnProps,
    TableHTMLAttributes<HTMLTableElement>,
    PropsWithComponent

external interface TablePropsSizeOverrides

external interface TableOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the table, normally `TableHead` and `TableBody`.
     */
    override var children: ReactNode?

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
 * - [Table](https://v6.mui.com/material-ui/react-table/)
 *
 * API:
 *
 * - [Table API](https://v6.mui.com/material-ui/api/table/)
 */
@JsName("default")
external val Table: FC<TableProps>
