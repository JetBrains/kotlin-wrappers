// Automatically generated - do not modify!

@file:JsModule("@mui/material/Modal")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.base.ModalUnstyledClasses
import mui.material.styles.Theme
import mui.system.SxProps
import web.cssom.ClassName

external interface ModalProps :
    react.PropsWithClassName,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent,
    mui.base.ModalUnstyledProps {
    /**
     * A backdrop component. This prop enables custom backdrop rendering.
     * @deprecated Use `slots.backdrop` instead. While this prop currently works, it will be removed in the next major version.
     * Use the `slots.backdrop` prop to make your application ready for the next version of Material UI.
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
     * Props applied to the [`Backdrop`](/material-ui/api/backdrop/) element.
     * @deprecated Use `slotProps.backdrop` instead.
     */
    var BackdropProps: BackdropProps?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ModalUnstyledClasses?

    /**
     * @ignore
     */
    override var className: ClassName?

    /**
     * The components used for each slot inside.
     *
     * This prop is an alias for the `slots` prop.
     * It's recommended to use the `slots` prop instead.
     *
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
        var Backdrop: react.ElementType<*>?
    }

    /**
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     *
     * This prop is an alias for the `slotProps` prop.
     * It's recommended to use the `slotProps` prop instead, as `componentsProps` will be deprecated in the future.
     *
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var root: react.Props? /* SlotComponentProps<'div', ModalComponentsPropsOverrides, ModalOwnerState> */
        var backdrop: react.Props? /* SlotComponentProps<
  typeof Backdrop,
  ModalComponentsPropsOverrides,
  ModalOwnerState
> */
    }

    /**
     * The props used for each slot inside the Modal.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'div', ModalComponentsPropsOverrides, ModalOwnerState> */
        var backdrop: react.Props? /* SlotComponentProps<
  typeof Backdrop,
  ModalComponentsPropsOverrides,
  ModalOwnerState
> */
    }

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface ModalOwnerState {
    var exited: Boolean
}

/**
 * Modal is a lower-level construct that is leveraged by the following components:
 *
 * *   [Dialog](https://mui.com/material-ui/api/dialog/)
 * *   [Drawer](https://mui.com/material-ui/api/drawer/)
 * *   [Menu](https://mui.com/material-ui/api/menu/)
 * *   [Popover](https://mui.com/material-ui/api/popover/)
 *
 * If you are creating a modal dialog, you probably want to use the [Dialog](https://mui.com/material-ui/api/dialog/) component
 * rather than directly using Modal.
 *
 * This component shares many concepts with [react-overlays](https://react-bootstrap.github.io/react-overlays/#modals).
 *
 * Demos:
 *
 * - [Modal](https://mui.com/material-ui/react-modal/)
 *
 * API:
 *
 * - [Modal API](https://mui.com/material-ui/api/modal/)
 */
@JsName("default")
external val Modal: react.FC<ModalProps>
