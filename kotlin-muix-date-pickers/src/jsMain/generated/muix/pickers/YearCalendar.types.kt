// Automatically generated - do not modify!

package muix.pickers

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.system.Union
import react.ElementType
import react.Props
import react.PropsWithClassName
import web.cssom.ClassName

external interface YearCalendarProps :
    PropsWithClassName,
    PropsWithSx {
    var autoFocus: Boolean?

    override var className: ClassName?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: YearCalendarClasses?

    /**
     * Overridable component slots.
     * @default {}
     */
    var slots: YearCalendarSlots?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: YearCalendarSlotProps?

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
     * @default The closest valid year using the validation props, except callbacks such as `shouldDisableYear`.
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

    var onYearFocus: ((year: Number) -> Unit)?

    var hasFocus: Boolean?

    var onFocusedViewChange: ((hasFocus: Boolean) -> Unit)?

    var gridLabelId: String?
}

external interface YearButtonOwnerState : PickerOwnerState {
    var isYearSelected: Boolean

    var isYearDisabled: Boolean
}

external interface YearCalendarSlots {
    /**
     * Button displayed to render a single year in the `year` view.
     * @default YearCalendarButton
     */
    var yearButton: ElementType<*>?
}

external interface YearCalendarSlotProps : Props {
    var yearButton: Props?
}

external interface ExportedYearCalendarProps : Props {
    /**
     * Years are displayed in ascending (chronological) order by default.
     * If `desc`, years are displayed in descending order.
     * @default 'asc'
     */
    var yearsOrder: Union? /* 'asc' | 'desc' */

    /**
     * Years rendered per row.
     * @default 3
     */
    var yearsPerRow: Number? /* 3 | 4 */
}
