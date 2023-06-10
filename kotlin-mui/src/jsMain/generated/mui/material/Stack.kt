// Automatically generated - do not modify!

@file:JsModule("@mui/material/Stack")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface StackProps :
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
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
     * If `true`, the CSS flexbox `gap` is used instead of applying `margin` to children.
     *
     * While CSS `gap` removes the [known limitations](https://mui.com/joy-ui/react-stack#limitations),
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
 * - [Stack](https://mui.com/material-ui/react-stack/)
 *
 * API:
 *
 * - [Stack API](https://mui.com/material-ui/api/stack/)
 */
@JsName("default")
external val Stack: react.FC<StackProps>
