// Automatically generated - do not modify!

package muix.pickers

import react.Props

external interface DatePickerProps : Props {
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
    var slots: DatePickerSlots?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: DatePickerSlotProps?

    /**
     * Years rendered per row.
     * @default 4 on desktop, 3 on mobile
     */
    var yearsPerRow: Number? /* 3 | 4 */

    /**
     * If `true`, the Picker will close after submitting the full date.
     * @default `true` for desktop, `false` for mobile (based on the chosen wrapper and `desktopModeMediaQuery` prop).
     */
    var closeOnSelect: Boolean?
}

external interface DatePickerSlots

external interface DatePickerSlotProps : Props
