// Automatically generated - do not modify!

@file:JsModule("@mui/material/Card")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface CardProps :
    CardOwnProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithComponent

external interface CardOwnProps :
    PaperOwnProps,
    PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: CardClasses?

    /**
     * If `true`, the card will use raised styling.
     * @default false
     */
    var raised: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Card](https://v6.mui.com/material-ui/react-card/)
 *
 * API:
 *
 * - [Card API](https://v6.mui.com/material-ui/api/card/)
 * - inherits [Paper API](https://v6.mui.com/material-ui/api/paper/)
 */

@JsName("default")
external val Card: FC<CardProps>
