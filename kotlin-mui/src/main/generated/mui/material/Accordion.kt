// Automatically generated - do not modify!

@file:JsModule("@mui/material/Accordion")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import kotlinext.js.ReadonlyArray

external interface AccordionProps :
    mui.system.StandardProps,
    PaperProps,
    react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: ReadonlyArray<react.ReactNode>?

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
    var onChange: ((event: react.dom.events.SyntheticEvent<*, *>, expanded: Boolean) -> Unit)?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?

    /**
     * The component used for the transition.
     * [Follow this guide](/components/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Collapse
     */
    var TransitionComponent: react.ComponentType<*>?

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
 * - [Accordion](https://mui.com/components/accordion/)
 *
 * API:
 *
 * - [Accordion API](https://mui.com/api/accordion/)
 * - inherits [Paper API](https://mui.com/api/paper/)
 */
@JsName("default")
external val Accordion: react.FC<AccordionProps>
