// Automatically generated - do not modify!

@file:JsModule("@mui/material/Drawer")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface DrawerProps :
    mui.system.StandardProps,
    ModalProps,
    react.PropsWithChildren {
    /**
     * Side from which the drawer will appear.
     * @default 'left'
     */
    var anchor: DrawerAnchor?

    /**
     * The content of the component.
     */
    /* override */ var children: react.ReactNode?

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
     * Props applied to the [`Modal`](/api/modal/) element.
     * @default {}
     */
    var ModalProps: ModalProps?

    /**
     * Callback fired when the component requests to be closed.
     *
     * @param {object} event The event source of the callback.
     */
    override var onClose: ((event: dynamic, reason: String) -> Unit)?

    /**
     * If `true`, the component is shown.
     * @default false
     */
    var open: Boolean?

    /**
     * Props applied to the [`Paper`](/api/paper/) element.
     * @default {}
     */
    var PaperProps: PaperProps?

    /**
     * Props applied to the [`Slide`](/api/slide/) element.
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
    var transitionDuration: dynamic /* TransitionProps['timeout'] */

    /**
     * The variant to use.
     * @default 'temporary'
     */
    var variant: DrawerVariant?
}

/**
 * The props of the [Modal](https://mui.com/api/modal/) component are available
 * when `variant="temporary"` is set.
 *
 * Demos:
 *
 * - [Drawers](https://mui.com/components/drawers/)
 *
 * API:
 *
 * - [Drawer API](https://mui.com/api/drawer/)
 */
@JsName("default")
external val Drawer: react.FC<DrawerProps>
