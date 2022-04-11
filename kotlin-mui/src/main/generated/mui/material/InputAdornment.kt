// Automatically generated - do not modify!

@file:JsModule("@mui/material/InputAdornment")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface InputAdornmentProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: InputAdornmentClasses?

    /**
     * The content of the component, normally an `IconButton` or string.
     */
    override var children: react.ReactNode?

    /**
     * Disable pointer events on the root.
     * This allows for the content of the adornment to focus the `input` on click.
     * @default false
     */
    var disablePointerEvents: Boolean?

    /**
     * If children is a string then disable wrapping in a Typography component.
     * @default false
     */
    var disableTypography: Boolean?

    /**
     * The position this adornment should appear relative to the `Input`.
     */
    var position: InputAdornmentPosition

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The variant to use.
     * Note: If you are using the `TextField` component or the `FormControl` component
     * you do not have to set this manually.
     */
    var variant: InputAdornmentVariant?
}

/**
 *
 * Demos:
 *
 * - [Text Fields](https://mui.com/material-ui/react-text-field/)
 *
 * API:
 *
 * - [InputAdornment API](https://mui.com/material-ui/api/input-adornment/)
 */
@JsName("default")
external val InputAdornment: react.FC<InputAdornmentProps>
