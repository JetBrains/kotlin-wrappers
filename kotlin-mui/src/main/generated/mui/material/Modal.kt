// Automatically generated - do not modify!

@file:JsModule("@mui/material/Modal")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface ModalProps :
    mui.base.ModalUnstyledProps,
    mui.system.PropsWithSx {
    /**
     * A backdrop component. This prop enables custom backdrop rendering.
     * @default styled(Backdrop, {
     *   name: 'MuiModal',
     *   slot: 'Backdrop',
     *   overridesResolver: (props, styles) => {
     *     return styles.backdrop;
     *   },
     * })({
     *   zIndex: -1,
     * })
     */
    var BackdropComponent: react.ElementType<BackdropProps>?

    /**
     * Props applied to the [`Backdrop`](/api/backdrop/) element.
     */
    var BackdropProps: BackdropProps?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 * Modal is a lower-level construct that is leveraged by the following components:
 *
 * *   [Dialog](https://mui.com/api/dialog/)
 * *   [Drawer](https://mui.com/api/drawer/)
 * *   [Menu](https://mui.com/api/menu/)
 * *   [Popover](https://mui.com/api/popover/)
 *
 * If you are creating a modal dialog, you probably want to use the [Dialog](https://mui.com/api/dialog/) component
 * rather than directly using Modal.
 *
 * This component shares many concepts with [react-overlays](https://react-bootstrap.github.io/react-overlays/#modals).
 *
 * Demos:
 *
 * - [Modal](https://mui.com/components/modal/)
 *
 * API:
 *
 * - [Modal API](https://mui.com/api/modal/)
 */
@JsName("default")
external val Modal: react.FC<ModalProps>
