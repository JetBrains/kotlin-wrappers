// Automatically generated - do not modify!

@file:JsModule("@mui/material/Link")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.AnchorHTMLAttributes
import web.html.HTMLAnchorElement

external interface LinkProps :
    LinkOwnProps,
    AnchorHTMLAttributes<HTMLAnchorElement>,
    PropsWithComponent

external interface LinkOwnProps :
    LinkBaseProps,
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: LinkClasses?

    /**
     * The color of the link.
     * @default 'primary'
     */
    var color: Any? /* TypographyOwnProps['color'] */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * `classes` prop applied to the [`Typography`](https://mui.com/material-ui/api/typography/) element.
     */
    var TypographyClasses: TypographyClasses?

    /**
     * Controls when the link should have an underline.
     * @default 'always'
     */
    var underline: LinkUnderline?

    /**
     * Applies the theme typography styles.
     * @default 'inherit'
     */
    var variant: Any? /* TypographyOwnProps['variant'] */
}

/**
 *
 * Demos:
 *
 * - [Breadcrumbs](https://v6.mui.com/material-ui/react-breadcrumbs/)
 * - [Links](https://v6.mui.com/material-ui/react-link/)
 *
 * API:
 *
 * - [Link API](https://v6.mui.com/material-ui/api/link/)
 * - inherits [Typography API](https://v6.mui.com/material-ui/api/typography/)
 */
@JsName("default")
external val Link: FC<LinkProps>
