// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/ClockPicker")
@file:JsNonModule

package muix.pickers

import csstype.ClassName

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
     * The components used for each slot.
     * Either a string to use a HTML element or a component.
     */
    var components: Components?

    interface Components {
        var LeftArrowButton: react.ElementType<*>?
        var LeftArrowIcon: react.ElementType<*>?
        var RightArrowButton: react.ElementType<*>?
        var RightArrowIcon: react.ElementType<*>?
    }

    /**
     * The props used for each slot inside.
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var leftArrowButton: react.Props? /* React.SVGAttributes<SVGSVGElement> & ClockPickerComponentsPropsOverrides */
        var rightArrowButton: react.Props? /* React.SVGAttributes<SVGSVGElement> & ClockPickerComponentsPropsOverrides */
    }

    /**
     * Selected date @DateIOType.
     */
    var date: TDate?

    /**
     * Get clock number aria-text for hours.
     * @param {string} hours The hours to format.
     * @returns {string} the formatted hours text.
     * @default (hours: string) => `${hours} hours`
     */
    var getHoursClockNumberText: ((hours: String) -> String)?

    /**
     * Get clock number aria-text for minutes.
     * @param {string} minutes The minutes to format.
     * @returns {string} the formatted minutes text.
     * @default (minutes: string) => `${minutes} minutes`
     */
    var getMinutesClockNumberText: ((minutes: String) -> String)?

    /**
     * Get clock number aria-text for seconds.
     * @param {string} seconds The seconds to format.
     * @returns {string} the formatted seconds text.
     * @default (seconds: string) => `${seconds} seconds`
     */
    var getSecondsClockNumberText: ((seconds: String) -> String)?

    /**
     * Left arrow icon aria-label text.
     * @default 'open previous view'
     */
    var leftArrowButtonText: String?

    /**
     * On change callback @DateIOType.
     */
    var onChange: PickerOnChangeFn<TDate>

    /**
     * Right arrow icon aria-label text.
     * @default 'open next view'
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
     * @param {ClockPickerView} view The current view rendered.
     * @param {TDate | null} time The current time.
     * @param {MuiPickersAdapter<TDate>} adapter The current date adapter.
     * @returns {string} The clock label.
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


@JsName("default")
external val ClockPicker: react.FC<ClockPickerProps<*>>
