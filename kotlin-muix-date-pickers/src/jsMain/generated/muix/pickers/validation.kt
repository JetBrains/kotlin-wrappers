// Automatically generated - do not modify!

package muix.pickers

import react.Props

external interface FutureAndPastValidationProps : Props {
    /**
     * If `true`, disable values before the current date for date components, time for time components and both for date time components.
     * @default false
     */
    var disablePast: Boolean?

    /**
     * If `true`, disable values after the current date for date components, time for time components and both for date time components.
     * @default false
     */
    var disableFuture: Boolean?
}

external interface BaseTimeValidationProps : Props

external interface TimeValidationProps : Props {
    /**
     * Minimal selectable time.
     * The date part of the object will be ignored unless `props.disableIgnoringDatePartForTimeValidation === true`.
     */
    var minTime: PickerValidDate?

    /**
     * Maximal selectable time.
     * The date part of the object will be ignored unless `props.disableIgnoringDatePartForTimeValidation === true`.
     */
    var maxTime: PickerValidDate?

    /**
     * Step over minutes.
     * @default 1
     */
    var minutesStep: Int?

    /**
     * Disable specific time.
     * @param {PickerValidDate} value The value to check.
     * @param {TimeView} view The clock type of the timeValue.
     * @returns {boolean} If `true` the time will be disabled.
     */
    var shouldDisableTime: ((value: PickerValidDate, view: TimeView) -> Boolean)?

    /**
     * Do not ignore date part when validating min/max time.
     * @default false
     */
    var disableIgnoringDatePartForTimeValidation: Boolean?
}

external interface BaseDateValidationProps :
    FutureAndPastValidationProps {
    /**
     * Maximal selectable date.
     * @default 2099-12-31
     */
    var maxDate: PickerValidDate?

    /**
     * Minimal selectable date.
     * @default 1900-01-01
     */
    var minDate: PickerValidDate?
}

external interface DayValidationProps : Props {
    /**
     * Disable specific date.
     *
     * Warning: This function can be called multiple times (for example when rendering date calendar, checking if focus can be moved to a certain date, etc.). Expensive computations can impact performance.
     *
     * @param {PickerValidDate} day The date to test.
     * @returns {boolean} If `true` the date will be disabled.
     */
    var shouldDisableDate: ((day: PickerValidDate) -> Boolean)?
}

external interface MonthValidationProps : Props {
    /**
     * Disable specific month.
     * @param {PickerValidDate} month The month to test.
     * @returns {boolean} If `true`, the month will be disabled.
     */
    var shouldDisableMonth: ((month: PickerValidDate) -> Boolean)?
}

external interface YearValidationProps : Props {
    /**
     * Disable specific year.
     * @param {PickerValidDate} year The year to test.
     * @returns {boolean} If `true`, the year will be disabled.
     */
    var shouldDisableYear: ((year: PickerValidDate) -> Boolean)?
}

external interface DateTimeValidationProps : Props {
    /**
     * Minimal selectable moment of time with binding to date, to set min time in each day use `minTime`.
     */
    var minDateTime: PickerValidDate?

    /**
     * Maximal selectable moment of time with binding to date, to set max time in each day use `maxTime`.
     */
    var maxDateTime: PickerValidDate?
}
