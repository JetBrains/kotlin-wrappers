// Automatically generated - do not modify!

package muix.pickers

import react.Props

external interface TimePickerProps : Props {
    /**
     * CSS media query when `Mobile` mode will be changed to `Desktop`.
     * @default '@media (pointer: fine)'
     * @example '@media (min-width: 720px)' or theme.breakpoints.up("sm")
     */
    var desktopModeMediaQuery: String?

    /**
     * Overridable component slots.
     * @default {}
     */
    var slots: TimePickerSlots?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: TimePickerSlotProps?
}

external interface TimePickerSlots

external interface TimePickerSlotProps : Props
