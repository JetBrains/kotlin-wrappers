// Automatically generated - do not modify!

@file:JsModule("@mui/material/TablePagination/TablePaginationActions")
@file:JsNonModule

package mui.material

external interface TablePaginationActionsProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement> {
    var backIconButtonProps: IconButtonProps?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic

    var count: Number

    /**
     * Accepts a function which returns a string value that provides a user-friendly name for the current page.
     * This is important for screen reader users.
     *
     * For localization purposes, you can use the provided [translations](/guides/localization/).
     * @param {string} type The link or button type to format ('first' | 'last' | 'next' | 'previous').
     * @returns {string}
     */
    var getItemAriaLabel: (type: mui.system.Union /* 'first' | 'last' | 'next' | 'previous' */) -> String

    var nextIconButtonProps: IconButtonProps?

    var onPageChange: (event: react.dom.events.MouseEvent<org.w3c.dom.HTMLButtonElement, *>?, page: Number) -> Unit

    var page: Number

    var rowsPerPage: Number

    var showFirstButton: Boolean

    var showLastButton: Boolean
}


@JsName("default")
external val TablePaginationActions: react.FC<TablePaginationActionsProps>
