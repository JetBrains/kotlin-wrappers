// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/CalendarPicker")
@file:JsNonModule

package muix.pickers

import csstype.ClassName
import kotlinx.js.ReadonlyArray

external interface CalendarPickerProps<TDate> : react.PropsWithClassName {
    override var className: ClassName?

    var classes: CalendarPickerClasses?

    var date: TDate?

    /**
     * Default calendar month displayed when `value={null}`.
     */
    var defaultCalendarMonth: TDate?

    /**
     * If `true`, the picker and text field are disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * @default false
     */
    var disableFuture: Boolean?

    /**
     * @default false
     */
    var disablePast: Boolean?

    /**
     * Max selectable date. @DateIOType
     */
    var maxDate: TDate?

    /**
     * Min selectable date. @DateIOType
     */
    var minDate: TDate?

    /**
     * Callback fired on view change.
     * @param {CalendarPickerView} view The new view.
     */
    var onViewChange: ((view: CalendarPickerView) -> Unit)?

    /**
     * Callback fired on date change
     */
    var onChange: PickerOnChangeFn<TDate>

    /**
     * Callback firing on month change. @DateIOType
     * @template TDate
     * @param {TDate} month The new month.
     */
    var onMonthChange: ((month: TDate) -> Unit)?

    /**
     * Initially open view.
     * @default 'day'
     */
    var openTo: CalendarPickerView?

    /**
     * Make picker read only.
     * @default false
     */
    var readOnly: Boolean?

    /**
     * Disable heavy animations.
     * @default typeof navigator !== 'undefined' && /(android)/i.test(navigator.userAgent)
     */
    var reduceAnimations: Boolean?

    /**
     * Component displaying when passed `loading` true.
     * @returns {React.ReactNode} The node to render when loading.
     * @default () => <span data-mui-test="loading-progress">...</span>
     */
    var renderLoading: (() -> react.ReactNode)?

    /**
     * Disable specific date. @DateIOType
     * @template TDate
     * @param {TDate} day The date to check.
     * @returns {boolean} If `true` the day will be disabled.
     */
    var shouldDisableDate: ((day: TDate) -> Boolean)?

    /**
     * Controlled open view.
     */
    var view: CalendarPickerView?

    /**
     * Views for calendar picker.
     * @default ['year', 'day']
     */
    var views: ReadonlyArray<CalendarPickerView>?
}

/**
 *
 * Demos:
 *
 * - [Date Picker](https://mui.com/x/react-date-pickers/date-picker/)
 *
 * API:
 *
 * - [CalendarPicker API](https://mui.com/x/api/date-pickers/calendar-picker/)
 */
@JsName("default")
external val CalendarPicker: react.FC<CalendarPickerProps<*>>
