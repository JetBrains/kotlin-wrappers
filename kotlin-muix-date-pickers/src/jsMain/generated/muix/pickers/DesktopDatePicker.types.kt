// Automatically generated - do not modify!

package muix.pickers

external interface DesktopDatePickerProps<TDate, TEnableAccessibleFieldDOMStructure> : react.Props {
    /**
     * Overridable component slots.
     * @default {}
     */
    var slots: DesktopDatePickerSlots<TDate>?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: DesktopDatePickerSlotProps<TDate, TEnableAccessibleFieldDOMStructure>?

    /**
     * Years rendered per row.
     * @default 4
     */
    var yearsPerRow: Number? /* 3 | 4 */
}

external interface DesktopDatePickerSlots<TDate>

external interface DesktopDatePickerSlotProps<TDate, TEnableAccessibleFieldDOMStructure> : react.Props
