// Automatically generated - do not modify!

@file:JsModule("@mui/lab/ClockPicker")
@file:JsNonModule

package mui.lab

external interface ClockPickerProps<TDate> : react.Props {
    /**
     * Set to `true` if focus should be moved to clock picker.
     */
    var autoFocus: Boolean?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ClockPickerClasses?

    /**
     * The components used for each slot.
     * Either a string to use a HTML element or a component.
     */
    var components: dynamic

    /**
     * The props used for each slot inside.
     */
    var componentsProps: dynamic

    /**
     * Selected date @DateIOType.
     */
    var date: TDate?

    /**
     * Get clock number aria-text for hours.
     * @default (hours: string) => `${hours} hours`
     */
    var getHoursClockNumberText: ((hours: String) -> String)?

    /**
     * Get clock number aria-text for minutes.
     * @default (minutes: string) => `${minutes} minutes`
     */
    var getMinutesClockNumberText: ((minutes: String) -> String)?

    /**
     * Get clock number aria-text for seconds.
     * @default (seconds: string) => `${seconds} seconds`
     */
    var getSecondsClockNumberText: ((seconds: String) -> String)?

    /**
     * Left arrow icon aria-label text.
     * @default 'open previous view'
     */
    var leftArrowButtonText: String?

    var previousViewAvailable: Boolean

    var nextViewAvailable: Boolean

    /**
     * On change callback @DateIOType.
     */
    var onChange: PickerOnChangeFn<TDate>

    var openNextView: () -> Unit

    var openPreviousView: () -> Unit

    /**
     * Right arrow icon aria-label text.
     * @default 'open next view'
     */
    var rightArrowButtonText: String?

    var showViewSwitcher: Boolean?

    var view: dynamic
}

external interface ClockPickerClasses {
    /** Styles applied to the arrowSwitcher element. */
    var arrowSwitcher: String
}

external interface ExportedClockPickerProps<TDate> : react.Props {
    /**
     * 12h/24h view for hour selection clock.
     * @default false
     */
    var ampm: Boolean?

    /**
     * Step over minutes.
     * @default 1
     */
    var minutesStep: Number?

    /**
     * Display ampm controls under the clock (instead of in the toolbar).
     * @default false
     */
    var ampmInClock: Boolean?

    /**
     * Accessible text that helps user to understand which time and view is selected.
     * @default <TDate extends any>(
     *   view: ClockView,
     *   time: TDate | null,
     *   adapter: MuiPickersAdapter<TDate>,
     * ) =>
     *   `Select ${view}. ${
     *     time === null ? 'No time selected' : `Selected time is ${adapter.format(time, 'fullTime')}`
     *   }`
     */
    var getClockLabelText: ((view: mui.system.Union /* ClockView */, time: TDate?, adapter: dynamic /* MuiPickersAdapter<TDate> */) -> String)?
}

/**
 *
 * Demos:
 *
 * - [Time Picker](https://mui.com/components/time-picker/)
 *
 * API:
 *
 * - [ClockPicker API](https://mui.com/api/clock-picker/)
 */
@JsName("default")
external val ClockPicker: react.FC<ClockPickerProps<*>>
