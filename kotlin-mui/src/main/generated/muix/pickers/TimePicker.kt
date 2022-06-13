// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/TimePicker")
@file:JsNonModule

package muix.pickers

external interface TimePickerProps : react.Props {
    /**
     * CSS media query when `Mobile` mode will be changed to `Desktop`.
     * @default '@media (pointer: fine)'
     * @example '@media (min-width: 720px)' or theme.breakpoints.up("sm")
     */
    var desktopModeMediaQuery: String?

    /**
     * Overrideable components.
     * @default {}
     */
    var components: dynamic

    /**
     * The props used for each component slot.
     * @default {}
     */
    var componentsProps: TimePickerSlotsComponentsProps?
}

external interface TimePickerSlotsComponent

external interface TimePickerSlotsComponentsProps : react.Props


external val TimePicker: react.FC<TimePickerProps>
