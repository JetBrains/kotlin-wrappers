// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/ClockPicker")

package muix.pickers

import web.cssom.ClassName

external interface ClockPickerProps<TDate> : react.PropsWithClassName {
    override var className: ClassName?

    /**
     * Set to `true` if focus should be moved to clock picker.
     */
    var autoFocus: Boolean?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ClockPickerClasses?

    /**
     * Overrideable components.
     * @default {}
     */
    var components: dynamic

    /**
     * The props used for each component slot.
     * @default {}
     */
    var componentsProps: ClockPickerSlotsComponentsProps?

    /**
     * Selected date @DateIOType.
     */
    var date: TDate?

    /**
     * Get clock number aria-text for hours.
     * @param {string} hours The hours to format.
     * @returns {string} the formatted hours text.
     * @default (hours: string) => `${hours} hours`
     * @deprecated Use the `localeText` prop of `LocalizationProvider` instead, see https://mui.com/x/react-date-pickers/localization/.
     */
    var getHoursClockNumberText: ((hours: String) -> String)?

    /**
     * Get clock number aria-text for minutes.
     * @param {string} minutes The minutes to format.
     * @returns {string} the formatted minutes text.
     * @default (minutes: string) => `${minutes} minutes`
     * @deprecated Use the `localeText` prop of `LocalizationProvider` instead, see https://mui.com/x/react-date-pickers/localization/.
     */
    var getMinutesClockNumberText: ((minutes: String) -> String)?

    /**
     * Get clock number aria-text for seconds.
     * @param {string} seconds The seconds to format.
     * @returns {string} the formatted seconds text.
     * @default (seconds: string) => `${seconds} seconds`
     * @deprecated Use the `localeText` prop of `LocalizationProvider` instead, see https://mui.com/x/react-date-pickers/localization/.
     */
    var getSecondsClockNumberText: ((seconds: String) -> String)?

    /**
     * Left arrow icon aria-label text.
     * @default 'open previous view'
     * @deprecated Use the `localeText` prop of `LocalizationProvider` instead, see https://mui.com/x/react-date-pickers/localization/.
     */
    var leftArrowButtonText: String?

    /**
     * On change callback @DateIOType.
     */
    var onChange: PickerOnChangeFn<TDate>

    /**
     * Right arrow icon aria-label text.
     * @default 'open next view'
     * @deprecated Use the `localeText` prop of `LocalizationProvider` instead, see https://mui.com/x/react-date-pickers/localization/.
     */
    var rightArrowButtonText: String?

    var showViewSwitcher: Boolean?

    /**
     * Controlled open view.
     */
    var view: dynamic

    /**
     * Views for calendar picker.
     * @default ['hours', 'minutes']
     */
    var views: dynamic

    /**
     * Callback fired on view change.
     * @param {ClockPickerView} view The new view.
     */
    var onViewChange: ((view: ClockPickerView) -> Unit)?

    /**
     * Initially open view.
     * @default 'hours'
     */
    var openTo: dynamic

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
}

external interface ExportedClockPickerProps<TDate> : react.Props {
    /**
     * 12h/24h view for hour selection clock.
     * @default false
     */
    var ampm: Boolean?

    /**
     * Display ampm controls under the clock (instead of in the toolbar).
     * @default false
     */
    var ampmInClock: Boolean?

    /**
     * Accessible text that helps user to understand which time and view is selected.
     * @template TDate
     * @param {ClockPickerView} view The current view rendered.
     * @param {TDate | null} time The current time.
     * @param {MuiPickersAdapter<TDate>} adapter The current date adapter.
     * @returns {string} The clock label.
     * @deprecated Use the `localeText` prop of `LocalizationProvider` instead, see https://mui.com/x/react-date-pickers/localization/.
     * @default <TDate extends any>(
     *   view: ClockView,
     *   time: TDate | null,
     *   adapter: MuiPickersAdapter<TDate>,
     * ) =>
     *   `Select ${view}. ${
     *     time === null ? 'No time selected' : `Selected time is ${adapter.format(time, 'fullTime')}`
     *   }`
     */
    var getClockLabelText: ((view: ClockPickerView, time: TDate?, adapter: dynamic /* MuiPickersAdapter<TDate> */) -> String)?
}

external interface ClockPickerSlotsComponent

external interface ClockPickerSlotsComponentsProps : react.Props


external val ClockPicker: react.FC<ClockPickerProps<*>>
