// Automatically generated - do not modify!

@file:JsModule("@mui/material/ListItemText")
@file:JsNonModule

package mui.material

external interface ListItemTextProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren {
    /**
     * Alias for the `primary` prop.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ListItemTextClasses?

    /**
     * If `true`, the children won't be wrapped by a Typography component.
     * This can be useful to render an alternative Typography variant by wrapping
     * the `children` (or `primary`) text, and optional `secondary` text
     * with the Typography component.
     * @default false
     */
    var disableTypography: Boolean?

    /**
     * If `true`, the children are indented.
     * This should be used if there is no left avatar or left icon.
     * @default false
     */
    var inset: Boolean?

    /**
     * The main content element.
     */
    var primary: react.ReactNode?

    /**
     * These props will be forwarded to the primary typography component
     * (as long as disableTypography is not `true`).
     */
    var primaryTypographyProps: TypographyProps?

    /**
     * The secondary content element.
     */
    var secondary: react.ReactNode?

    /**
     * These props will be forwarded to the secondary typography component
     * (as long as disableTypography is not `true`).
     */
    var secondaryTypographyProps: TypographyProps?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [Lists](https://mui.com/components/lists/)
 *
 * API:
 *
 * - [ListItemText API](https://mui.com/api/list-item-text/)
 */
@JsName("default")
external val ListItemText: react.FC<ListItemTextProps>
