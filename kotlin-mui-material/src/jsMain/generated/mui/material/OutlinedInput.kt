// Automatically generated - do not modify!

@file:JsModule("@mui/material/OutlinedInput")

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
import react.dom.html.FieldsetHTMLAttributes
import web.html.HTMLFieldSetElement

external interface OutlinedInputProps :
    StandardProps,
    InputBaseProps,
    PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: OutlinedInputClasses?

    /**
     * The label of the `input`. It is only used for layout. The actual labelling
     * is handled by `InputLabel`.
     */
    var label: ReactNode?

    /**
     * If `true`, the outline is notched to accommodate the label.
     */
    var notched: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface OutlinedInputSlots {
    /**
     * The component that renders the notchedOutline slot.
     * @default NotchedOutline
     */
    var notchedOutline: ElementType<*>
}

external interface OutlinedInputSlotProps : Props {
    /** TS: SlotProps<'fieldset', {}, OutlinedInputOwnerState> */
    var notchedOutline: FieldsetHTMLAttributes<HTMLFieldSetElement>?
}

external interface OutlinedInputSlotsAndSlotProps : Props {
    var slots: OutlinedInputSlots?

    var slotProps: OutlinedInputSlotProps?
}

external interface OutlinedInputOwnerState

/**
 *
 * Demos:
 *
 * - [Text Field](https://v6.mui.com/material-ui/react-text-field/)
 *
 * API:
 *
 * - [OutlinedInput API](https://v6.mui.com/material-ui/api/outlined-input/)
 * - inherits [InputBase API](https://v6.mui.com/material-ui/api/input-base/)
 */
@JsName("default")
external val OutlinedInput: FC<OutlinedInputProps>
