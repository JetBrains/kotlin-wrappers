// Automatically generated - do not modify!

package muix.pickers

external interface MultiSectionDigitalClockProps<TDate> : react.Props {
    /**
     * Available views.
     * @default ['hours', 'minutes']
     */
    var views: dynamic

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

external interface MultiSectionDigitalClockOption<TValue> {
    var isDisabled: ((value: TValue) -> Boolean)?

    var isSelected: (value: TValue) -> Boolean

    var isFocused: (value: TValue) -> Boolean

    var label: String

    var value: TValue

    var ariaLabel: String
}

external interface ExportedMultiSectionDigitalClockProps : react.Props

external interface MultiSectionDigitalClockViewProps : react.Props

external interface MultiSectionDigitalClockSlots {
    /**
     * Component responsible for rendering a single multi section digital clock section item.
     * @default MenuItem from '@mui/material'
     */
    var digitalClockSectionItem: react.ElementType<*>?
}

external interface MultiSectionDigitalClockSlotProps : react.Props {
    var digitalClockSectionItem: react.Props?
}
