// Automatically generated - do not modify!

@file:JsModule("@mui/lab/CalendarPicker")
@file:JsNonModule

package mui.lab

external interface CalendarPickerProps : react.Props {
    var className: String

    var date: dynamic

    /**
     * Default calendar month displayed when `value={null}`.
     */
    var defaultCalendarMonth: dynamic

    /**
     * @default false
     */
    var disableFuture: Boolean

    /**
     * @default false
     */
    var disablePast: Boolean

    /**
     * Max selectable date. @DateIOType
     */
    var maxDate: dynamic

    /**
     * Min selectable date. @DateIOType
     */
    var minDate: dynamic

    /**
     * Callback fired on view change.
     */
    var onViewChange: dynamic

    /**
     * Callback fired on date change
     */
    var onChange: dynamic

    /**
     * Callback firing on month change. @DateIOType
     */
    var onMonthChange: dynamic

    /**
     * Initially open view.
     * @default 'day'
     */
    var openTo: dynamic

    /**
     * Disable heavy animations.
     * @default typeof navigator !== 'undefined' && /(android)/i.test(navigator.userAgent)
     */
    var reduceAnimations: Boolean

    /**
     * Component displaying when passed `loading` true.
     * @default () => <span data-mui-test="loading-progress">...</span>
     */
    var renderLoading: () -> react.ReactNode

    /**
     * Disable specific date. @DateIOType
     */
    var shouldDisableDate: dynamic

    /**
     * Controlled open view.
     */
    var view: dynamic

    /**
     * Views for calendar picker.
     * @default ['year', 'day']
     */
    var views: dynamic
}

external interface CalendarPickerClasses {
    /** Styles applied to the root element. */
    var root: String

    /** Styles applied to the transition group element. */
    var viewTransitionContainer: String
}
