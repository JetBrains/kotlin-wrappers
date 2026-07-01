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
     * Adjust the duration of the content expand transition.
     * Passed as a prop to the transition component.
     *
     * Set to 'auto' to automatically calculate transition time based on height.
     * @default 'auto'
     */
    var transitionDuration: Any? /* TransitionProps['timeout'] | 'auto' */
}

external interface StepContentSlots {
    /**
     * The component that renders the transition slot.
     * [Follow this guide](/material-ui/transitions/#transition-slots) to learn more about the requirements for this component.
     * @default Collapse
     */
    var transition: ComponentType<TransitionProps>?
}

external interface StepContentSlotProps : Props {
    /** TS: SlotComponentProps<React.ElementType<CollapseProps>, CollapseProps, StepContentOwnerState> */
    var transition: CollapseProps?
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
 * - [Stepper](https://mui.com/material-ui/react-stepper/)
 *
 * API:
 *
 * - [StepContent API](https://mui.com/material-ui/api/step-content/)
 */
@JsName("default")
external val StepContent: FC<StepContentProps>
