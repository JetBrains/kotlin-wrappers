// Automatically generated - do not modify!

@file:JsModule("@mui/material/TablePaginationActions")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import mui.system.Union
import react.ElementType
import react.FC
import react.dom.events.MouseEvent
import react.dom.html.HTMLAttributes
import web.html.HTMLButtonElement
import web.html.HTMLDivElement

external interface TablePaginationActionsProps :
    StandardProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TablePaginationActionsClasses?

    /**
     * The total number of rows.
     *
     * `-1` means the total is unknown (server-side pagination): the next-page button stays enabled and the last-page button is disabled.
     */
    var count: Int

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * Accepts a function which returns a string value that provides a user-friendly name for the current page.
     * This is important for screen reader users.
     *
     * For localization purposes, you can use the provided [translations](https://mui.com/material-ui/guides/localization/).
     * @param {string} type The link or button type to format ('first' | 'last' | 'next' | 'previous').
     * @returns {string}
     */
    var getItemAriaLabel: (type: Union /* 'first' | 'last' | 'next' | 'previous' */) -> String

    /**
     * Callback fired when the page is changed.
     * @param {React.MouseEvent<HTMLButtonElement> | null} event The event source of the callback.
     * @param {number} page The page selected.
     */
    var onPageChange: (event: MouseEvent<HTMLButtonElement, *>?, page: Number) -> Unit

    /**
     * The zero-based index of the current page.
     */
    var page: Int

    /**
     * The number of rows per page.
     *
     * `-1` means all the rows are shown on one page.
     */
    var rowsPerPage: Int

    /**
     * If `true`, show the first-page button.
     */
    var showFirstButton: Boolean

    /**
     * If `true`, show the last-page button.
     */
    var showLastButton: Boolean

    /**
     * The props used for each slot inside.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var firstButton: IconButtonProps?
        var lastButton: IconButtonProps?
        var nextButton: IconButtonProps?
        var previousButton: IconButtonProps?
        var firstButtonIcon: SvgIconProps?
        var lastButtonIcon: SvgIconProps?
        var nextButtonIcon: SvgIconProps?
        var previousButtonIcon: SvgIconProps?
    }

    /**
     * The components used for each slot inside.
     * @default {}
     */
    var slots: TablePaginationActionsSlots?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface TablePaginationActionsSlots {
    /**
     * The component that renders the first button.
     * @default IconButton
     */
    var firstButton: ElementType<*>?

    /**
     * The component that renders the last button.
     * @default IconButton
     */
    var lastButton: ElementType<*>?

    /**
     * The component that renders the next button.
     * @default IconButton
     */
    var nextButton: ElementType<*>?

    /**
     * The component that renders the previous button.
     * @default IconButton
     */
    var previousButton: ElementType<*>?

    /**
     * The component that renders the first button icon.
     * @default FirstPageIcon
     */
    var firstButtonIcon: ElementType<*>?

    /**
     * The component that renders the last button icon.
     * @default LastPageIcon
     */
    var lastButtonIcon: ElementType<*>?

    /**
     * The component that renders the next button icon.
     * @default KeyboardArrowRight
     */
    var nextButtonIcon: ElementType<*>?

    /**
     * The component that renders the previous button icon.
     * @default KeyboardArrowLeft
     */
    var previousButtonIcon: ElementType<*>?
}

/**
 *
 * Demos:
 *
 * - [Pagination](https://mui.com/material-ui/react-pagination/)
 *
 * API:
 *
 * - [TablePaginationActions API](https://mui.com/material-ui/api/table-pagination-actions/)
 */
@JsName("default")
external val TablePaginationActions: FC<TablePaginationActionsProps>
