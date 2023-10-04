// Automatically generated - do not modify!

@file:JsModule("@mui/material/CardContent")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface CardContentProps :
    CardContentOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    mui.types.PropsWithComponent

external interface CardContentOwnProps :
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: CardContentClasses?

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
 * - [CardContent API](https://mui.com/material-ui/api/card-content/)
 */
@JsName("default")
external val CardContent: react.FC<CardContentProps>
