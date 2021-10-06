// Automatically generated - do not modify!

@file:JsModule("@mui/material/Backdrop")
@file:JsNonModule

package mui.material

external interface BackdropProps : react.Props {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic /* BackdropUnstyledTypeMap['props']['classes'] */

    /**
     * If `true`, the component is shown.
     */
    var open: Boolean

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>

    /**
     * The duration for the transition, in milliseconds.
     * You may specify a single timeout for all transitions, or individually with an object.
     */
    var transitionDuration: dynamic /* TransitionProps['timeout'] */
}

/**
 *
 * Demos:
 *
 * - [Backdrop](https://mui.com/components/backdrop/)
 *
 * API:
 *
 * - [Backdrop API](https://mui.com/api/backdrop/)
 * - inherits [Fade API](https://mui.com/api/fade/)
 */

@JsName("default")
external val Backdrop: react.FC<BackdropProps>
