// Automatically generated - do not modify!

package muix.pickers

import js.array.ReadonlyArray

external interface DigitalClockProps<TDate> : react.Props {
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

external interface ExportedDigitalClockProps : react.Props

external interface DigitalClockSlots {
    /**
     * Component responsible for rendering a single digital clock item.
     * @default MenuItem from '@mui/material'
     */
    var digitalClockItem: react.ElementType<*>?
}

external interface DigitalClockSlotProps : react.Props {
    var digitalClockItem: react.Props?
}
