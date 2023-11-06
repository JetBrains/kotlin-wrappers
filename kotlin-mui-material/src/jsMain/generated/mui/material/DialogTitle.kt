// Automatically generated - do not modify!

@file:JsModule("@mui/material/DialogTitle")

@file:Suppress(
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface DialogTitleProps :
    DialogTitleOwnProps,
    mui.types.PropsWithComponent

external interface DialogTitleOwnProps :
    TypographyProps,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    override var classes: DialogTitleClasses?

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
 * - inherits [Typography API](https://mui.com/material-ui/api/typography/)
 */
@JsName("default")
external val DialogTitle: react.FC<DialogTitleProps>
