// Automatically generated - do not modify!

@file:JsModule("@mui/material/Toolbar")
@file:JsNonModule

package mui.material

external interface ToolbarProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren {
    /**
     * The Toolbar children, usually a mixture of `IconButton`, `Button` and `Typography`.
     * The Toolbar is a flex container, allowing flex item properites to be used to lay out the children.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ToolbarClasses?

    /**
     * If `true`, disables gutter padding.
     * @default false
     */
    var disableGutters: Boolean?

    /**
     * The variant to use.
     * @default 'regular'
     */
    var variant: mui.system.Union? /* 'regular' | 'dense', ToolbarPropsVariantOverrides */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [App Bar](https://mui.com/components/app-bar/)
 *
 * API:
 *
 * - [Toolbar API](https://mui.com/api/toolbar/)
 */
@JsName("default")
external val Toolbar: react.FC<ToolbarProps>
