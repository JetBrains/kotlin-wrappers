// Automatically generated - do not modify!

@file:JsModule("@mui/material/TableRow")
@file:JsNonModule

package mui.material

external interface TableRowProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLTableRowElement>,
    react.PropsWithChildren {
    /**
     * Should be valid <tr> children such as `TableCell`.
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
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 * Will automatically set dynamic row height
 * based on the material table element parent (head, body, etc).
 *
 * Demos:
 *
 * - [Tables](https://mui.com/components/tables/)
 *
 * API:
 *
 * - [TableRow API](https://mui.com/api/table-row/)
 */
@JsName("default")
external val TableRow: react.FC<TableRowProps>
