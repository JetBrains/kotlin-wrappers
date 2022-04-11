// Automatically generated - do not modify!

@file:JsModule("@mui/material/FormHelperText")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface FormHelperTextProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLParagraphElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
    /**
     * The content of the component.
     *
     * If `' '` is provided, the component reserves one line height for displaying a future message.
     */
    override var children: react.ReactNode?

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
 * - [Text Fields](https://mui.com/material-ui/react-text-field/)
 *
 * API:
 *
 * - [FormHelperText API](https://mui.com/material-ui/api/form-helper-text/)
 */
@JsName("default")
external val FormHelperText: react.FC<FormHelperTextProps>
