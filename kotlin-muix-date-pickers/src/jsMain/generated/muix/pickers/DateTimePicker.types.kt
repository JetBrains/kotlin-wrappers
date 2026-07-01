// Automatically generated - do not modify!

package muix.pickers

import react.Props

external interface DateTimePickerProps : Props {
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
    var slots: DateTimePickerSlots?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: DateTimePickerSlotProps?

    /**
     * Years rendered per row.
     * @default 4 on desktop, 3 on mobile
     */
    var yearsPerRow: Number? /* 3 | 4 */
}

external interface DateTimePickerSlots

external interface DateTimePickerSlotProps : Props
