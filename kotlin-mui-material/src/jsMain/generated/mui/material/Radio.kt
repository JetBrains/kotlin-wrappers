// Automatically generated - do not modify!

@file:JsModule("@mui/material/Radio")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.ElementType
import react.FC
import react.Props
import react.ReactNode
import react.dom.html.InputHTMLAttributes
import web.html.HTMLInputElement

external interface RadioProps :
    StandardProps,
    SwitchBaseProps,
    PropsWithSx {
    /**
     * The icon to display when the component is checked.
     * @default <RadioButtonIcon checked />
     */
    var checkedIcon: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: RadioClasses?

    /**
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#custom-colors).
     * @default 'primary'
     */
    var color: RadioColor?

    /**
     * If `true`, the component is disabled.
     */
    var disabled: Boolean?

    /**
     * The icon to display when the component is unchecked.
     * @default <RadioButtonIcon />
     */
    var icon: ReactNode?

    /**
     * The size of the component.
     * `small` is equivalent to the dense radio styling.
     * @default 'medium'
     */
    var size: BaseSize?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface RadioPropsSizeOverrides

external interface RadioPropsColorOverrides

external interface RadioRootSlotPropsOverrides

external interface RadioInputSlotPropsOverrides

external interface RadioSlots {
    /**
     * The component that renders the root slot.
     * @default SwitchBase
     */
    var root: ElementType<*>

    /**
     * The component that renders the input slot.
     * @default SwitchBase's input
     */
    var input: ElementType<*>
}

external interface RadioSlotProps : Props {
    /** TS: SlotProps< React.ElementType<SwitchBaseProps>, RadioRootSlotPropsOverrides, RadioOwnerState > */
    var root: SwitchBaseProps?

    /** TS: SlotProps<'input', RadioInputSlotPropsOverrides, RadioOwnerState> */
    var input: InputHTMLAttributes<HTMLInputElement>?
}

external interface RadioSlotsAndSlotProps : Props {
    var slots: RadioSlots?

    var slotProps: RadioSlotProps?
}

external interface RadioOwnerState

/**
 *
 * Demos:
 *
 * - [Radio Group](https://v6.mui.com/material-ui/react-radio-button/)
 *
 * API:
 *
 * - [Radio API](https://v6.mui.com/material-ui/api/radio/)
 * - inherits [ButtonBase API](https://v6.mui.com/material-ui/api/button-base/)
 */
@JsName("default")
external val Radio: FC<RadioProps>
