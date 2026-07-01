// Automatically generated - do not modify!

package muix.pickers

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import react.ElementType
import react.Props
import react.PropsWithClassName
import react.ReactNode
import web.cssom.ClassName

external interface DateCalendarProps :
    ExportedDateCalendarProps,
    PropsWithClassName,
    PropsWithSx {
    /**
     * The selected value.
     * Used when the component is controlled.
     */
    var value: PickerValidDate?

    /**
     * The default selected value.
     * Used when the component is not controlled.
     */
    var defaultValue: PickerValidDate?

    /**
     * The date used to generate the new value when both `value` and `defaultValue` are empty.
     * @default The closest valid date using the validation props, except callbacks such as `shouldDisableDate`.
     */
    var referenceDate: PickerValidDate?

    override var className: ClassName?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: DateCalendarClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * Overridable component slots.
     * @default {}
     */
    var slots: DateCalendarSlots?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: DateCalendarSlotProps?
}

external interface DateCalendarSlots :
    PickersCalendarHeaderSlots,
    DayCalendarSlots,
    MonthCalendarSlots,
    YearCalendarSlots {
    /**
     * Custom component for calendar header.
     * Check the [PickersCalendarHeader](https://mui.com/x/api/date-pickers/pickers-calendar-header/) component.
     * @default PickersCalendarHeader
     */
    var calendarHeader: ElementType<PickersCalendarHeaderProps>?
}

external interface DateCalendarSlotProps :
    PickersCalendarHeaderSlotProps,
    DayCalendarSlotProps,
    MonthCalendarSlotProps,
    YearCalendarSlotProps {
    var calendarHeader: Props?
}

external interface ExportedDateCalendarProps :
    ExportedDayCalendarProps,
    ExportedMonthCalendarProps,
    ExportedValidateDateProps {
    /**
     * If `true`, disable heavy animations.
     * @default `@media(prefers-reduced-motion: reduce)` || `navigator.userAgent` matches Android <10 or iOS <13
     */
    var reduceAnimations: Boolean?

    /**
     * Component displaying when passed `loading` true.
     * @returns {React.ReactNode} The node to render when loading.
     * @default () => <span>…</span>
     */
    override var renderLoading: (() -> ReactNode)?

    /**
     * Callback fired on year change.
     * @param {PickerValidDate} year The new year.
     */
    var onYearChange: ((year: PickerValidDate) -> Unit)?

    /**
     * Callback fired on month change.
     * @param {PickerValidDate} month The new month.
     */
    var onMonthChange: ((month: PickerValidDate) -> Unit)?
}
