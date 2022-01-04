// Automatically generated - do not modify!

@file:JsModule("@mui/base/TablePaginationUnstyledProps")
@file:JsNonModule

package mui.base

external interface TablePaginationUnstyledProps : react.Props {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TablePaginationUnstyledClasses?

    /**
     * @ignore
     */
    var colSpan: Number?

    /**
     * The components used for each slot inside the TablePagination.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: dynamic

    /**
     * The props used for each slot inside the TablePagination.
     * @default {}
     */
    var componentsProps: dynamic

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
     * @default function defaultGetAriaLabel(type: ItemAriaLabelType) {
     *   return `Go to ${type} page`;
     * }
     */
    var getItemAriaLabel: ((type: ItemAriaLabelType) -> String)?

    /**
     * Customize the displayed rows label. Invoked with a `{ from, to, count, page }`
     * object.
     *
     * For localization purposes, you can use the provided [translations](/guides/localization/).
     * @default function defaultLabelDisplayedRows({ from, to, count }: LabelDisplayedRowsArgs) {
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
}

external interface LabelDisplayedRowsArgs {
    var from: Number

    var to: Number

    var count: Number

    var page: Number
}
