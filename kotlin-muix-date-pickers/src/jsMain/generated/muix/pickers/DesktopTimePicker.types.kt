// Automatically generated - do not modify!

package muix.pickers

import js.array.ReadonlyArray

external interface DesktopTimePickerProps<TDate, TEnableAccessibleFieldDOMStructure> : react.Props {
    /**
     * Available views.
     */
    var views: ReadonlyArray<String /* 'hours' | 'minutes' | 'seconds' */>?

    /**
     * Overridable component slots.
     * @default {}
     */
    var slots: DesktopTimePickerSlots<TDate>?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: DesktopTimePickerSlotProps<TDate, TEnableAccessibleFieldDOMStructure>?
}

external interface DesktopTimePickerSlots<TDate>

external interface DesktopTimePickerSlotProps<TDate, TEnableAccessibleFieldDOMStructure> : react.Props
