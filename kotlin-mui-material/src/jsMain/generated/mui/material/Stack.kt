// Automatically generated - do not modify!

@file:JsModule("@mui/material/Stack")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.ResponsiveStyleValue
import mui.system.SxProps
import mui.system.SystemProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface StackProps :
    StackOwnProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithComponent

external interface StackOwnProps :
    SystemProps<Theme>,
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

    /**
     * Defines the `flex-direction` style property.
     * It is applied for all screen sizes.
     * @default 'column'
     */
    var direction: ResponsiveStyleValue<StackDirection>?

    /**
     * Defines the space between immediate children.
     * @default 0
     */
    var spacing: ResponsiveStyleValue<Any /* number | string */>?

    /**
     * Add an element between each child.
     */
    var divider: ReactNode?

    /**
     * If `true`, the CSS flexbox `gap` is used instead of applying `margin` to children.
     *
     * While CSS `gap` removes the [known limitations](https://mui.com/joy-ui/react-stack/#limitations),
     * it is not fully supported in some browsers. We recommend checking https://caniuse.com/?search=flex%20gap before using this flag.
     *
     * To enable this flag globally, follow the [theme's default props](https://mui.com/material-ui/customization/theme-components/#default-props) configuration.
     * @default false
     */
    var useFlexGap: Boolean?

    /**
     * The system prop, which allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Stack](https://v6.mui.com/material-ui/react-stack/)
 *
 * API:
 *
 * - [Stack API](https://v6.mui.com/material-ui/api/stack/)
 */
@JsName("default")
external val Stack: FC<StackProps>
