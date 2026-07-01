// Automatically generated - do not modify!

@file:JsModule("@mui/material/Popover")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
)

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import mui.system.Union
import react.*
import web.dom.Element

external interface PopoverProps :
    StandardProps,
    ModalProps,
    PropsWithChildren,
    PropsWithSx {
    /**
     * A ref for imperative actions.
     * It currently only supports updatePosition() action.
     */
    var action: Ref<PopoverActions>?

    /**
     * An HTML element, [PopoverVirtualElement](https://mui.com/material-ui/react-popover/#virtual-element),
     * or a function that returns either.
     * It's used to set the position of the popover.
     */
    var anchorEl: Any? /* null | Element | PopoverVirtualElement | (() => Element | PopoverVirtualElement | null) */

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
    override var children: ReactNode?

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
    var elevation: Int?

    /**
     * Specifies how close to the edge of the window the popover can appear.
     * If null, the popover will not be constrained by the window.
     * @default 16
     */
    var marginThreshold: Number?

    override var onClose: ((event: Any, reason: String) -> Unit)?

    /**
     * If `true`, the component is shown.
     */
    override var open: Boolean

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
     * Set to 'auto' to automatically calculate transition time based on height.
     * @default 'auto'
     */
    var transitionDuration: Any? /* TransitionProps['timeout'] | 'auto' */
}

external interface PopoverSlots {
    /**
     * The component used for the root slot.
     * @default Modal
     */
    var root: ElementType<*>

    /**
     * The component used for the paper slot.
     * @default Paper
     */
    var paper: ElementType<*>

    /**
     * The component used for the transition slot.
     * @default Grow
     */
    var transition: ElementType<*>

    /**
     * The component used for the backdrop slot.
     * @default Backdrop
     */
    var backdrop: ElementType<*>
}

external interface PopoverSlotProps : Props {
    /** TS: SlotProps<React.ElementType<ModalProps>, PopoverRootSlotPropsOverrides, PopoverOwnerState> */
    var root: ModalProps?

    /** TS: SlotProps<React.ElementType<PaperProps>, PopoverPaperSlotPropsOverrides, PopoverOwnerState> */
    var paper: PaperProps?

    /** TS: SlotComponentProps< // use SlotComponentProps because transition slot does not support `component` and `sx` prop React.ElementType<TransitionProps>, TransitionProps & PopoverTransitionSlotPropsOverrides, PopoverOwnerState> */
    var transition: Any?

    /** TS: SlotProps<React.ElementType<BackdropProps>, PopoverBackdropSlotPropsOverrides, PopoverOwnerState> */
    var backdrop: BackdropProps?
}

external interface PopoverSlotsAndSlotProps : Props {
    var slots: PopoverSlots?

    var slotProps: PopoverSlotProps?
}

external interface PopoverOrigin {
    var vertical: Union /* 'top' | 'center' | 'bottom' | number */

    var horizontal: Union /* 'left' | 'center' | 'right' | number */
}

external interface PopoverPosition {
    var top: Number

    var left: Number
}

external interface PopoverOwnerState

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
external val Popover: FC<PopoverProps>
