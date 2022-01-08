// Automatically generated - do not modify!

@file:JsModule("@mui/material/Stack")
@file:JsNonModule

package mui.material

external interface StackProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren,
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
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [Stack](https://mui.com/components/stack/)
 *
 * API:
 *
 * - [Stack API](https://mui.com/api/stack/)
 */
@JsName("default")
external val Stack: react.FC<StackProps>
