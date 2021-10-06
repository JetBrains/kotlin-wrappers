// Automatically generated - do not modify!

@file:JsModule("@mui/material/Collapse")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface CollapseProps : react.PropsWithChildren {
    /**
     * The content node to be collapsed.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    var className: String

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: CollapseClasses

    /**
     * The width (horizontal) or height (vertical) of the container when collapsed.
     * @default '0px'
     */
    var collapsedSize: dynamic

    /**
     * The component used for the root node.
     * Either a string to use a HTML element or a component.
     */
    var component: react.ElementType<mui.material.transitions.TransitionProps>

    /**
     * The transition timing function.
     * You may specify a single easing or a object containing enter and exit values.
     */
    var easing: dynamic /* TransitionProps['easing'] */

    /**
     * If `true`, the component will transition in.
     */
    var `in`: Boolean

    /**
     * The transition orientation.
     * @default 'vertical'
     */
    var orientation: mui.system.Union /* 'horizontal' | 'vertical' */

    /**
     * The duration for the transition, in milliseconds.
     * You may specify a single timeout for all transitions, or individually with an object.
     *
     * Set to 'auto' to automatically calculate transition time based on height.
     * @default duration.standard
     */
    var timeout: dynamic /* TransitionProps['timeout'] | 'auto' */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>
}

/**
 * The Collapse transition is used by the
 * [Vertical Stepper](https://mui.com/components/steppers/#vertical-stepper) StepContent component.
 * It uses [react-transition-group](https://github.com/reactjs/react-transition-group) internally.
 *
 * Demos:
 *
 * - [Cards](https://mui.com/components/cards/)
 * - [Lists](https://mui.com/components/lists/)
 * - [Transitions](https://mui.com/components/transitions/)
 *
 * API:
 *
 * - [Collapse API](https://mui.com/api/collapse/)
 * - inherits [Transition API](https://reactcommunity.org/react-transition-group/transition#Transition-props)
 */

@JsName("default")
external val Collapse: react.FC<CollapseProps>
