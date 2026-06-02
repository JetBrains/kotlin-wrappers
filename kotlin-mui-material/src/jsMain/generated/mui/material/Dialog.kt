// Automatically generated - do not modify!

@file:JsModule("@mui/material/Dialog")

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
import react.dom.events.ReactEventHandler
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface DialogProps :
    StandardProps,
    ModalProps,
    PropsWithChildren,
    PropsWithSx {
    /**
     * The id(s) of the element(s) that describe the dialog.
     */
    // var `aria-describedby`: String?

    /**
     * The id(s) of the element(s) that label the dialog.
     */
    // var `aria-labelledby`: String?

    /**
     * Informs assistive technologies that the element is modal.
     * It's added on the element with role="dialog".
     * @default true
     */
    // var `aria-modal`: Any? /* boolean | 'true' | 'false' */

    /**
     * Dialog children, usually the included sub-components.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: DialogClasses?

    /**
     * If `true`, hitting escape will not fire the `onClose` callback.
     * @default false
     */
    override var disableEscapeKeyDown: Boolean?

    /**
     * If `true`, the dialog is full-screen.
     * @default false
     */
    var fullScreen: Boolean?

    /**
     * If `true`, the dialog stretches to `maxWidth`.
     *
     * Notice that the dialog width grow is limited by the default margin.
     * @default false
     */
    var fullWidth: Boolean?

    /**
     * Determine the max-width of the dialog.
     * The dialog width grows with the size of the screen.
     * Set to `false` to disable `maxWidth`.
     * @default 'sm'
     */
    var maxWidth: Any? /* Breakpoint | false */

    /**
     * Callback fired when the backdrop is clicked.
     * @deprecated Use the `onClose` prop with the `reason` argument to handle the `backdropClick` events.
     */
    override var onBackdropClick: ReactEventHandler<*>?

    /**
     * Callback fired when the component requests to be closed.
     *
     * @param {object} event The event source of the callback.
     * @param {string} reason Can be: `"escapeKeyDown"`, `"backdropClick"`.
     */
    override var onClose: ((event: Any, reason: String) -> Unit)?

    /**
     * If `true`, the component is shown.
     */
    override var open: Boolean

    /**
     * The component used to render the body of the dialog.
     * @default Paper
     */
    var PaperComponent: ComponentType<PaperProps>?

    /**
     * Props applied to the [`Paper`](https://mui.com/material-ui/api/paper/) element.
     * @default {}
     * @deprecated Use `slotProps.paper` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var PaperProps: PaperProps?

    /**
     * Determine the container for scrolling the dialog.
     * @default 'paper'
     */
    var scroll: DialogScroll?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The component used for the transition.
     * [Follow this guide](https://mui.com/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Fade
     * @deprecated Use `slots.transition` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var TransitionComponent: ComponentType<*>?

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
     * Props applied to the transition element.
     * By default, the element is based on this [`Transition`](https://reactcommunity.org/react-transition-group/transition/) component.
     * @deprecated Use `slotProps.transition` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var TransitionProps: TransitionProps?
}

external interface DialogSlots {
    /**
     * The component that renders the transition.
     * [Follow this guide](/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Collapse
     */
    var transition: ElementType<*>?

    /**
     * The component that renders the paper.
     * @default Paper
     */
    var paper: ElementType<*>?

    /**
     * The component that renders the container.
     */
    var container: ElementType<*>?

    /**
     * The component that renders the backdrop.
     */
    var backdrop: ElementType<*>?

    /**
     * The component that renders the root.
     */
    var root: ElementType<*>?
}

external interface DialogSlotProps : Props {
    /** TS: SlotProps<React.ElementType<ModalProps>, DialogRootSlotPropsOverrides, DialogOwnerState> */
    var root: ModalProps?

    /** TS: SlotProps< React.ElementType<BackdropProps>, DialogBackdropSlotPropsOverrides, DialogOwnerState > */
    var backdrop: BackdropProps?

    /** TS: SlotProps<'div', DialogContainerSlotPropsOverrides, DialogOwnerState> */
    var container: HTMLAttributes<HTMLDivElement>?

    /** TS: SlotComponentProps< React.ElementType, TransitionProps & DialogTransitionSlotPropsOverrides, DialogOwnerState > */
    var transition: TransitionProps?

    /** TS: SlotProps< React.ElementType<PaperProps>, DialogPaperSlotPropsOverrides, DialogOwnerState > */
    var paper: PaperProps?
}

external interface DialogSlotsAndSlotProps : Props {
    var slots: DialogSlots?

    var slotProps: DialogSlotProps?
}

external interface DialogOwnerState

/**
 * Dialogs are overlaid modal paper based components with a backdrop.
 *
 * Demos:
 *
 * - [Dialog](https://v6.mui.com/material-ui/react-dialog/)
 *
 * API:
 *
 * - [Dialog API](https://v6.mui.com/material-ui/api/dialog/)
 * - inherits [Modal API](https://v6.mui.com/material-ui/api/modal/)
 */
@JsName("default")
external val Dialog: FC<DialogProps>
