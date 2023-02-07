// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/MonthPicker")
@file:JsNonModule

package muix.pickers

import csstype.ClassName
import mui.material.styles.Theme
import mui.system.SxProps

external interface MonthPickerProps<TDate> :
    react.PropsWithClassName,
    mui.system.PropsWithSx {
    /**
     * className applied to the root element.
     */
    override var className: ClassName?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: MonthPickerClasses?

    /** Date value for the MonthPicker */
    var date: TDate?

    /** If `true` picker is disabled */
    var disabled: Boolean?

    /** Callback fired on date change. */
    var onChange: dynamic

    /** If `true` picker is readonly */
    var readOnly: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * If `true`, today's date is rendering without highlighting with circle.
     * @default false
     */
    var disableHighlightToday: Boolean?

    var autoFocus: Boolean?

    var onMonthFocus: ((month: Number) -> Unit)?

    var hasFocus: Boolean?

    var onFocusedViewChange: ((newHasFocus: Boolean) -> Unit)?
}


external val MonthPicker: react.FC<MonthPickerProps<*>>
