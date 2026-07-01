// Automatically generated - do not modify!

package muix.pickers

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import react.ElementType
import react.Props
import react.PropsWithClassName
import web.cssom.ClassName

external interface MonthCalendarProps :
    ExportedMonthCalendarProps,
    PropsWithClassName,
    PropsWithSx {
    var autoFocus: Boolean?

    override var className: ClassName?

    var currentMonth: PickerValidDate?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: MonthCalendarClasses?

    /**
     * Overridable component slots.
     * @default {}
     */
    var slots: MonthCalendarSlots?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: MonthCalendarSlotProps?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The selected value.
     * Used when the component is controlled.
     */
    var value: PickerValidDate?

    /**
     * The default selected value.
     * Used when the component is not controlled.
     */
    var defaultValue: PickerValidDate?

    /**
     * The date used to generate the new value when both `value` and `defaultValue` are empty.
     * @default The closest valid month using the validation props, except callbacks such as `shouldDisableMonth`.
     */
    var referenceDate: PickerValidDate?

    /**
     * Callback fired when the value changes.
     * @param {PickerValidDate} value The new value.
     */
    var onChange: ((value: PickerValidDate) -> Unit)?

    /**
     * If `true`, today's date is rendering without highlighting with circle.
     * @default false
     */
    var disableHighlightToday: Boolean?

    var onMonthFocus: ((month: Number) -> Unit)?

    var hasFocus: Boolean?

    var onFocusedViewChange: ((hasFocus: Boolean) -> Unit)?

    var gridLabelId: String?
}

external interface MonthButtonOwnerState : PickerOwnerState {
    var isMonthSelected: Boolean

    var isMonthDisabled: Boolean
}

external interface MonthCalendarSlots {
    /**
     * Button displayed to render a single month in the `month` view.
     * @default MonthCalendarButton
     */
    var monthButton: ElementType<*>?
}

external interface MonthCalendarSlotProps : Props {
    var monthButton: Props?
}

external interface ExportedMonthCalendarProps : Props {
    /**
     * Months rendered per row.
     * @default 3
     */
    var monthsPerRow: Number? /* 3 | 4 */
}
