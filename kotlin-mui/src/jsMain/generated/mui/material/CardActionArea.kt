// Automatically generated - do not modify!

@file:JsModule("@mui/material/CardActionArea")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps
import web.cssom.ClassName

external interface CardActionAreaProps : mui.system.PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: CardActionAreaClasses?

    var focusVisibleClassName: ClassName?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Card](https://mui.com/material-ui/react-card/)
 *
 * API:
 *
 * - [CardActionArea API](https://mui.com/material-ui/api/card-action-area/)
 * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
 */
@JsName("default")
external val CardActionArea: react.FC<CardActionAreaProps>
