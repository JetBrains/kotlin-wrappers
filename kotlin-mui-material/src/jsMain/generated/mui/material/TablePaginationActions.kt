// Automatically generated - do not modify!

@file:JsModule("@mui/material/TablePagination/TablePaginationActions")

package mui.material

external interface TablePaginationActionsProps :
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement> {
    /**
     * This prop is an alias for `slotProps.previousButton` and will be overriden by it if both are used.
     * @deprecated Use `slotProps.previousButton` instead.
     */
    var backIconButtonProps: IconButtonProps?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic

    var count: Number

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * Accepts a function which returns a string value that provides a user-friendly name for the current page.
     * This is important for screen reader users.
     *
     * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
     * @param {string} type The link or button type to format ('first' | 'last' | 'next' | 'previous').
     * @returns {string}
     */
    var getItemAriaLabel: (type: mui.system.Union /* 'first' | 'last' | 'next' | 'previous' */) -> String

    /**
     * This prop is an alias for `slotProps.nextButton` and will be overriden by it if both are used.
     * @deprecated Use `slotProps.nextButton` instead.
     */
    var nextIconButtonProps: IconButtonProps?

    var onPageChange: (event: react.dom.events.MouseEvent<web.html.HTMLButtonElement, *>?, page: Number) -> Unit

    var page: Number

    var rowsPerPage: Number

    var showFirstButton: Boolean

    var showLastButton: Boolean

    var slotProps: SlotProps?

    interface SlotProps {
        var firstButton: react.Props? /* Partial<IconButtonProps> */
        var lastButton: react.Props? /* Partial<IconButtonProps> */
        var nextButton: react.Props? /* Partial<IconButtonProps> */
        var previousButton: react.Props? /* Partial<IconButtonProps> */
        var firstButtonIcon: react.Props? /* Partial<SvgIconProps> */
        var lastButtonIcon: react.Props? /* Partial<SvgIconProps> */
        var nextButtonIcon: react.Props? /* Partial<SvgIconProps> */
        var previousButtonIcon: react.Props? /* Partial<SvgIconProps> */
    }

    var slots: TablePaginationActionsSlots?
}

external interface TablePaginationActionsSlots {
    /**
     * The component that renders the first button.
     * @default IconButton
     */
    var firstButton: react.ElementType<*>?

    /**
     * The component that renders the last button.
     * @default IconButton
     */
    var lastButton: react.ElementType<*>?

    /**
     * The component that renders the next button.
     * @default IconButton
     */
    var nextButton: react.ElementType<*>?

    /**
     * The component that renders the previous button.
     * @default IconButton
     */
    var previousButton: react.ElementType<*>?

    /**
     * The component that renders the first button icon.
     * @default FirstPageIcon
     */
    var firstButtonIcon: react.ElementType<*>?

    /**
     * The component that renders the last button icon.
     * @default LastPageIcon
     */
    var lastButtonIcon: react.ElementType<*>?

    /**
     * The component that renders the next button icon.
     * @default KeyboardArrowRight
     */
    var nextButtonIcon: react.ElementType<*>?

    /**
     * The component that renders the previous button icon.
     * @default KeyboardArrowLeft
     */
    var previousButtonIcon: react.ElementType<*>?
}


@JsName("default")
external val TablePaginationActions: react.FC<TablePaginationActionsProps>
