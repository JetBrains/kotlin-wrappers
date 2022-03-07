// Automatically generated - do not modify!

@file:JsModule("@mui/material/CardActionArea")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface CardActionAreaProps : mui.system.PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: CardActionAreaClasses?

    var focusVisibleClassName: String?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Cards](https://mui.com/components/cards/)
 *
 * API:
 *
 * - [CardActionArea API](https://mui.com/api/card-action-area/)
 * - inherits [ButtonBase API](https://mui.com/api/button-base/)
 */
@JsName("default")
external val CardActionArea: react.FC<CardActionAreaProps>
