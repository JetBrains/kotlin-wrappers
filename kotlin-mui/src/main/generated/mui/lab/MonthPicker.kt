// Automatically generated - do not modify!

@file:JsModule("@mui/lab/MonthPicker")
@file:JsNonModule

package mui.lab

import kotlinx.js.Void
import kotlin.js.Promise

external interface MonthPickerProps<TDate> : react.Props {
    /**
     * className applied to the root element.
     */
    var className: String?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic

    /** Date value for the MonthPicker */
    var date: TDate?

    /** If `true` picker is disabled */
    var disabled: Boolean?

    /** If `true` past days are disabled. */
    var disablePast: Boolean?

    /** If `true` future days are disabled. */
    var disableFuture: Boolean?

    /** Minimal selectable date. */
    var minDate: TDate

    /** Maximal selectable date. */
    var maxDate: TDate

    /** Callback fired on date change. */
    var onChange: PickerOnChangeFn<TDate>

    var onMonthChange: ((date: TDate) -> Promise<Void>?)?

    /** If `true` picker is readonly */
    var readOnly: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [Date Picker](https://mui.com/components/date-picker/)
 *
 * API:
 *
 * - [MonthPicker API](https://mui.com/api/month-picker/)
 */
@JsName("default")
external val MonthPicker: react.FC<MonthPickerProps<*>>
