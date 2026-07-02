// Automatically generated - do not modify!

package muix.pickers

import js.array.ReadonlyArray
import mui.material.SlideDirection
import react.ElementType
import react.Props
import react.PropsWithClassName
import react.ReactNode
import web.cssom.ClassName

external interface DayCalendarProps :
    ExportedDayCalendarProps,
    PropsWithClassName {
    override var className: ClassName?

    var currentMonth: PickerValidDate

    var selectedDays: ReadonlyArray<PickerValidDate?>

    var onSelectedDaysChange: PickerOnChangeFn

    var focusedDay: PickerValidDate?

    var isMonthSwitchingAnimating: Boolean

    var onFocusedDayChange: (newFocusedDay: PickerValidDate) -> Unit

    var onMonthSwitchingAnimationEnd: () -> Unit

    var reduceAnimations: Boolean

    var slideDirection: SlideDirection

    var TransitionProps: Any?

    var hasFocus: Boolean

    var onFocusedViewChange: ((newHasFocus: Boolean) -> Unit)?

    var gridLabelId: String?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: DayCalendarClasses?

    /**
     * Overridable component slots.
     * @default {}
     */
    var slots: DayCalendarSlots?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: DayCalendarSlotProps?
}

external interface DayCalendarSlots {
    /**
     * Custom component for day.
     * Check the [PickerDay](https://mui.com/x/api/date-pickers/picker-day/) component.
     * @default PickerDay
     */
    var day: ElementType<PickerDayProps>?
}

external interface DayCalendarSlotProps : Props {
    var day: Props?
}

external interface ExportedDayCalendarProps :
    ExportedPickerDayProps {
    /**
     * If `true`, calls `renderLoading` instead of rendering the day calendar.
     * Can be used to preload information and show it in calendar.
     * @default false
     */
    var loading: Boolean?

    /**
     * Component rendered on the "day" view when `props.loading` is true.
     * @returns {React.ReactNode} The node to render when loading.
     * @default () => "…"
     */
    var renderLoading: (() -> ReactNode)?

    /**
     * Formats the day of week displayed in the calendar header.
     * @param {PickerValidDate} date The date of the day of week provided by the adapter.
     * @returns {string} The name to display.
     * @default (date: PickerValidDate) => adapter.format(date, 'weekdayShort').charAt(0).toUpperCase()
     */
    var dayOfWeekFormatter: ((date: PickerValidDate) -> String)?

    /**
     * If `true`, the week number will be display in the calendar.
     */
    var displayWeekNumber: Boolean?

    /**
     * The day view will show as many weeks as needed after the end of the current month to match this value.
     * Put it to 6 to have a fixed number of weeks in Gregorian calendars
     */
    var fixedWeekNumber: Int?
}
