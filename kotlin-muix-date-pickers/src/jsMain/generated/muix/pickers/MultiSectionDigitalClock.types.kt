// Automatically generated - do not modify!

package muix.pickers

import js.array.ReadonlyArray
import react.ElementType
import react.Props

external interface MultiSectionDigitalClockProps :
    ExportedMultiSectionDigitalClockProps {
    /**
     * Available views.
     * @default ['hours', 'minutes']
     */
    var views: ReadonlyArray<String /* 'hours' | 'minutes' | 'seconds' | 'meridiem' */>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: MultiSectionDigitalClockClasses?

    /**
     * Overrideable component slots.
     * @default {}
     */
    var slots: MultiSectionDigitalClockSlots?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: MultiSectionDigitalClockSlotProps?
}

external interface MultiSectionDigitalClockOption<TSectionValue> {
    var isDisabled: ((value: TSectionValue) -> Boolean)?

    var isSelected: (value: TSectionValue) -> Boolean

    var isFocused: (value: TSectionValue) -> Boolean

    var label: String

    var value: TSectionValue

    var ariaLabel: String
}

external interface ExportedMultiSectionDigitalClockProps : Props

external interface MultiSectionDigitalClockViewProps<TSectionValue> : Props

external interface MultiSectionDigitalClockSlots {
    /**
     * Component responsible for rendering a single multi section digital clock section item.
     * @default MenuItem from '@mui/material'
     */
    var digitalClockSectionItem: ElementType<*>?
}

external interface MultiSectionDigitalClockSlotProps : Props {
    var digitalClockSectionItem: Props?
}
