// Automatically generated - do not modify!

@file:JsModule("@mui/lab/LoadingButton")
@file:JsNonModule

package mui.lab

import mui.material.styles.Theme
import mui.system.SxProps

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
     * The node should contain an element with `role="progressbar"` with an accessible name.
     * By default we render a `CircularProgress` that is labelled by the button itself.
     * @default <CircularProgress color="inherit" size={16} />
     */
    var loadingIndicator: react.ReactNode?

    /**
     * The loading indicator can be positioned on the start, end, or the center of the button.
     * @default 'center'
     */
    var loadingPosition: LoadingPosition?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
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
