// Automatically generated - do not modify!

@file:JsModule("@mui/material/InputLabel")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface InputLabelProps :
    react.dom.html.LabelHTMLAttributes<web.html.HTMLLabelElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent,
    FormLabelOwnProps {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: InputLabelClasses?

    var color: FormLabelColor?

    /**
     * If `true`, the transition animation is disabled.
     * @default false
     */
    var disableAnimation: Boolean?

    /**
     * If `true`, the component is disabled.
     */
    var disabled: Boolean?

    /**
     * If `true`, the label is displayed in an error state.
     */
    var error: Boolean?

    /**
     * If `true`, the `input` of this label is focused.
     */
    var focused: Boolean?

    /**
     * If `dense`, will adjust vertical spacing. This is normally obtained via context from
     * FormControl.
     */
    var margin: InputLabelMargin?

    /**
     * if `true`, the label will indicate that the `input` is required.
     */
    var required: Boolean?

    /**
     * If `true`, the label is shrunk.
     */
    var shrink: Boolean?

    /**
     * The size of the component.
     * @default 'normal'
     */
    var size: NormalSize?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The variant to use.
     */
    var variant: InputLabelVariant?
}

/**
 *
 * Demos:
 *
 * - [Text Field](https://mui.com/material-ui/react-text-field/)
 *
 * API:
 *
 * - [InputLabel API](https://mui.com/material-ui/api/input-label/)
 * - inherits [FormLabel API](https://mui.com/material-ui/api/form-label/)
 */
@JsName("default")
external val InputLabel: react.FC<InputLabelProps>
