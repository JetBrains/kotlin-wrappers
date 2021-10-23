// Automatically generated - do not modify!

@file:JsModule("@mui/lab/CalendarPicker")
@file:JsNonModule

package mui.lab

import kotlinext.js.ReadonlyArray

external interface CalendarPickerProps<TDate> : react.Props {
    var className: String?

    var date: TDate?

    /**
     * Default calendar month displayed when `value={null}`.
     */
    var defaultCalendarMonth: TDate?

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
     */
    var onViewChange: ((view: CalendarPickerView) -> Unit)?

    /**
     * Callback fired on date change
     */
    var onChange: dynamic

    /**
     * Callback firing on month change. @DateIOType
     */
    var onMonthChange: ((date: TDate) -> Unit)?

    /**
     * Initially open view.
     * @default 'day'
     */
    var openTo: CalendarPickerView?

    /**
     * Disable heavy animations.
     * @default typeof navigator !== 'undefined' && /(android)/i.test(navigator.userAgent)
     */
    var reduceAnimations: Boolean?

    /**
     * Component displaying when passed `loading` true.
     * @default () => <span data-mui-test="loading-progress">...</span>
     */
    var renderLoading: (() -> react.ReactNode)?

    /**
     * Disable specific date. @DateIOType
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

external interface CalendarPickerClasses {
    /** Styles applied to the root element. */
    var root: String

    /** Styles applied to the transition group element. */
    var viewTransitionContainer: String
}
