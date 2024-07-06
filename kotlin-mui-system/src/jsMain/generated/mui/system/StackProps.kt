// Automatically generated - do not modify!

package mui.system

external interface StackProps :
    StackBaseProps,
    PropsWithSx {
    /**
     * The system prop, which allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface StackBaseProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

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
    var spacing: ResponsiveStyleValue<dynamic>?

    /**
     * Add an element between each child.
     */
    var divider: react.ReactNode?

    /**
     * If `true`, the CSS flexbox `gap` is used instead of applying `margin` to children.
     *
     * While CSS `gap` removes the [known limitations](https://mui.com/joy-ui/react-stack/#limitations),
     * it is not fully supported in some browsers. We recommend checking https://caniuse.com/?search=flex%20gap before using this flag.
     *
     * To enable this flag globally, follow the theme's default props configuration.
     * @default false
     */
    var useFlexGap: Boolean?
}

external interface StackOwnerState {
    var direction: Any /* StackProps['direction'] */

    var spacing: Any /* StackProps['spacing'] */

    var useFlexGap: Boolean
}
