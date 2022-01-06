// Automatically generated - do not modify!

@file:JsModule("@mui/material/TablePagination")
@file:JsNonModule

package mui.material

external interface TablePaginationProps :
    TablePaginationBaseProps,
    mui.types.PropsWithComponent {
    /**
     * The component used for displaying the actions.
     * Either a string to use a HTML element or a component.
     * @default TablePaginationActions
     */
    var ActionsComponent: react.ElementType<TablePaginationActionsProps>?

    /**
     * Props applied to the back arrow [`IconButton`](/api/icon-button/) component.
     */
    var backIconButtonProps: IconButtonProps?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TablePaginationClasses?

    /**
     * The total number of rows.
     *
     * To enable server side pagination for an unknown number of items, provide -1.
     */
    var count: Number

    /**
     * Accepts a function which returns a string value that provides a user-friendly name for the current page.
     * This is important for screen reader users.
     *
     * For localization purposes, you can use the provided [translations](/guides/localization/).
     * @param {string} type The link or button type to format ('first' | 'last' | 'next' | 'previous').
     * @returns {string}
     * @default function defaultGetAriaLabel(type) {
     *   return `Go to ${type} page`;
     * }
     */
    var getItemAriaLabel: ((type: mui.system.Union /* 'first' | 'last' | 'next' | 'previous' */) -> String)?

    /**
     * Customize the displayed rows label. Invoked with a `{ from, to, count, page }`
     * object.
     *
     * For localization purposes, you can use the provided [translations](/guides/localization/).
     * @default function defaultLabelDisplayedRows({ from, to, count }) {
     *   return `${from}–${to} of ${count !== -1 ? count : `more than ${to}`}`;
     * }
     */
    var labelDisplayedRows: ((paginationInfo: LabelDisplayedRowsArgs) -> react.ReactNode)?

    /**
     * Customize the rows per page label.
     *
     * For localization purposes, you can use the provided [translations](/guides/localization/).
     * @default 'Rows per page:'
     */
    var labelRowsPerPage: react.ReactNode?

    /**
     * Props applied to the next arrow [`IconButton`](/api/icon-button/) element.
     */
    var nextIconButtonProps: IconButtonProps?

    /**
     * Callback fired when the page is changed.
     *
     * @param {React.MouseEvent<HTMLButtonElement> | null} event The event source of the callback.
     * @param {number} page The page selected.
     */
    var onPageChange: (event: react.dom.events.MouseEvent<org.w3c.dom.HTMLButtonElement, *>?, page: Number) -> Unit

    /**
     * Callback fired when the number of rows per page is changed.
     *
     * @param {React.ChangeEvent<HTMLTextAreaElement | HTMLInputElement>} event The event source of the callback.
     */
    var onRowsPerPageChange: react.dom.events.ChangeEventHandler<org.w3c.dom.HTMLElement>?

    /**
     * The zero-based index of the current page.
     */
    var page: Number

    /**
     * The number of rows per page.
     *
     * Set -1 to display all the rows.
     */
    var rowsPerPage: Number

    /**
     * Customizes the options of the rows per page select field. If less than two options are
     * available, no select field will be displayed.
     * Use -1 for the value with a custom label to show all the rows.
     * @default [10, 25, 50, 100]
     */
    var rowsPerPageOptions: dynamic

    /**
     * Props applied to the rows per page [`Select`](/api/select/) element.
     * @default {}
     */
    var SelectProps: SelectProps<*>?

    /**
     * If `true`, show the first-page button.
     * @default false
     */
    var showFirstButton: Boolean?

    /**
     * If `true`, show the last-page button.
     * @default false
     */
    var showLastButton: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?
}

external interface LabelDisplayedRowsArgs {
    var from: Number

    var to: Number

    var count: Number

    var page: Number
}

/**
 * A `TableCell` based component for placing inside `TableFooter` for pagination.
 *
 * Demos:
 *
 * - [Tables](https://mui.com/components/tables/)
 *
 * API:
 *
 * - [TablePagination API](https://mui.com/api/table-pagination/)
 * - inherits [TableCell API](https://mui.com/api/table-cell/)
 */
@JsName("default")
external val TablePagination: react.FC<TablePaginationProps>
