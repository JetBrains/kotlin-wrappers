// Automatically generated - do not modify!

package muix.pickers

import js.array.ReadonlyArray
import react.ComponentType
import react.Props

external interface DigitalClockProps :
    ExportedDigitalClockProps {
    /**
     * Available views.
     * @default ['hours']
     */
    var views: ReadonlyArray<String /* 'hours' */>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: DigitalClockClasses?

    /**
     * Overrideable component slots.
     * @default {}
     */
    var slots: DigitalClockSlots?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: DigitalClockSlotProps?
}

external interface ExportedDigitalClockProps : Props

external interface DigitalClockSlots {
    /**
     * Component responsible for rendering a single digital clock item.
     * @default MenuItem from '@mui/material'
     */
    var digitalClockItem: ComponentType<DigitalClockItemProps>?
}

external interface DigitalClockSlotProps : Props {
    var digitalClockItem: Props?
}

external interface DigitalClockOwnerState : PickerOwnerState {
    /**
     * `true` if this is not the initial render of the digital clock.
     */
    var hasDigitalClockAlreadyBeenRendered: Boolean
}

external interface DigitalClockItemProps : Props {
    var itemValue: PickerValidDate

    var formattedValue: String

    var onClick: () -> Unit

    var selected: Boolean

    var disabled: Boolean

    var readOnly: Boolean?

    var tabIndex: Int
}
