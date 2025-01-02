// Automatically generated - do not modify!

package muix.pickers

external interface DatePickerProps<TDate, TEnableAccessibleFieldDOMStructure> : react.Props {
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
    var slots: DatePickerSlots<TDate>?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: DatePickerSlotProps<TDate, TEnableAccessibleFieldDOMStructure>?

    /**
     * Years rendered per row.
     * @default 4 on desktop, 3 on mobile
     */
    var yearsPerRow: dynamic
}

external interface DatePickerSlots<TDate>

external interface DatePickerSlotProps<TDate, TEnableAccessibleFieldDOMStructure> : react.Props
