// Automatically generated - do not modify!

package muix.pickers

import react.Props
import react.dom.events.MouseEvent
import web.html.HTMLButtonElement

external interface PickerDayProps :
    ExportedPickerDayProps {
    /**
     * The date to show.
     */
    var day: PickerValidDate

    /**
     * If `true`, renders as selected.
     * @default false
     */
    var selected: Boolean?

    /**
     * If `true`, the day is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, today's day is highlighted.
     * @default false
     */
    var today: Boolean?

    /**
     * If `true`, the day is outside the current month.
     * @default false
     */
    var outsideCurrentMonth: Boolean?

    /**
     * If `true`, the day is the first visible cell of the month.
     * @default false
     */
    var isFirstVisibleCell: Boolean?

    /**
     * If `true`, the day is the last visible cell of the month.
     * @default false
     */
    var isLastVisibleCell: Boolean?

    /**
     * If `true`, the day is being animated.
     * @default false
     */
    var isAnimating: Boolean?

    /**
     * Callback fired when the day is selected.
     * @param {PickerValidDate} day The day to select.
     */
    var onDaySelect: (day: PickerValidDate) -> Unit

    /**
     * Callback fired when a key is pressed.
     * @param {React.KeyboardEvent<HTMLButtonElement>} event The event object.
     * @param {PickerValidDate} day The day.
     * @default () => {}
     */
    var onKeyDown: ((event: react.dom.events.KeyboardEvent<HTMLButtonElement>, day: PickerValidDate) -> Unit)?

    /**
     * Callback fired when the component is focused.
     * @param {React.FocusEvent<HTMLButtonElement>} event The event object.
     * @param {PickerValidDate} day The day.
     * @default () => {}
     */
    var onFocus: ((event: react.dom.events.FocusEvent<HTMLButtonElement>, day: PickerValidDate) -> Unit)?

    /**
     * Callback fired when the component is blurred.
     * @param {React.FocusEvent<HTMLButtonElement>} event The event object.
     * @param {PickerValidDate} day The day.
     * @default () => {}
     */
    var onBlur: ((event: react.dom.events.FocusEvent<HTMLButtonElement>, day: PickerValidDate) -> Unit)?

    /**
     * Callback fired when the mouse enters the component.
     * @param {React.MouseEvent<HTMLButtonElement>} event The event object.
     * @param {PickerValidDate} day The day.
     * @default () => {}
     */
    var onMouseEnter: ((event: MouseEvent<HTMLButtonElement, *>, day: PickerValidDate) -> Unit)?

    /**
     * Callback fired when the component is clicked.
     * @param {React.MouseEvent<HTMLButtonElement>} event The event object.
     * @default () => {}
     */
    var onClick: ((event: MouseEvent<HTMLButtonElement, *>) -> Unit)?

    /**
     * Callback fired when the mouse button is pressed.
     * @param {React.MouseEvent<HTMLButtonElement>} event The event object.
     * @default () => {}
     */
    var onMouseDown: ((event: MouseEvent<HTMLButtonElement, *>) -> Unit)?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: PickerDayClasses?

    /**
     * Indicates if the day should be visually selected.
     */
    var isVisuallySelected: Boolean?

    /**
     * If `true`, the day is a filler day (its content is hidden).
     * @default false
     */
    var isDayFillerCell: Boolean?
}

external interface ExportedPickerDayProps : Props {
    /**
     * If `true`, today's day is not highlighted.
     * @default false
     */
    var disableHighlightToday: Boolean?

    /**
     * If `true`, days outside the current month are rendered:
     *
     * - if `fixedWeekNumber` is defined, renders days to have the weeks requested.
     *
     * - if `fixedWeekNumber` is not defined, renders day to fill the first and last week of the current month.
     *
     * - ignored if `calendars` equals more than `1` on range pickers.
     * @default false
     */
    var showDaysOutsideCurrentMonth: Boolean?
}

external interface PickerDayOwnerState {
    /**
     * Whether the day is a filler day (its content is hidden).
     */
    var isDayFillerCell: Boolean?

    /**
     * Whether the day is the first visible cell of the month it's being rendered in.
     */
    var isDayFirstVisibleCell: Boolean?

    /**
     * Whether the day is the last visible cell of the month it's being rendered in.
     */
    var isDayLastVisibleCell: Boolean?
}
