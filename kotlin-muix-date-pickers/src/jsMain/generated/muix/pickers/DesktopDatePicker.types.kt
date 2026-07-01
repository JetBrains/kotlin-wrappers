// Automatically generated - do not modify!

package muix.pickers

import react.Props

external interface DesktopDatePickerProps : Props {
    /**
     * Overridable component slots.
     * @default {}
     */
    var slots: DesktopDatePickerSlots?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: DesktopDatePickerSlotProps?

    /**
     * Years rendered per row.
     * @default 4
     */
    var yearsPerRow: Number? /* 3 | 4 */

    /**
     * If `true`, the Picker will close after submitting the full date.
     * @default true
     */
    var closeOnSelect: Boolean?
}

external interface DesktopDatePickerSlots

external interface DesktopDatePickerSlotProps : Props
