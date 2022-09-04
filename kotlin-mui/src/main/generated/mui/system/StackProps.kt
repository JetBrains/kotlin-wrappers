// Automatically generated - do not modify!

package mui.system

external interface StackProps :
    StackBaseProps

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
}

external interface StackOwnerState {
    var direction: dynamic /* StackProps['direction'] */

    var spacing: dynamic /* StackProps['spacing'] */
}
