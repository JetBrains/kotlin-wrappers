// Automatically generated - do not modify!

package muix.pickers

import mui.material.styles.Theme
import mui.system.SxProps
import web.cssom.ClassName

external interface MonthCalendarProps<TDate> :
    react.PropsWithClassName,
    mui.system.PropsWithSx {
    var autoFocus: Boolean?

    override var className: ClassName?

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

    /** If `true` picker is disabled */
    var disabled: Boolean?

    /**
     * The selected value.
     * Used when the component is controlled.
     */
    var value: TDate?

    /**
     * The default selected value.
     * Used when the component is not controlled.
     */
    var defaultValue: TDate?

    /**
     * The date used to generate the new value when both `value` and `defaultValue` are empty.
     * @default The closest valid month using the validation props, except callbacks such as `shouldDisableMonth`.
     */
    var referenceDate: TDate?

    /**
     * Callback fired when the value changes.
     * @template TDate
     * @param {TDate} value The new value.
     */
    var onChange: ((value: TDate) -> Unit)?

    /** If `true` picker is readonly */
    var readOnly: Boolean?

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

external interface MonthCalendarSlots {
    /**
     * Button displayed to render a single month in the `month` view.
     * @default MonthCalendarButton
     */
    var monthButton: react.ElementType<*>?
}

external interface MonthCalendarSlotProps : react.Props {
    var monthButton: react.Props?
}

external interface ExportedMonthCalendarProps : react.Props {
    /**
     * Months rendered per row.
     * @default 3
     */
    var monthsPerRow: dynamic
}
