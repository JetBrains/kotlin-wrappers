// Automatically generated - do not modify!

@file:JsModule("@mui/material/Modal")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.base.ModalClasses
import mui.material.styles.Theme
import mui.system.SxProps
import web.cssom.ClassName
import web.dom.Element

external interface ModalProps :
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    react.PropsWithChildren,
    react.PropsWithClassName,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent,
    mui.base.ModalProps {
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
     * A single child content element.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ModalClasses?

    /**
     * @ignore
     */
    override var className: ClassName?

    /**
     * When set to true the Modal waits until a nested Transition is completed before closing.
     * @default false
     */
    var closeAfterTransition: Boolean?

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
     * An HTML element or function that returns one.
     * The `container` will have the portal children appended to it.
     *
     * By default, it uses the body of the top-level document object,
     * so it's simply `document.body` most of the time.
     */
    var container: Element?

    /**
     * If `true`, the modal will not automatically shift focus to itself when it opens, and
     * replace it to the last focused element when it closes.
     * This also works correctly with any modal children that have the `disableAutoFocus` prop.
     *
     * Generally this should never be set to `true` as it makes the modal less
     * accessible to assistive technologies, like screen readers.
     * @default false
     */
    var disableAutoFocus: Boolean?

    /**
     * If `true`, the modal will not prevent focus from leaving the modal while open.
     *
     * Generally this should never be set to `true` as it makes the modal less
     * accessible to assistive technologies, like screen readers.
     * @default false
     */
    var disableEnforceFocus: Boolean?

    /**
     * If `true`, hitting escape will not fire the `onClose` callback.
     * @default false
     */
    var disableEscapeKeyDown: Boolean?

    /**
     * The `children` will be under the DOM hierarchy of the parent component.
     * @default false
     */
    var disablePortal: Boolean?

    /**
     * If `true`, the modal will not restore focus to previously focused element once
     * modal is hidden or unmounted.
     * @default false
     */
    var disableRestoreFocus: Boolean?

    /**
     * Disable the scroll lock behavior.
     * @default false
     */
    var disableScrollLock: Boolean?

    /**
     * If `true`, the backdrop is not rendered.
     * @default false
     */
    var hideBackdrop: Boolean?

    /**
     * Always keep the children in the DOM.
     * This prop can be useful in SEO situation or
     * when you want to maximize the responsiveness of the Modal.
     * @default false
     */
    var keepMounted: Boolean?

    /**
     * Callback fired when the backdrop is clicked.
     * @deprecated Use the `onClose` prop with the `reason` argument to handle the `backdropClick` events.
     */
    var onBackdropClick: react.dom.events.ReactEventHandler<*>?

    /**
     * Callback fired when the component requests to be closed.
     * The `reason` parameter can optionally be used to control the response to `onClose`.
     *
     * @param {object} event The event source of the callback.
     * @param {string} reason Can be: `"escapeKeyDown"`, `"backdropClick"`.
     */
    var onClose: ((event: Any?, reason: String) -> Unit)?

    /**
     * A function called when a transition enters.
     */
    var onTransitionEnter: (() -> Unit)?

    /**
     * A function called when a transition has exited.
     */
    var onTransitionExited: (() -> Unit)?

    /**
     * If `true`, the component is shown.
     */
    var open: Boolean

    /**
     * The components used for each slot inside the Modal.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: ModalSlots?

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

external interface ModalSlots {
    /**
     * The component that renders the root.
     * @default 'div'
     */
    var root: react.ElementType<*>?

    /**
     * The component that renders the backdrop.
     */
    var backdrop: react.ElementType<*>?
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
