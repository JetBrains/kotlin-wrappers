// Automatically generated - do not modify!

@file:JsModule("@mui/material/Dialog")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
)

package mui.material

import mui.material.styles.Theme
import mui.material.transitions.TransitionProps
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import mui.system.Union
import react.*
import react.dom.html.HTMLAttributes
import web.dom.ElementId
import web.html.HTMLDivElement

external interface DialogProps :
    StandardProps,
    ModalProps,
    PropsWithChildren,
    PropsWithSx {
    /**
     * The id(s) of the element(s) that describe the dialog.
     */
    @JsName("aria-describedby")
    var ariaDescribedBy: ElementId?

    /**
     * The id(s) of the element(s) that label the dialog.
     */
    @JsName("aria-labelledby")
    var ariaLabelledBy: ElementId?

    /**
     * Informs assistive technologies that the element is modal.
     * It's added on the element with role="dialog".
     * @default true
     */
    @JsName("aria-modal")
    var ariaModal: Boolean?

    /**
     * Dialog children, usually the included sub-components.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: DialogClasses?

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
     * The ARIA role for the dialog element.
     * The main dialog role is `dialog`, but `alertdialog` can be used if the content of the dialog requires immediate attention.
     * See https://www.w3.org/TR/wai-aria-1.2/#dialog and https://www.w3.org/TR/wai-aria-1.2/#alertdialog for more details.
     * @default 'dialog'
     */
    var role: Union? /* 'dialog' | 'alertdialog' */

    /**
     * The component used to render the body of the dialog.
     * @default Paper
     */
    var PaperComponent: ComponentType<PaperProps>?

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
     * The duration for the transition, in milliseconds.
     * You may specify a single timeout for all transitions, or individually with an object.
     * @default {
     *   enter: theme.transitions.duration.enteringScreen,
     *   exit: theme.transitions.duration.leavingScreen,
     * }
     */
    var transitionDuration: Any? /* TransitionProps['timeout'] */
}

external interface DialogSlots {
    /**
     * The component that renders the transition.
     * [Follow this guide](/material-ui/transitions/#transition-slots) to learn more about the requirements for this component.
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

    /** TS: SlotProps<React.ElementType<BackdropProps>, DialogBackdropSlotPropsOverrides, DialogOwnerState> */
    var backdrop: BackdropProps?

    /** TS: SlotProps<'div', DialogContainerSlotPropsOverrides, DialogOwnerState> */
    var container: HTMLAttributes<HTMLDivElement>?

    /** TS: SlotComponentProps<React.ElementType<TransitionProps>, TransitionProps & DialogTransitionSlotPropsOverrides, DialogOwnerState> */
    var transition: TransitionProps?

    /** TS: SlotProps<React.ElementType<PaperProps>, DialogPaperSlotPropsOverrides, DialogOwnerState> */
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
 * - [Dialog](https://mui.com/material-ui/react-dialog/)
 *
 * API:
 *
 * - [Dialog API](https://mui.com/material-ui/api/dialog/)
 * - inherits [Modal API](https://mui.com/material-ui/api/modal/)
 */
@JsName("default")
external val Dialog: FC<DialogProps>
