// Automatically generated - do not modify!

@file:JsModule("@mui/material/TableRow")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface TableRowProps :
    TableRowOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLTableRowElement>,
    mui.types.PropsWithComponent

external interface TableRowOwnProps :
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * Should be valid `<tr>` children such as `TableCell`.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TableRowClasses?

    /**
     * If `true`, the table row will shade on hover.
     * @default false
     */
    var hover: Boolean?

    /**
     * If `true`, the table row will have the selected shading.
     * @default false
     */
    var selected: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 * Will automatically set dynamic row height
 * based on the material table element parent (head, body, etc).
 *
 * Demos:
 *
 * - [Table](https://mui.com/material-ui/react-table/)
 *
 * API:
 *
 * - [TableRow API](https://mui.com/material-ui/api/table-row/)
 */
@JsName("default")
external val TableRow: react.FC<TableRowProps>
