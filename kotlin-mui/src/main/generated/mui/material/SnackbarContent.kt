// Automatically generated - do not modify!

@file:JsModule("@mui/material/SnackbarContent")
@file:JsNonModule

package mui.material

external interface SnackbarContentProps : react.Props {
    /**
     * The action to display. It renders after the message, at the end of the snackbar.
     */
    var action: react.ReactNode

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SnackbarContentClasses

    /**
     * The message to display.
     */
    var message: react.ReactNode

    /**
     * The ARIA role attribute of the element.
     * @default 'alert'
     */
    var role: dynamic /* PaperProps['role'] */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>
}

/**
 *
 * Demos:
 *
 * - [Snackbars](https://mui.com/components/snackbars/)
 *
 * API:
 *
 * - [SnackbarContent API](https://mui.com/api/snackbar-content/)
 * - inherits [Paper API](https://mui.com/api/paper/)
 */
@JsName("default")
external val SnackbarContent: react.FC<SnackbarContentProps>
