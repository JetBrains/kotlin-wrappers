// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/DatePicker")

package muix.pickers

external interface DatePickerProps : react.Props {
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
    var componentsProps: DatePickerSlotsComponentsProps?
}

external interface DatePickerSlotsComponent

external interface DatePickerSlotsComponentsProps : react.Props


external val DatePicker: react.FC<DatePickerProps>
