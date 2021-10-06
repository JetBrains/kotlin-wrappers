// Automatically generated - do not modify!

@file:JsModule("@mui/lab/MonthPicker")
@file:JsNonModule

package mui.lab

external interface MonthPickerProps : react.Props {
    /**
     * className applied to the root element.
     */
    var className: String

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic

    /** Date value for the MonthPicker */
    var date: dynamic

    /** If `true` past days are disabled. */
    var disablePast: Boolean?

    /** If `true` future days are disabled. */
    var disableFuture: Boolean?

    /** Minimal selectable date. */
    var minDate: dynamic

    /** Maximal selectable date. */
    var maxDate: dynamic

    /** Callback fired on date change. */
    var onChange: dynamic

    var onMonthChange: dynamic

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>
}
