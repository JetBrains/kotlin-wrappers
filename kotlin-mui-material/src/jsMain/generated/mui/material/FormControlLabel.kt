// Automatically generated - do not modify!

@file:JsModule("@mui/material/FormControlLabel")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.*
import react.dom.events.SyntheticEvent
import react.dom.html.LabelHTMLAttributes
import web.html.HTMLLabelElement

external interface FormControlLabelProps :
    StandardProps,
    LabelHTMLAttributes<HTMLLabelElement>,
    FormControlLabelSlotsAndSlotProps,
    PropsWithSx {
    /**
     * If `true`, the component appears selected.
     */
    var checked: Boolean?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: FormControlLabelClasses?

    /**
     * The props used for each slot inside.
     * @default {}
     * @deprecated use the `slotProps` prop instead. This prop will be removed in v7. See [Migrating from deprecated APIs](https://mui.com/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var typography: Props? /* TypographyProps */
    }

    /**
     * A control element. For instance, it can be a `Radio`, a `Switch` or a `Checkbox`.
     */
    var control: Any? /* React.ReactElement<unknown, any> */

    /**
     * If `true`, the control is disabled.
     */
    var disabled: Boolean?

    /**
     * If `true`, the label is rendered as it is passed without an additional typography node.
     */
    var disableTypography: Boolean?

    /**
     * Pass a ref to the `input` element.
     */
    var inputRef: Ref<*>?

    /**
     * A text or an element to be used in an enclosing label element.
     */
    var label: ReactNode

    /**
     * The position of the label.
     * @default 'end'
     */
    var labelPlacement: LabelPlacement?

    var name: String?

    /**
     * Callback fired when the state is changed.
     *
     * @param {React.SyntheticEvent} event The event source of the callback.
     * You can pull out the new checked state by accessing `event.target.checked` (boolean).
     */
    var onChange: ((event: SyntheticEvent<*, *>, checked: Boolean) -> Unit)?

    /**
     * If `true`, the label will indicate that the `input` is required.
     */
    var required: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The value of the component.
     */
    var value: Any?
}

external interface FormControlLabelSlots {
    /**
     * The component that renders the label.
     * This is unused if `disableTypography` is true.
     * @default Typography
     */
    var typography: ElementType<*>
}

external interface FormControlLabelSlotProps : Props {
    /** TS: SlotProps<typeof Typography, {}, FormControlLabelProps> */
    var typography: TypographyProps?
}

external interface FormControlLabelSlotsAndSlotProps : Props {
    var slots: FormControlLabelSlots?

    var slotProps: FormControlLabelSlotProps?
}

/**
 * Drop-in replacement of the `Radio`, `Switch` and `Checkbox` component.
 * Use this component if you want to display an extra label.
 *
 * Demos:
 *
 * - [Checkbox](https://v6.mui.com/material-ui/react-checkbox/)
 * - [Radio Group](https://v6.mui.com/material-ui/react-radio-button/)
 * - [Switch](https://v6.mui.com/material-ui/react-switch/)
 *
 * API:
 *
 * - [FormControlLabel API](https://v6.mui.com/material-ui/api/form-control-label/)
 */
@JsName("default")
external val FormControlLabel: FC<FormControlLabelProps>
