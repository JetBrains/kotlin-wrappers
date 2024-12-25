// Automatically generated - do not modify!

package muix.pickers

external interface TimeClockProps<TDate> : react.Props {
    /**
     * Available views.
     * @default ['hours', 'minutes']
     */
    var views: dynamic

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TimeClockClasses?

    /**
     * Overridable component slots.
     * @default {}
     */
    var slots: TimeClockSlots?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: TimeClockSlotProps?

    var showViewSwitcher: Boolean?
}

external interface ExportedTimeClockProps : react.Props {
    /**
     * Display ampm controls under the clock (instead of in the toolbar).
     * @default false
     */
    var ampmInClock: Boolean?
}

external interface TimeClockSlots

external interface TimeClockSlotProps : react.Props
