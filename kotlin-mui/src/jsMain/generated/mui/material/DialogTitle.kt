// Automatically generated - do not modify!

@file:JsModule("@mui/material/DialogTitle")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface DialogTitleProps :
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: DialogTitleClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Dialog](https://mui.com/material-ui/react-dialog/)
 *
 * API:
 *
 * - [DialogTitle API](https://mui.com/material-ui/api/dialog-title/)
 */
@JsName("default")
external val DialogTitle: react.FC<DialogTitleProps>
