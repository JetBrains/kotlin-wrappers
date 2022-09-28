// Automatically generated - do not modify!

@file:JsModule("@mui/material/Stack")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface StackProps :
    react.dom.html.HTMLAttributes<dom.html.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Defines the `flex-direction` style property.
     * It is applied for all screen sizes.
     * @default 'column'
     */
    var direction: mui.system.ResponsiveStyleValue<StackDirection>?

    /**
     * Defines the space between immediate children.
     * @default 0
     */
    var spacing: mui.system.ResponsiveStyleValue<dynamic>?

    /**
     * Add an element between each child.
     */
    var divider: react.ReactNode?

    /**
     * The system prop, which allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Stack](https://mui.com/material-ui/react-stack/)
 *
 * API:
 *
 * - [Stack API](https://mui.com/material-ui/api/stack/)
 */
@JsName("default")
external val Stack: react.FC<StackProps>
