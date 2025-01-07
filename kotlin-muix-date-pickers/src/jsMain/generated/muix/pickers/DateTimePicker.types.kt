// Automatically generated - do not modify!

package muix.pickers

external interface DateTimePickerProps<TDate, TEnableAccessibleFieldDOMStructure> : react.Props {
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
    var slots: DateTimePickerSlots<TDate>?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: DateTimePickerSlotProps<TDate, TEnableAccessibleFieldDOMStructure>?

    /**
     * Years rendered per row.
     * @default 4 on desktop, 3 on mobile
     */
    var yearsPerRow: Number? /* 3 | 4 */
}

external interface DateTimePickerSlots<TDate>

external interface DateTimePickerSlotProps<TDate, TEnableAccessibleFieldDOMStructure> : react.Props
