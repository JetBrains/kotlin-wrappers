// Automatically generated - do not modify!

@file:JsModule("@mui/material/Backdrop")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface BackdropProps :
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * The components used for each slot inside.
     *
     * This prop is an alias for the `slots` prop.
     * It's recommended to use the `slots` prop instead.
     *
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
    }

    /**
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     *
     * This prop is an alias for the `slotProps` prop.
     * It's recommended to use the `slotProps` prop instead, as `componentsProps` will be deprecated in the future.
     *
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var root: react.Props? /* React.HTMLAttributes<HTMLDivElement> & BackdropComponentsPropsOverrides */
    }

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: BackdropClasses?

    /**
     * If `true`, the backdrop is invisible.
     * It can be used when rendering a popover or a custom select component.
     * @default false
     */
    var invisible: Boolean?

    /**
     * If `true`, the component is shown.
     */
    var open: Boolean

    /**
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     *
     * This prop is an alias for the `componentsProps` prop, which will be deprecated in the future.
     *
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* React.HTMLAttributes<HTMLDivElement> & BackdropComponentsPropsOverrides */
    }

    /**
     * The components used for each slot inside.
     *
     * This prop is an alias for the `components` prop, which will be deprecated in the future.
     *
     * @default {}
     */
    var slots: Slots?

    interface Slots {
        var root: react.ElementType<*>?
    }

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The duration for the transition, in milliseconds.
     * You may specify a single timeout for all transitions, or individually with an object.
     */
    var transitionDuration: dynamic /* TransitionProps['timeout'] */

    /**
     * The component used for the transition.
     * [Follow this guide](/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Fade
     */
    var TransitionComponent: react.ComponentType<*>?
}

/**
 *
 * Demos:
 *
 * - [Backdrop](https://mui.com/material-ui/react-backdrop/)
 *
 * API:
 *
 * - [Backdrop API](https://mui.com/material-ui/api/backdrop/)
 * - inherits [Fade API](https://mui.com/material-ui/api/fade/)
 */
@JsName("default")
external val Backdrop: react.FC<BackdropProps>
