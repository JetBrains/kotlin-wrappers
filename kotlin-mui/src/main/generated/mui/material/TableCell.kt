// Automatically generated - do not modify!

@file:JsModule("@mui/material/TableCell")
@file:JsNonModule

package mui.material

external interface TableCellProps :
    mui.system.StandardProps,
    TableCellBaseProps,
    react.PropsWithChildren {
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
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TableCellClasses?

    /**
     * The component used for the root node.
     * Either a string to use a HTML element or a component.
     */
    var component: react.ElementType<*>?

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
    var sx: mui.system.SxProps<mui.system.Theme>?

    /**
     * Specify the cell type.
     * The prop defaults to the value inherited from the parent TableHead, TableBody, or TableFooter components.
     */
    var variant: TableCellVariant?
}

/**
 * The component renders a `<th>` element when the parent context is a header
 * or otherwise a `<td>` element.
 *
 * Demos:
 *
 * - [Tables](https://mui.com/components/tables/)
 *
 * API:
 *
 * - [TableCell API](https://mui.com/api/table-cell/)
 */
@JsName("default")
external val TableCell: react.FC<TableCellProps>
