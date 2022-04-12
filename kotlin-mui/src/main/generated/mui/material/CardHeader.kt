// Automatically generated - do not modify!

@file:JsModule("@mui/material/CardHeader")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface CardHeaderProps : mui.system.PropsWithSx {
    /**
     * The action to display in the card header.
     */
    var action: react.ReactNode?

    /**
     * The Avatar element to display.
     */
    var avatar: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: CardHeaderClasses?

    /**
     * If `true`, `subheader` and `title` won't be wrapped by a Typography component.
     * This can be useful to render an alternative Typography variant by wrapping
     * the `title` text, and optional `subheader` text
     * with the Typography component.
     * @default false
     */
    var disableTypography: Boolean?

    /**
     * The content of the component.
     */
    var subheader: react.ReactNode?

    /**
     * These props will be forwarded to the subheader
     * (as long as disableTypography is not `true`).
     */
    var subheaderTypographyProps: TypographyProps?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The content of the component.
     */
    var title: react.ReactNode?

    /**
     * These props will be forwarded to the title
     * (as long as disableTypography is not `true`).
     */
    var titleTypographyProps: TypographyProps?
}

/**
 *
 * Demos:
 *
 * - [Cards](https://mui.com/material-ui/react-card/)
 *
 * API:
 *
 * - [CardHeader API](https://mui.com/material-ui/api/card-header/)
 */
@JsName("default")
external val CardHeader: react.FC<CardHeaderProps>
