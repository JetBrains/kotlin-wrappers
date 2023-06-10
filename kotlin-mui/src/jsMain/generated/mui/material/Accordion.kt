// Automatically generated - do not modify!

@file:JsModule("@mui/material/Accordion")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface AccordionProps :
    mui.system.StandardProps,
    PaperProps,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

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
    override var sx: SxProps<Theme>?

    /**
     * The component used for the transition.
     * [Follow this guide](/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Collapse
     */
    var TransitionComponent: react.ComponentType<*>?

    /**
     * Props applied to the transition element.
     * By default, the element is based on this [`Transition`](http://reactcommunity.org/react-transition-group/transition/) component.
     */
    var TransitionProps: mui.material.transitions.TransitionProps?
}

/**
 *
 * Demos:
 *
 * - [Accordion](https://mui.com/material-ui/react-accordion/)
 *
 * API:
 *
 * - [Accordion API](https://mui.com/material-ui/api/accordion/)
 * - inherits [Paper API](https://mui.com/material-ui/api/paper/)
 */
@JsName("default")
external val Accordion: react.FC<AccordionProps>
