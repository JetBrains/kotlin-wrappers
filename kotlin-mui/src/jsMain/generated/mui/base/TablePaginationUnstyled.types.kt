// Automatically generated - do not modify!

package mui.base

external interface TablePaginationUnstyledProps :
    TablePaginationUnstyledOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLTableCellElement>

external interface LabelDisplayedRowsArgs {
    var from: Number

    var to: Number

    var count: Number

    var page: Number
}

external interface TablePaginationUnstyledOwnProps : react.Props {
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
    var slots: Slots?

    interface Slots {
        var root: react.ElementType<*>?
        var actions: react.ElementType<*>?
        var select: react.ElementType<*>?
        var selectLabel: react.ElementType<*>?
        var menuItem: react.ElementType<*>?
        var displayedRows: react.ElementType<*>?
        var toolbar: react.ElementType<*>?
        var spacer: react.ElementType<*>?
    }

    /**
     * The props used for each slot inside the TablePagination.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'div', TablePaginationUnstyledComponentsPropsOverrides, TablePaginationUnstyledOwnerState> */
        var actions: react.Props? /* SlotComponentProps<'div', TablePaginationUnstyledComponentsPropsOverrides, TablePaginationUnstyledOwnerState> */
        var select: react.Props? /* SlotComponentProps<'select', TablePaginationUnstyledComponentsPropsOverrides, TablePaginationUnstyledOwnerState> */
        var selectLabel: react.Props? /* SlotComponentProps<'p', TablePaginationUnstyledComponentsPropsOverrides, TablePaginationUnstyledOwnerState> */
        var menuItem: react.Props? /* SlotComponentProps<'option', TablePaginationUnstyledComponentsPropsOverrides, TablePaginationUnstyledOwnerState> */
        var displayedRows: react.Props? /* SlotComponentProps<'p', TablePaginationUnstyledComponentsPropsOverrides, TablePaginationUnstyledOwnerState> */
        var toolbar: react.Props? /* SlotComponentProps<'div', TablePaginationUnstyledComponentsPropsOverrides, TablePaginationUnstyledOwnerState> */
        var spacer: react.Props? /* SlotComponentProps<'div', TablePaginationUnstyledComponentsPropsOverrides, TablePaginationUnstyledOwnerState> */
    }

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
     * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
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
     * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
     * @default function defaultLabelDisplayedRows({ from, to, count }: LabelDisplayedRowsArgs) {
     *   return `${from}–${to} of ${count !== -1 ? count : `more than ${to}`}`;
     * }
     */
    var labelDisplayedRows: ((paginationInfo: LabelDisplayedRowsArgs) -> react.ReactNode)?

    /**
     * Id of the label element within the pagination.
     */
    var labelId: String?

    /**
     * Customize the rows per page label.
     *
     * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
     * @default 'Rows per page:'
     */
    var labelRowsPerPage: react.ReactNode?

    /**
     * Callback fired when the page is changed.
     *
     * @param {React.MouseEvent<HTMLButtonElement> | null} event The event source of the callback.
     * @param {number} page The page selected.
     */
    var onPageChange: (event: react.dom.events.MouseEvent<web.html.HTMLButtonElement, *>?, page: Number) -> Unit

    /**
     * Callback fired when the number of rows per page is changed.
     *
     * @param {React.ChangeEvent<HTMLTextAreaElement | HTMLInputElement>} event The event source of the callback.
     */
    var onRowsPerPageChange: react.dom.events.ChangeEventHandler<web.html.HTMLElement>?

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
     * Id of the select element within the pagination.
     */
    var selectId: String?
}
