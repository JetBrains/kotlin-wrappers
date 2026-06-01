// Automatically generated - do not modify!

@file:JsModule("@mui/material/TableCell")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.ElementType
import react.FC
import react.PropsWithChildren
import react.ReactNode

external interface TableCellProps :
    StandardProps,
    TableCellBaseProps,
    PropsWithChildren,
    PropsWithSx {
    /**
     * Set the text-align on the table cell content.
     *
     * Monetary or generally number fields **should be right aligned** as that allows
     * you to add them up quickly in your head without having to worry about decimals.
     * @default 'inherit'
     */
    override var align: TableCellAlign?

    /**
     * The content of the component.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TableCellClasses?

    /**
     * The component used for the root node.
     * Either a string to use a HTML element or a component.
     */
    var component: ElementType<*>?

    /**
     * Sets the padding applied to the cell.
     * The prop defaults to the value (`'default'`) inherited from the parent Table component.
     */
    var padding: TableCellPadding?

    /**
     * Set scope attribute.
     */
    override var scope: String?

    /**
     * Specify the size of the cell.
     * The prop defaults to the value (`'medium'`) inherited from the parent Table component.
     */
    var size: BaseSize?

    /**
     * Set aria-sort direction.
     */
    var sortDirection: SortDirection?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * Specify the cell type.
     * The prop defaults to the value inherited from the parent TableHead, TableBody, or TableFooter components.
     */
    var variant: TableCellVariant?
}

external interface TableCellPropsSizeOverrides

external interface TableCellPropsVariantOverrides

/**
 * The component renders a `<th>` element when the parent context is a header
 * or otherwise a `<td>` element.
 *
 * Demos:
 *
 * - [Table](https://v6.mui.com/material-ui/react-table/)
 *
 * API:
 *
 * - [TableCell API](https://v6.mui.com/material-ui/api/table-cell/)
 */
@JsName("default")
external val TableCell: FC<TableCellProps>
