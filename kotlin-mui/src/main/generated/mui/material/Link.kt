// Automatically generated - do not modify!

@file:JsModule("@mui/material/Link")
@file:JsNonModule

package mui.material

external interface LinkProps :
    react.dom.html.AnchorHTMLAttributes<org.w3c.dom.HTMLAnchorElement>,
    react.PropsWithChildren {
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
    var color: dynamic /* TypographyProps['color'] */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?

    /**
     * `classes` prop applied to the [`Typography`](/api/typography/) element.
     */
    var TypographyClasses: TypographyClasses?

    /**
     * Controls when the link should have an underline.
     * @default 'always'
     */
    var underline: mui.system.Union? /* 'none' | 'hover' | 'always' */

    /**
     * Applies the theme typography styles.
     * @default 'inherit'
     */
    var variant: dynamic /* TypographyProps['variant'] */
}

/**
 *
 * Demos:
 *
 * - [Breadcrumbs](https://mui.com/components/breadcrumbs/)
 * - [Links](https://mui.com/components/links/)
 *
 * API:
 *
 * - [Link API](https://mui.com/api/link/)
 * - inherits [Typography API](https://mui.com/api/typography/)
 */
@JsName("default")
external val Link: react.FC<LinkProps>
