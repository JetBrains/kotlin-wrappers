// Automatically generated - do not modify!

@file:JsModule("@mui/material/Box")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface BoxProps :
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
    override var children: react.ReactNode?

    /**
     * The component used for the root node.
     * Either a string to use a HTML element or a component.
     */
    override var component: react.ElementType<*>?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Box](https://mui.com/material-ui/react-box/)
 *
 * API:
 *
 * - [Box API](https://mui.com/material-ui/api/box/)
 */
@JsName("default")
external val Box: react.FC<BoxProps>
