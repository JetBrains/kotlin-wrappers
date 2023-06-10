// Automatically generated - do not modify!

@file:JsModule("@mui/material/Dialog")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface DialogProps :
    mui.system.StandardProps,
    ModalProps,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The id(s) of the element(s) that describe the dialog.
     */
    // var `aria-describedby`: String?

    /**
     * The id(s) of the element(s) that label the dialog.
     */
    // var `aria-labelledby`: String?

    /**
     * Dialog children, usually the included sub-components.
     */
    /* override */ var children: react.ReactNode?

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
    var maxWidth: dynamic

    /**
     * Callback fired when the backdrop is clicked.
     * @deprecated Use the `onClose` prop with the `reason` argument to handle the `backdropClick` events.
     */
    override var onBackdropClick: react.dom.events.ReactEventHandler<*>?

    /**
     * Callback fired when the component requests to be closed.
     *
     * @param {object} event The event source of the callback.
     * @param {string} reason Can be: `"escapeKeyDown"`, `"backdropClick"`.
     */
    override var onClose: ((event: dynamic, reason: String) -> Unit)?

    /**
     * If `true`, the component is shown.
     */
    override var open: Boolean

    /**
     * The component used to render the body of the dialog.
     * @default Paper
     */
    var PaperComponent: react.ComponentType<PaperProps>?

    /**
     * Props applied to the [`Paper`](/material-ui/api/paper/) element.
     * @default {}
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
     * [Follow this guide](/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Fade
     */
    var TransitionComponent: react.ComponentType<*>?

    /**
     * The duration for the transition, in milliseconds.
     * You may specify a single timeout for all transitions, or individually with an object.
     * @default {
     *   enter: theme.transitions.duration.enteringScreen,
     *   exit: theme.transitions.duration.leavingScreen,
     * }
     */
    var transitionDuration: dynamic /* TransitionProps['timeout'] */

    /**
     * Props applied to the transition element.
     * By default, the element is based on this [`Transition`](http://reactcommunity.org/react-transition-group/transition/) component.
     */
    var TransitionProps: mui.material.transitions.TransitionProps?
}

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
external val Dialog: react.FC<DialogProps>
