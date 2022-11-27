// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/CalendarPicker")
@file:JsNonModule

package muix.pickers

import csstype.ClassName
import js.core.ReadonlyArray
import js.core.Void
import kotlin.js.Promise

external interface CalendarPickerProps<TDate> : react.PropsWithClassName {
    var autoFocus: Boolean?

    override var className: ClassName?

    var classes: CalendarPickerClasses?

    /**
     * Overrideable components.
     * @default {}
     */
    var components: dynamic

    /**
     * The props used for each component slot.
     * @default {}
     */
    var componentsProps: CalendarPickerSlotsComponentsProps?

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
     * Callback fired on view change.
     * @param {CalendarPickerView} view The new view.
     */
    var onViewChange: ((view: CalendarPickerView) -> Unit)?

    /**
     * Callback fired on date change
     */
    var onChange: PickerOnChangeFn<TDate>

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
     * Controlled open view.
     */
    var view: CalendarPickerView?

    /**
     * Views for calendar picker.
     * @default ['year', 'day']
     */
    var views: ReadonlyArray<CalendarPickerView>?

    /**
     * Callback firing on year change @DateIOType.
     * @template TDate
     * @param {TDate} year The new year.
     */
    var onYearChange: ((year: TDate) -> Unit)?

    /**
     * Callback firing on month change @DateIOType.
     * @template TDate
     * @param {TDate} month The new month.
     * @returns {void|Promise} -
     */
    var onMonthChange: ((month: TDate) -> Promise<Void>?)?

    var focusedView: CalendarPickerView?

    var onFocusedViewChange: ((view: CalendarPickerView) -> (newHasFocus: Boolean) -> Unit)?
}

external interface CalendarPickerSlotsComponent

external interface CalendarPickerSlotsComponentsProps : react.Props


external val CalendarPicker: react.FC<CalendarPickerProps<*>>
