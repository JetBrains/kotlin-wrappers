// Automatically generated - do not modify!

package muix.pickers

external interface MobileDatePickerProps<TDate, TEnableAccessibleFieldDOMStructure> : react.Props {
    /**
     * Overridable component slots.
     * @default {}
     */
    var slots: MobileDatePickerSlots<TDate>?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: MobileDatePickerSlotProps<TDate, TEnableAccessibleFieldDOMStructure>?

    /**
     * Years rendered per row.
     * @default 3
     */
    var yearsPerRow: Number? /* 3 | 4 */
}

external interface MobileDatePickerSlots<TDate>

external interface MobileDatePickerSlotProps<TDate, TEnableAccessibleFieldDOMStructure> : react.Props
