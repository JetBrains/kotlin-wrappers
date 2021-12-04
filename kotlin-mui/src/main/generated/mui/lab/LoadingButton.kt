// Automatically generated - do not modify!

@file:JsModule("@mui/lab/LoadingButton")
@file:JsNonModule

package mui.lab

external interface LoadingButtonProps :
    mui.material.ButtonProps {
    /**
     * Override or extend the styles applied to the component.
     */
    override var classes: dynamic

    /**
     * If `true`, the loading indicator is shown.
     * @default false
     */
    var loading: Boolean?

    /**
     * Element placed before the children if the button is in loading state.
     * @default <CircularProgress color="inherit" size={16} />
     */
    var loadingIndicator: react.ReactNode?

    /**
     * The loading indicator can be positioned on the start, end, or the center of the button.
     * @default 'center'
     */
    var loadingPosition: mui.system.Union? /* 'start' | 'end' | 'center' */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [Buttons](https://mui.com/components/buttons/)
 *
 * API:
 *
 * - [LoadingButton API](https://mui.com/api/loading-button/)
 * - inherits [Button API](https://mui.com/api/button/)
 */
@JsName("default")
external val LoadingButton: react.FC<LoadingButtonProps>
