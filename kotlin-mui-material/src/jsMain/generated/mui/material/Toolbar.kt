// Automatically generated - do not modify!

@file:JsModule("@mui/material/Toolbar")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface ToolbarProps :
    ToolbarOwnProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithComponent

external interface ToolbarOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * The Toolbar children, usually a mixture of `IconButton`, `Button` and `Typography`.
     * The Toolbar is a flex container, allowing flex item properties to be used to lay out the children.
     */
    override var children: ReactNode?

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
    var variant: ToolbarVariant?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [App Bar](https://v6.mui.com/material-ui/react-app-bar/)
 *
 * API:
 *
 * - [Toolbar API](https://v6.mui.com/material-ui/api/toolbar/)
 */
@JsName("default")
external val Toolbar: FC<ToolbarProps>
