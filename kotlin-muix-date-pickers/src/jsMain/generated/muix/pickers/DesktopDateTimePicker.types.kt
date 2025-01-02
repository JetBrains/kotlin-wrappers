// Automatically generated - do not modify!

package muix.pickers

external interface DesktopDateTimePickerProps<TDate, TEnableAccessibleFieldDOMStructure> : react.Props {
    /**
     * Overridable component slots.
     * @default {}
     */
    var slots: DesktopDateTimePickerSlots<TDate>?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: DesktopDateTimePickerSlotProps<TDate, TEnableAccessibleFieldDOMStructure>?

    /**
     * Available views.
     */
    var views: dynamic

    /**
     * Years rendered per row.
     * @default 4
     */
    var yearsPerRow: dynamic
}

external interface DesktopDateTimePickerSlots<TDate>

external interface DesktopDateTimePickerSlotProps<TDate, TEnableAccessibleFieldDOMStructure> : react.Props
