// Automatically generated - do not modify!

@file:JsModule("@mui/material/InputAdornment")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface InputAdornmentProps : react.PropsWithChildren {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: InputAdornmentClasses

    /**
     * The content of the component, normally an `IconButton` or string.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Disable pointer events on the root.
     * This allows for the content of the adornment to focus the `input` on click.
     * @default false
     */
    var disablePointerEvents: Boolean

    /**
     * If children is a string then disable wrapping in a Typography component.
     * @default false
     */
    var disableTypography: Boolean

    /**
     * The position this adornment should appear relative to the `Input`.
     */
    var position: mui.system.Union /* 'start' | 'end' */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>

    /**
     * The variant to use.
     * Note: If you are using the `TextField` component or the `FormControl` component
     * you do not have to set this manually.
     */
    var variant: mui.system.Union /* 'standard' | 'outlined' | 'filled' */
}

/**
 *
 * Demos:
 *
 * - [Text Fields](https://mui.com/components/text-fields/)
 *
 * API:
 *
 * - [InputAdornment API](https://mui.com/api/input-adornment/)
 */
@JsName("default")
external val InputAdornment: react.FC<InputAdornmentProps>
