// Automatically generated - do not modify!

package muix.pickers

import js.array.ReadonlyArray
import react.Props

external interface DesktopTimePickerProps : Props {
    /**
     * Available views.
     */
    var views: ReadonlyArray<String /* 'hours' | 'minutes' | 'seconds' */>?

    /**
     * Overridable component slots.
     * @default {}
     */
    var slots: DesktopTimePickerSlots?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: DesktopTimePickerSlotProps?
}

external interface DesktopTimePickerSlots

external interface DesktopTimePickerSlotProps : Props
