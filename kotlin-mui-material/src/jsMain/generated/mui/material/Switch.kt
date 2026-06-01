// Automatically generated - do not modify!

@file:JsModule("@mui/material/Switch")

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
import react.dom.html.HTMLAttributes
import react.dom.html.InputHTMLAttributes
import web.html.HTMLInputElement
import web.html.HTMLSpanElement

external interface SwitchProps :
    StandardProps,
    SwitchBaseProps,
    PropsWithSx {
    /**
     * The icon to display when the component is checked.
     */
    var checkedIcon: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SwitchClasses?

    /**
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#custom-colors).
     * @default 'primary'
     */
    var color: SwitchColor?

    /**
     * If `true`, the component is disabled.
     */
    var disabled: Boolean?

    /**
     * The icon to display when the component is unchecked.
     */
    var icon: ReactNode?

    /**
     * The size of the component.
     * `small` is equivalent to the dense switch styling.
     * @default 'medium'
     */
    var size: BaseSize?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The value of the component. The DOM API casts this to a string.
     * The browser uses "on" as the default value.
     */
    var value: Any?
}

external interface SwitchPropsSizeOverrides

external interface SwitchPropsColorOverrides

external interface SwitchRootSlotPropsOverrides

external interface SwitchTrackSlotPropsOverrides

external interface SwitchThumbSlotPropsOverrides

external interface SwitchSwitchBaseSlotPropsOverrides

external interface SwitchInputSlotPropsOverrides

external interface SwitchSlots {
    /**
     * The component that renders the root slot.
     * @default 'span'
     */
    var root: ElementType<*>

    /**
     * The component that renders the track slot.
     * @default 'span'
     */
    var track: ElementType<*>

    /**
     * The component that renders the thumb slot.
     * @default 'span'
     */
    var thumb: ElementType<*>

    /**
     * The component that renders the switchBase slot.
     * @default SwitchBase
     */
    var switchBase: ElementType<*>

    /**
     * The component that renders the switchBase's input slot.
     * @default SwitchBaseInput
     */
    var input: ElementType<*>
}

external interface SwitchSlotProps : Props {
    /** TS: SlotProps<'span', SwitchRootSlotPropsOverrides, SwitchOwnerState> */
    var root: HTMLAttributes<HTMLSpanElement>?

    /** TS: SlotProps<'span', SwitchTrackSlotPropsOverrides, SwitchOwnerState> */
    var track: HTMLAttributes<HTMLSpanElement>?

    /** TS: SlotProps<'span', SwitchThumbSlotPropsOverrides, SwitchOwnerState> */
    var thumb: HTMLAttributes<HTMLSpanElement>?

    /** TS: SlotProps< React.ElementType<SwitchBaseProps>, SwitchSwitchBaseSlotPropsOverrides, SwitchOwnerState > */
    var switchBase: SwitchBaseProps?

    /** TS: SlotProps<'input', SwitchInputSlotPropsOverrides, SwitchOwnerState> */
    var input: InputHTMLAttributes<HTMLInputElement>?
}

external interface SwitchSlotsAndSlotProps : Props {
    var slots: SwitchSlots?

    var slotProps: SwitchSlotProps?
}

external interface SwitchOwnerState

/**
 *
 * Demos:
 *
 * - [Switch](https://v6.mui.com/material-ui/react-switch/)
 * - [Transfer List](https://v6.mui.com/material-ui/react-transfer-list/)
 *
 * API:
 *
 * - [Switch API](https://v6.mui.com/material-ui/api/switch/)
 * - inherits [IconButton API](https://v6.mui.com/material-ui/api/icon-button/)
 */
@JsName("default")
external val Switch: FC<SwitchProps>
