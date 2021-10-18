// Automatically generated - do not modify!

@file:JsModule("@mui/material/StepContent")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import kotlinext.js.ReadonlyArray

external interface StepContentProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: StepContentClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?

    /**
     * The component used for the transition.
     * [Follow this guide](/components/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Collapse
     */
    var TransitionComponent: react.ComponentType<mui.material.transitions.TransitionProps>?

    /**
     * Adjust the duration of the content expand transition.
     * Passed as a prop to the transition component.
     *
     * Set to 'auto' to automatically calculate transition time based on height.
     * @default 'auto'
     */
    var transitionDuration: dynamic /* TransitionProps['timeout'] | 'auto' */

    /**
     * Props applied to the transition element.
     * By default, the element is based on this [`Transition`](https://reactcommunity.org/react-transition-group/transition) component.
     */
    var TransitionProps: mui.material.transitions.TransitionProps?
}

/**
 *
 * Demos:
 *
 * - [Steppers](https://mui.com/components/steppers/)
 *
 * API:
 *
 * - [StepContent API](https://mui.com/api/step-content/)
 */
@JsName("default")
external val StepContent: react.FC<StepContentProps>
