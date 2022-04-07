// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/YearPicker")
@file:JsNonModule

package muix.pickers

import csstype.ClassName

external interface YearPickerProps<TDate> : react.PropsWithClassName {
    var autoFocus: Boolean?

    override var className: ClassName?

    var classes: dynamic

    var date: TDate?

    var disabled: Boolean?

    var disableFuture: Boolean?

    var disablePast: Boolean?

    var isDateDisabled: (day: TDate) -> Boolean

    var minDate: TDate

    var maxDate: TDate

    var onChange: PickerOnChangeFn<TDate>

    var onFocusedDayChange: ((day: TDate) -> Unit)?

    var readOnly: Boolean?
}

external interface ExportedYearPickerProps<TDate> : react.Props {
    /**
     * Callback firing on year change @DateIOType.
     * @param {TDate} year The new year.
     */
    var onYearChange: ((year: TDate) -> Unit)?

    /**
     * Disable specific years dynamically.
     * Works like `shouldDisableDate` but for year selection view @DateIOType.
     * @param {TDate} year The year to test.
     * @returns {boolean} Return `true` if the year should be disabled.
     */
    var shouldDisableYear: ((year: TDate) -> Boolean)?
}


@JsName("default")
external val YearPicker: react.FC<YearPickerProps<*>>
