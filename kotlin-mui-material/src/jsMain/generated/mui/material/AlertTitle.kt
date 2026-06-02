// Automatically generated - do not modify!

@file:JsModule("@mui/material/AlertTitle")

@file:Suppress(
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
)

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import react.FC
import react.PropsWithChildren
import react.ReactNode

external interface AlertTitleProps :
    TypographyProps,
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    override var classes: AlertTitleClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Alert](https://v6.mui.com/material-ui/react-alert/)
 *
 * API:
 *
 * - [AlertTitle API](https://v6.mui.com/material-ui/api/alert-title/)
 * - inherits [Typography API](https://v6.mui.com/material-ui/api/typography/)
 */
@JsName("default")
external val AlertTitle: FC<AlertTitleProps>
