// Automatically generated - do not modify!

package muix.pickers

import js.array.ReadonlyArray

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
    var views: ReadonlyArray<String /* 'year' | 'month' | 'day' | 'hours' | 'minutes' | 'seconds' */>?

    /**
     * Years rendered per row.
     * @default 4
     */
    var yearsPerRow: Number? /* 3 | 4 */
}

external interface DesktopDateTimePickerSlots<TDate>

external interface DesktopDateTimePickerSlotProps<TDate, TEnableAccessibleFieldDOMStructure> : react.Props
