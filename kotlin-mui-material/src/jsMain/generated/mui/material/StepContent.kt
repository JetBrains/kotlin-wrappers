// Automatically generated - do not modify!

@file:JsModule("@mui/material/StepContent")

package mui.material

import mui.material.styles.Theme
import mui.material.transitions.TransitionProps
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.*
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement
import web.html.HTMLElement

external interface StepContentProps :
    StandardProps,
    HTMLAttributes<HTMLDivElement>,
    StepContentSlotsAndSlotProps,
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: StepContentClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The component used for the transition.
     * [Follow this guide](https://mui.com/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Collapse
     * @deprecated Use `slots.transition` instead. This prop will be removed in v7. [How to migrate](/material-ui/migration/migrating-from-deprecated-apis/).
     */
    var TransitionComponent: ComponentType<*>?

    /**
     * Adjust the duration of the content expand transition.
     * Passed as a prop to the transition component.
     *
     * Set to 'auto' to automatically calculate transition time based on height.
     * @default 'auto'
     */
    var transitionDuration: Any? /* TransitionProps['timeout'] | 'auto' */

    /**
     * Props applied to the transition element.
     * By default, the element is based on this [`Transition`](https://reactcommunity.org/react-transition-group/transition/) component.
     * @deprecated Use `slotProps.transition` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var TransitionProps: TransitionProps?
}

external interface StepContentSlots {
    /**
     * The component that renders the transition slot.
     * [Follow this guide](https://mui.com/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Collapse
     */
    var transition: ComponentType<*>?
}

external interface StepContentSlotProps : Props {
    /** TS: SlotComponentProps<React.ElementType, CollapseProps, StepContentOwnerState> */
    var transition: HTMLAttributes<HTMLElement>?
}

external interface StepContentSlotsAndSlotProps : Props {
    var slots: StepContentSlots?

    var slotProps: StepContentSlotProps?
}

external interface StepContentOwnerState

/**
 *
 * Demos:
 *
 * - [Stepper](https://v6.mui.com/material-ui/react-stepper/)
 *
 * API:
 *
 * - [StepContent API](https://v6.mui.com/material-ui/api/step-content/)
 */
@JsName("default")
external val StepContent: FC<StepContentProps>
