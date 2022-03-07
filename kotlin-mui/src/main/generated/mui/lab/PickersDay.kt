// Automatically generated - do not modify!

@file:JsModule("@mui/lab/PickersDay")
@file:JsNonModule

package mui.lab

import mui.material.styles.Theme
import mui.system.SxProps

external interface PickersDayProps<TDate> : mui.system.PropsWithSx {
    /**
     * If `true`, `onChange` is fired on click even if the same date is selected.
     * @default false
     */
    var allowSameDateSelection: Boolean?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic

    /**
     * The date to show.
     */
    var day: TDate

    /**
     * If `true`, renders as disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, todays date is rendering without highlighting with circle.
     * @default false
     */
    var disableHighlightToday: Boolean?

    /**
     * If `true`, days are rendering without margin. Useful for displaying linked range of days.
     * @default false
     */
    var disableMargin: Boolean?

    var isAnimating: Boolean?

    var onDayFocus: ((day: TDate) -> Unit)?

    var onDaySelect: (day: TDate, isFinish: PickerSelectionState) -> Unit

    /**
     * If `true`, day is outside of month and will be hidden.
     */
    var outsideCurrentMonth: Boolean

    /**
     * If `true`, renders as selected.
     * @default false
     */
    var selected: Boolean?

    /**
     * If `true`, days that have `outsideCurrentMonth={true}` are displayed.
     * @default false
     */
    var showDaysOutsideCurrentMonth: Boolean?

    /**
     * If `true`, renders as today date.
     * @default false
     */
    var today: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Date Picker](https://mui.com/components/date-picker/)
 *
 * API:
 *
 * - [PickersDay API](https://mui.com/api/pickers-day/)
 */
@JsName("default")
external val PickersDay: react.FC<PickersDayProps<*>>
