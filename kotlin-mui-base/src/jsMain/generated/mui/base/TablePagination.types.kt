// Automatically generated - do not modify!

package mui.base

import react.ElementType
import react.Props
import react.ReactNode
import react.dom.events.ChangeEventHandler
import react.dom.events.MouseEvent
import react.dom.html.HTMLAttributes
import web.html.HTMLButtonElement
import web.html.HTMLElement
import web.html.HTMLTableCellElement

external interface TablePaginationProps :
    TablePaginationOwnProps,
    HTMLAttributes<HTMLTableCellElement>

external interface LabelDisplayedRowsArgs {
    var from: Number

    var to: Number

    var count: Number

    var page: Number
}

external interface TablePaginationOwnProps : Props {
    /**
     * @ignore
     */
    var colSpan: Number?

    /**
     * The components used for each slot inside the TablePagination.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: TablePaginationSlots?

    /**
     * The props used for each slot inside the TablePagination.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: Props? /* SlotComponentProps<'td', TablePaginationRootSlotPropsOverrides, TablePaginationOwnerState> */
        var actions: Props? /* SlotComponentProps<typeof TablePaginationActions, TablePaginationActionsSlotPropsOverrides, TablePaginationOwnerState> */
        var select: Props? /* SlotComponentProps<'select', TablePaginationSelectSlotPropsOverrides, TablePaginationOwnerState> */
        var selectLabel: Props? /* SlotComponentProps<'p', TablePaginationSelectLabelSlotPropsOverrides, TablePaginationOwnerState> */
        var menuItem: Props? /* SlotComponentProps<'option', TablePaginationMenuItemSlotPropsOverrides, TablePaginationOwnerState> */
        var displayedRows: Props? /* SlotComponentProps<'p', TablePaginationDisplayedRowsSlotPropsOverrides, TablePaginationOwnerState> */
        var toolbar: Props? /* SlotComponentProps<'div', TablePaginationToolbarSlotPropsOverrides, TablePaginationOwnerState> */
        var spacer: Props? /* SlotComponentProps<'div', TablePaginationSpacerSlotPropsOverrides, TablePaginationOwnerState> */
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
     * For localization purposes, you can use the provided [translations](https://mui.com/material-ui/guides/localization/).
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
     * For localization purposes, you can use the provided [translations](https://mui.com/material-ui/guides/localization/).
     * @default function defaultLabelDisplayedRows({ from, to, count }: LabelDisplayedRowsArgs) {
     *   return `${from}–${to} of ${count !== -1 ? count : `more than ${to}`}`;
     * }
     */
    var labelDisplayedRows: ((paginationInfo: LabelDisplayedRowsArgs) -> ReactNode)?

    /**
     * Id of the label element within the pagination.
     */
    var labelId: String?

    /**
     * Customize the rows per page label.
     *
     * For localization purposes, you can use the provided [translations](https://mui.com/material-ui/guides/localization/).
     * @default 'Rows per page:'
     */
    var labelRowsPerPage: ReactNode?

    /**
     * Callback fired when the page is changed.
     *
     * @param {React.MouseEvent<HTMLButtonElement> | null} event The event source of the callback.
     * @param {number} page The page selected.
     */
    var onPageChange: (event: MouseEvent<HTMLButtonElement, *>?, page: Number) -> Unit

    /**
     * Callback fired when the number of rows per page is changed.
     *
     * @param {React.ChangeEvent<HTMLTextAreaElement | HTMLInputElement>} event The event source of the callback.
     */
    var onRowsPerPageChange: ChangeEventHandler<HTMLElement, *>?

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
    var rowsPerPageOptions: Any? /* ReadonlyArray<number | {
    value: number;
    label: string;
}> */

    /**
     * Id of the select element within the pagination.
     */
    var selectId: String?
}

external interface TablePaginationSlots {
    /**
     * The component that renders the root.
     * @default 'td'
     */
    var root: ElementType<*>?

    /**
     * The component that renders the actions.
     * @default TablePaginationActions
     */
    var actions: ElementType<*>?

    /**
     * The component that renders the select.
     * @default 'select'
     */
    var select: ElementType<*>?

    /**
     * The component that renders the select label.
     * @default 'p'
     */
    var selectLabel: ElementType<*>?

    /**
     * The component that renders the menu item.
     * @default 'option'
     */
    var menuItem: ElementType<*>?

    /**
     * The component that renders the displayed rows.
     * @default 'p'
     */
    var displayedRows: ElementType<*>?

    /**
     * The component that renders the toolbar.
     * @default 'div'
     */
    var toolbar: ElementType<*>?

    /**
     * The component that renders the spacer.
     * @default 'div'
     */
    var spacer: ElementType<*>?
}
