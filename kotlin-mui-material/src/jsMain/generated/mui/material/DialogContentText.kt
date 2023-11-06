// Automatically generated - do not modify!

@file:JsModule("@mui/material/DialogContentText")

@file:Suppress(
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface DialogContentTextProps :
    DialogContentTextOwnProps,
    mui.types.PropsWithComponent

external interface DialogContentTextOwnProps :
    TypographyProps,
    mui.system.PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    override var classes: DialogContentTextClasses?

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
 * - [DialogContentText API](https://mui.com/material-ui/api/dialog-content-text/)
 * - inherits [Typography API](https://mui.com/material-ui/api/typography/)
 */
@JsName("default")
external val DialogContentText: react.FC<DialogContentTextProps>
