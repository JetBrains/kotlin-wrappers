// Automatically generated - do not modify!

@file:JsModule("@mui/material/Accordion")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.material.transitions.TransitionProps
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.*
import react.dom.events.SyntheticEvent
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface AccordionProps :
    HTMLAttributes<HTMLDivElement>,
    PropsWithChildren,
    PropsWithSx,
    PropsWithComponent,
    PaperProps {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: AccordionClasses?

    /**
     * If `true`, expands the accordion by default.
     * @default false
     */
    var defaultExpanded: Boolean?

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, it removes the margin between two expanded accordion items and the increase of height.
     * @default false
     */
    var disableGutters: Boolean?

    /**
     * If `true`, expands the accordion, otherwise collapse it.
     * Setting this prop enables control over the accordion.
     */
    var expanded: Boolean?

    /**
     * Callback fired when the expand/collapse state is changed.
     *
     * @param {React.SyntheticEvent} event The event source of the callback. **Warning**: This is a generic event not a change event.
     * @param {boolean} expanded The `expanded` state of the accordion.
     */
    var onChange: ((event: SyntheticEvent<*, *>, expanded: Boolean) -> Unit)?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The component used for the transition.
     * [Follow this guide](https://mui.com/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @deprecated Use `slots.transition` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var TransitionComponent: ComponentType<*>?

    /**
     * Props applied to the transition element.
     * By default, the element is based on this [`Transition`](https://reactcommunity.org/react-transition-group/transition/) component.
     * @deprecated Use `slotProps.transition` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var TransitionProps: TransitionProps?
}

external interface AccordionSlots {
    /**
     * The component that renders the root.
     * @default Paper
     */
    var root: ElementType<*>

    /**
     * The component that renders the heading.
     * @default 'h3'
     */
    var heading: ElementType<*>

    /**
     * The component that renders the transition.
     * [Follow this guide](https://mui.com/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Collapse
     */
    var transition: ElementType<*>
}

external interface AccordionSlotProps : Props {
    /** TS: SlotProps< React.ElementType<PaperProps>, AccordionRootSlotPropsOverrides, AccordionOwnerState > */
    var root: PaperProps?

    /** TS: SlotProps<'h3', AccordionHeadingSlotPropsOverrides, AccordionOwnerState> */
    var heading: Any?

    /** TS: SlotComponentProps< React.ElementType, TransitionProps & AccordionTransitionSlotPropsOverrides, AccordionOwnerState > */
    var transition: TransitionProps?
}

external interface AccordionSlotsAndSlotProps : Props {
    var slots: AccordionSlots?

    var slotProps: AccordionSlotProps?
}

/**
 *
 * Demos:
 *
 * - [Accordion](https://v6.mui.com/material-ui/react-accordion/)
 *
 * API:
 *
 * - [Accordion API](https://v6.mui.com/material-ui/api/accordion/)
 * - inherits [Paper API](https://v6.mui.com/material-ui/api/paper/)
 */
@JsName("default")
external val Accordion: FC<AccordionProps>
