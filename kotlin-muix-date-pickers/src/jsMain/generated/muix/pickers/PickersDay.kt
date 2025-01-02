// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/PickersDay")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package muix.pickers

external interface PickersDayProps<TDate> : react.Props {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: PickersDayClasses?

    /**
     * The date to show.
     */
    var day: TDate

    /**
     * If `true`, renders as disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, days are rendering without margin. Useful for displaying linked range of days.
     * @default false
     */
    var disableMargin: Boolean?

    var isAnimating: Boolean?

    var onFocus: ((event: react.dom.events.FocusEvent<web.html.HTMLButtonElement>, day: TDate) -> Unit)?

    var onBlur: ((event: react.dom.events.FocusEvent<web.html.HTMLButtonElement>, day: TDate) -> Unit)?

    var onKeyDown: ((event: react.dom.events.KeyboardEvent<web.html.HTMLButtonElement>, day: TDate) -> Unit)?

    var onMouseEnter: ((event: react.dom.events.MouseEvent<web.html.HTMLButtonElement, *>, day: TDate) -> Unit)?

    var onDaySelect: (day: TDate) -> Unit

    /**
     * If `true`, day is outside of month and will be hidden.
     */
    var outsideCurrentMonth: Boolean

    /**
     * If `true`, day is the first visible cell of the month.
     * Either the first day of the month or the first day of the week depending on `showDaysOutsideCurrentMonth`.
     */
    var isFirstVisibleCell: Boolean

    /**
     * If `true`, day is the last visible cell of the month.
     * Either the last day of the month or the last day of the week depending on `showDaysOutsideCurrentMonth`.
     */
    var isLastVisibleCell: Boolean

    /**
     * If `true`, renders as selected.
     * @default false
     */
    var selected: Boolean?

    /**
     * If `true`, renders as today date.
     * @default false
     */
    var today: Boolean?
}

external interface ExportedPickersDayProps : react.Props {
    /**
     * If `true`, today's date is rendering without highlighting with circle.
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


external val PickersDay: react.FC<PickersDayProps<*>>
