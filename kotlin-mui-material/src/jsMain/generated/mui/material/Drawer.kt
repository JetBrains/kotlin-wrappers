// Automatically generated - do not modify!

@file:JsModule("@mui/material/Drawer")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.material.transitions.TransitionProps
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.*
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface DrawerProps :
    StandardProps,
    ModalProps,
    PropsWithChildren,
    PropsWithSx {
    /**
     * Side from which the drawer will appear.
     * @default 'left'
     */
    var anchor: DrawerAnchor?

    /**
     * The content of the component.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: DrawerClasses?

    /**
     * The elevation of the drawer.
     * @default 16
     */
    var elevation: Number?

    /**
     * Props applied to the [`Modal`](https://mui.com/material-ui/api/modal/) element.
     * @default {}
     */
    var ModalProps: ModalProps?

    /**
     * Callback fired when the component requests to be closed.
     * The `reason` parameter can optionally be used to control the response to `onClose`.
     *
     * @param {object} event The event source of the callback.
     * @param {string} reason Can be: `"escapeKeyDown"`, `"backdropClick"`.
     */
    override var onClose: ((event: Any, reason: String) -> Unit)?

    /**
     * If `true`, the component is shown.
     * @default false
     */
    var open: Boolean?

    /**
     * Props applied to the [`Paper`](https://mui.com/material-ui/api/paper/) element.
     * @deprecated use the `slotProps.paper` prop instead. This prop will be removed in v7. See [Migrating from deprecated APIs](https://mui.com/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     * @default {}
     */
    var PaperProps: PaperProps?

    /**
     * Props applied to the [`Slide`](https://mui.com/material-ui/api/slide/) element.
     * @deprecated use the `slotProps.transition` prop instead. This prop will be removed in v7. See [Migrating from deprecated APIs](https://mui.com/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var SlideProps: SlideProps?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The duration for the transition, in milliseconds.
     * You may specify a single timeout for all transitions, or individually with an object.
     * @default {
     *   enter: theme.transitions.duration.enteringScreen,
     *   exit: theme.transitions.duration.leavingScreen,
     * }
     */
    var transitionDuration: Any? /* TransitionProps['timeout'] */

    /**
     * The variant to use.
     * @default 'temporary'
     */
    var variant: DrawerVariant?
}

external interface DrawerSlots {
    /**
     * The component used for the root when the variant is `temporary`.
     * @default Modal
     */
    var root: ElementType<*>

    /**
     * The component used for the Modal backdrop.
     * @default Backdrop
     */
    var backdrop: ElementType<*>

    /**
     * The component used for the root element when the variant is `permanent` or `persistent`.
     * @default div
     */
    var docked: ElementType<*>

    /**
     * The component used for the paper.
     * @default Paper
     */
    var paper: ElementType<*>

    /**
     * The component used for the transition.
     * [Follow this guide](https://mui.com/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Slide
     */
    var transition: ElementType<*>
}

external interface DrawerSlotProps : Props {
    /** TS: SlotProps<React.ElementType<ModalProps>, DrawerRootSlotPropsOverrides, DrawerOwnerState> */
    var root: ModalProps?

    /** TS: SlotProps< React.ElementType<BackdropProps>, DrawerBackdropSlotPropsOverrides, DrawerOwnerState > */
    var backdrop: BackdropProps?

    /** TS: SlotProps<'div', DrawerDockedSlotPropsOverrides, DrawerOwnerState> */
    var docked: HTMLAttributes<HTMLDivElement>?

    /** TS: SlotProps< React.ElementType<PaperProps>, DrawerPaperSlotPropsOverrides, DrawerOwnerState > */
    var paper: PaperProps?

    /** TS: SlotProps< React.ElementType, TransitionProps & DrawerTransitionSlotPropsOverrides, DrawerOwnerState > */
    var transition: TransitionProps?
}

external interface DrawerSlotsAndSlotProps : Props {
    var slots: DrawerSlots?

    var slotProps: DrawerSlotProps?
}

external interface DrawerOwnerState

/**
 * The props of the [Modal](https://v6.mui.com/material-ui/api/modal/) component are available
 * when `variant="temporary"` is set.
 *
 * Demos:
 *
 * - [Drawer](https://v6.mui.com/material-ui/react-drawer/)
 *
 * API:
 *
 * - [Drawer API](https://v6.mui.com/material-ui/api/drawer/)
 */
@JsName("default")
external val Drawer: FC<DrawerProps>
