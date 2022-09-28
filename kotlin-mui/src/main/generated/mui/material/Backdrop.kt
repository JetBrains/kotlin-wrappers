// Automatically generated - do not modify!

@file:JsModule("@mui/material/Backdrop")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface BackdropProps :
    react.dom.html.HTMLAttributes<dom.html.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * The components used for each slot inside the Backdrop.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
    }

    /**
     * The props used for each slot inside the Backdrop.
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
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The duration for the transition, in milliseconds.
     * You may specify a single timeout for all transitions, or individually with an object.
     */
    var transitionDuration: dynamic /* TransitionProps['timeout'] */
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
