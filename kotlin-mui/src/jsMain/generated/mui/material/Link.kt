// Automatically generated - do not modify!

@file:JsModule("@mui/material/Link")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface LinkProps :
    react.dom.html.AnchorHTMLAttributes<web.html.HTMLAnchorElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: LinkClasses?

    /**
     * The color of the link.
     * @default 'primary'
     */
    var color: dynamic /* TypographyOwnProps['color'] */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * `classes` prop applied to the [`Typography`](/material-ui/api/typography/) element.
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
    var variant: dynamic /* TypographyOwnProps['variant'] */
}

/**
 *
 * Demos:
 *
 * - [Breadcrumbs](https://mui.com/material-ui/react-breadcrumbs/)
 * - [Links](https://mui.com/material-ui/react-link/)
 *
 * API:
 *
 * - [Link API](https://mui.com/material-ui/api/link/)
 * - inherits [Typography API](https://mui.com/material-ui/api/typography/)
 */
@JsName("default")
external val Link: react.FC<LinkProps>
