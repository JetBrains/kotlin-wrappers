// Automatically generated - do not modify!

@file:JsModule("@mui/material/TablePaginationActions")

package mui.material

import mui.system.Union
import react.ElementType
import react.FC
import react.PropsWithClassName
import react.dom.events.MouseEvent
import react.dom.html.HTMLAttributes
import web.cssom.ClassName
import web.html.HTMLButtonElement
import web.html.HTMLDivElement

external interface TablePaginationActionsProps :
    HTMLAttributes<HTMLDivElement>,
    PropsWithClassName {
    /**
     * This prop is an alias for `slotProps.previousButton` and will be overridden by it if both are used.
     */
    @Deprecated("Use `slotProps.previousButton` instead.")
    var backIconButtonProps: IconButtonProps?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: Any? /* unknown;{} */

    override var className: ClassName?

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
     * This prop is an alias for `slotProps.nextButton` and will be overridden by it if both are used.
     */
    @Deprecated("Use `slotProps.nextButton` instead.")
    var nextIconButtonProps: IconButtonProps?

    var onPageChange: (event: MouseEvent<HTMLButtonElement, *>?, page: Number) -> Unit

    var page: Int

    var rowsPerPage: Int

    var showFirstButton: Boolean

    var showLastButton: Boolean

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

    var slots: TablePaginationActionsSlots?
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
 * - [Pagination](https://v7.mui.com/material-ui/react-pagination/)
 *
 * API:
 *
 * - [TablePaginationActions API](https://v7.mui.com/material-ui/api/table-pagination-actions/)
 */
@JsName("default")
external val TablePaginationActions: FC<TablePaginationActionsProps>
