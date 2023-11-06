// Automatically generated - do not modify!

@file:JsModule("@mui/material/Popover")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps
import web.dom.Element

external interface PopoverProps :
    mui.system.StandardProps,
    ModalProps,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * A ref for imperative actions.
     * It currently only supports updatePosition() action.
     */
    var action: react.Ref<PopoverActions>?

    /**
     * An HTML element, [PopoverVirtualElement](/material-ui/react-popover/#virtual-element),
     * or a function that returns either.
     * It's used to set the position of the popover.
     */
    var anchorEl: Element? /* null | Element | (() => Element) | PopoverVirtualElement | (() => PopoverVirtualElement) */

    /**
     * This is the point on the anchor where the popover's
     * `anchorEl` will attach to. This is not used when the
     * anchorReference is 'anchorPosition'.
     *
     * Options:
     * vertical: [top, center, bottom];
     * horizontal: [left, center, right].
     * @default {
     *   vertical: 'top',
     *   horizontal: 'left',
     * }
     */
    var anchorOrigin: PopoverOrigin?

    /**
     * This is the position that may be used to set the position of the popover.
     * The coordinates are relative to the application's client area.
     */
    var anchorPosition: PopoverPosition?

    /**
     * This determines which anchor prop to refer to when setting
     * the position of the popover.
     * @default 'anchorEl'
     */
    var anchorReference: PopoverReference?

    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: PopoverClasses?

    /**
     * An HTML element, component instance, or function that returns either.
     * The `container` will passed to the Modal component.
     *
     * By default, it uses the body of the anchorEl's top-level document object,
     * so it's simply `document.body` most of the time.
     */
    override var container: Element?

    /**
     * The elevation of the popover.
     * @default 8
     */
    var elevation: Number?

    /**
     * Specifies how close to the edge of the window the popover can appear.
     * If null, the popover will not be constrained by the window.
     * @default 16
     */
    var marginThreshold: Number?

    override var onClose: ((event: dynamic, reason: String) -> Unit)?

    /**
     * If `true`, the component is shown.
     */
    override var open: Boolean

    /**
     * Props applied to the [`Paper`](/material-ui/api/paper/) element.
     *
     * This prop is an alias for `slotProps.paper` and will be overriden by it if both are used.
     * @deprecated Use `slotProps.paper` instead.
     *
     * @default {}
     */
    var PaperProps: PaperProps?

    /**
     * The components used for each slot inside.
     *
     * @default {}
     */
    var slots: Slots?

    interface Slots {
        var root: react.ElementType<*>?
        var paper: react.ElementType<*>?
    }

    /**
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     *
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<typeof Modal, {}, ModalOwnerState> */
        var paper: react.Props? /* SlotComponentProps<typeof Paper, {}, {}> */
    }

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * This is the point on the popover which
     * will attach to the anchor's origin.
     *
     * Options:
     * vertical: [top, center, bottom, x(px)];
     * horizontal: [left, center, right, x(px)].
     * @default {
     *   vertical: 'top',
     *   horizontal: 'left',
     * }
     */
    var transformOrigin: PopoverOrigin?

    /**
     * The component used for the transition.
     * [Follow this guide](/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Grow
     */
    var TransitionComponent: react.ComponentType<*>?

    /**
     * Set to 'auto' to automatically calculate transition time based on height.
     * @default 'auto'
     */
    var transitionDuration: dynamic /* TransitionProps['timeout'] | 'auto' */

    /**
     * Props applied to the transition element.
     * By default, the element is based on this [`Transition`](http://reactcommunity.org/react-transition-group/transition/) component.
     * @default {}
     */
    var TransitionProps: mui.material.transitions.TransitionProps?
}

external interface PopoverOrigin {
    var vertical: mui.system.Union /* 'top' | 'center' | 'bottom' | number */

    var horizontal: mui.system.Union /* 'left' | 'center' | 'right' | number */
}

external interface PopoverPosition {
    var top: Number

    var left: Number
}

external interface PopoverActions {
    fun updatePosition()
}

/**
 *
 * Demos:
 *
 * - [Menu](https://mui.com/material-ui/react-menu/)
 * - [Popover](https://mui.com/material-ui/react-popover/)
 *
 * API:
 *
 * - [Popover API](https://mui.com/material-ui/api/popover/)
 * - inherits [Modal API](https://mui.com/material-ui/api/modal/)
 */
@JsName("default")
external val Popover: react.FC<PopoverProps>
