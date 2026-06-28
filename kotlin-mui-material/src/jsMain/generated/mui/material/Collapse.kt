// Automatically generated - do not modify!

@file:JsModule("@mui/material/Collapse")

package mui.material

import mui.material.styles.Theme
import mui.material.transitions.TransitionProps
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.*
import react.dom.html.HTMLAttributes
import web.cssom.ClassName
import web.html.HTMLDivElement

external interface CollapseProps :
    StandardProps,
    TransitionProps,
    CollapseSlotsAndSlotProps,
    PropsWithChildren,
    PropsWithClassName,
    PropsWithSx {
    /**
     * The content node to be collapsed.
     */
    override var children: ReactNode?

    override var className: ClassName?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: CollapseClasses?

    /**
     * The width (horizontal) or height (vertical) of the container when collapsed.
     * @default '0px'
     */
    var collapsedSize: Any? /* String or Number */

    /**
     * The component used for the root node.
     * Either a string to use a HTML element or a component.
     */
    var component: ElementType<TransitionProps>?

    /**
     * The transition timing function.
     * You may specify a single easing or a object containing enter and exit values.
     */
    var easing: Any? /* TransitionProps['easing'] */

    /**
     * If `true`, the component will transition in.
     */
    var `in`: Boolean?

    /**
     * The transition orientation.
     * @default 'vertical'
     */
    var orientation: Orientation?

    /**
     * The duration for the transition, in milliseconds.
     * You may specify a single timeout for all transitions, or individually with an object.
     *
     * Set to 'auto' to automatically calculate transition time based on height.
     * @default duration.standard
     */
    var timeout: Any? /* TransitionProps['timeout'] | 'auto' */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface CollapseSlots {
    /**
     * The component that renders the root.
     * @default 'div'
     */
    var root: ElementType<*>?

    /**
     * The component that renders the wrapper.
     * @default 'div'
     */
    var wrapper: ElementType<*>?

    /**
     * The component that renders the inner wrapper.
     * @default 'div'
     */
    var wrapperInner: ElementType<*>?
}

external interface CollapseSlotProps : Props {
    /** TS: SlotProps<'div', CollapseRootSlotPropsOverrides, CollapseOwnerState> */
    var root: HTMLAttributes<HTMLDivElement>?

    /** TS: SlotProps<'div', CollapseWrapperSlotPropsOverrides, CollapseOwnerState> */
    var wrapper: HTMLAttributes<HTMLDivElement>?

    /** TS: SlotProps<'div', CollapseWrapperInnerSlotPropsOverrides, CollapseOwnerState> */
    var wrapperInner: HTMLAttributes<HTMLDivElement>?
}

external interface CollapseSlotsAndSlotProps : Props {
    var slots: CollapseSlots?

    var slotProps: CollapseSlotProps?
}

external interface CollapseOwnerState : CollapseProps {
    var state: Any? /* TransitionStatus */
}

/**
 * The Collapse transition is used by the
 * [Vertical Stepper](https://v7.mui.com/material-ui/react-stepper/#vertical-stepper) StepContent component.
 * It uses [react-transition-group](https://github.com/reactjs/react-transition-group) internally.
 *
 * Demos:
 *
 * - [Card](https://v7.mui.com/material-ui/react-card/)
 * - [Lists](https://v7.mui.com/material-ui/react-list/)
 * - [Transitions](https://v7.mui.com/material-ui/transitions/)
 *
 * API:
 *
 * - [Collapse API](https://v7.mui.com/material-ui/api/collapse/)
 * - inherits [Transition API](https://reactcommunity.org/react-transition-group/transition/#Transition-props)
 */

@JsName("default")
external val Collapse: FC<CollapseProps>
