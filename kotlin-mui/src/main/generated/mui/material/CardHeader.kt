// Automatically generated - do not modify!

@file:JsModule("@mui/material/CardHeader")
@file:JsNonModule

package mui.material

external interface CardHeaderProps : react.Props {
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
    var sx: mui.system.SxProps<mui.system.Theme>?

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
 * - [Cards](https://mui.com/components/cards/)
 *
 * API:
 *
 * - [CardHeader API](https://mui.com/api/card-header/)
 */
@JsName("default")
external val CardHeader: react.FC<CardHeaderProps>
