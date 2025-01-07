// Automatically generated - do not modify!

package muix.pickers

import mui.material.styles.Theme
import mui.system.SxProps
import web.cssom.ClassName

external interface DateCalendarProps<TDate> :
    react.PropsWithClassName,
    mui.system.PropsWithSx {
    /**
     * The selected value.
     * Used when the component is controlled.
     */
    var value: TDate?

    /**
     * The default selected value.
     * Used when the component is not controlled.
     */
    var defaultValue: TDate?

    /**
     * The date used to generate the new value when both `value` and `defaultValue` are empty.
     * @default The closest valid date using the validation props, except callbacks such as `shouldDisableDate`.
     */
    var referenceDate: TDate?

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
    var slots: DateCalendarSlots<TDate>?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: DateCalendarSlotProps<TDate>?
}

external interface DateCalendarSlots<TDate> {
    /**
     * Custom component for calendar header.
     * Check the [PickersCalendarHeader](https://mui.com/x/api/date-pickers/pickers-calendar-header/) component.
     * @default PickersCalendarHeader
     */
    var calendarHeader: react.ElementType<PickersCalendarHeaderProps<TDate>>?
}

external interface DateCalendarSlotProps<TDate> : react.Props {
    var calendarHeader: react.Props?
}

external interface ExportedDateCalendarProps<TDate> : react.Props {
    /**
     * If `true`, the picker and text field are disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * Make picker read only.
     * @default false
     */
    var readOnly: Boolean?

    /**
     * If `true`, disable heavy animations.
     * @default `@media(prefers-reduced-motion: reduce)` || `navigator.userAgent` matches Android <10 or iOS <13
     */
    var reduceAnimations: Boolean?

    /**
     * Component displaying when passed `loading` true.
     * @returns {React.ReactNode} The node to render when loading.
     * @default () => <span>...</span>
     */
    var renderLoading: (() -> react.ReactNode)?

    /**
     * Callback fired on year change.
     * @template TDate
     * @param {TDate} year The new year.
     */
    var onYearChange: ((year: TDate) -> Unit)?

    /**
     * Callback fired on month change.
     * @template TDate
     * @param {TDate} month The new month.
     */
    var onMonthChange: ((month: TDate) -> Unit)?
}
