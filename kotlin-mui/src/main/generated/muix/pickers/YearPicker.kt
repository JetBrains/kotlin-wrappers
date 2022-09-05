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

    var onChange: dynamic

    var onFocusedDayChange: ((day: TDate) -> Unit)?

    var readOnly: Boolean?

    /**
     * If `true`, today's date is rendering without highlighting with circle.
     * @default false
     */
    var disableHighlightToday: Boolean?

    var onYearFocus: ((year: Number) -> Unit)?

    var hasFocus: Boolean?

    var onFocusedViewChange: ((newHasFocus: Boolean) -> Unit)?
}


external val YearPicker: react.FC<YearPickerProps<*>>
