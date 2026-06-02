// Automatically generated - do not modify!

@file:JsModule("@mui/material/FormHelperText")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLParagraphElement

external interface FormHelperTextProps :
    FormHelperTextOwnProps,
    HTMLAttributes<HTMLParagraphElement>,
    PropsWithComponent

external interface FormHelperTextOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component.
     *
     * If `' '` is provided, the component reserves one line height for displaying a future message.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: FormHelperTextClasses?

    /**
     * If `true`, the helper text should be displayed in a disabled state.
     */
    var disabled: Boolean?

    /**
     * If `true`, helper text should be displayed in an error state.
     */
    var error: Boolean?

    /**
     * If `true`, the helper text should use filled classes key.
     */
    var filled: Boolean?

    /**
     * If `true`, the helper text should use focused classes key.
     */
    var focused: Boolean?

    /**
     * If `dense`, will adjust vertical spacing. This is normally obtained via context from
     * FormControl.
     */
    var margin: FormHelperTextMargin?

    /**
     * If `true`, the helper text should use required classes key.
     */
    var required: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The variant to use.
     */
    var variant: FormHelperTextVariant?
}

/**
 *
 * Demos:
 *
 * - [Text Field](https://v6.mui.com/material-ui/react-text-field/)
 *
 * API:
 *
 * - [FormHelperText API](https://v6.mui.com/material-ui/api/form-helper-text/)
 */
@JsName("default")
external val FormHelperText: FC<FormHelperTextProps>
