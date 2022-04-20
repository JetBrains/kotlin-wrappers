// Automatically generated - do not modify!

@file:JsModule("@mui/base/ModalUnstyled")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.base

external interface ModalUnstyledProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    mui.types.PropsWithComponent {
    /**
     * A backdrop component. This prop enables custom backdrop rendering.
     */
    var BackdropComponent: react.ElementType<*>?

    /**
     * Props applied to the backdrop element.
     */
    var BackdropProps: react.Props? /* React.ComponentPropsWithRef<'div'> */

    /**
     * A single child content element.
     */
    var children: react.ReactElement<*>

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ModalUnstyledClasses?

    /**
     * When set to true the Modal waits until a nested Transition is completed before closing.
     * @default false
     */
    var closeAfterTransition: Boolean?

    /**
     * The components used for each slot inside the Modal.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
    }

    /**
     * The props used for each slot inside the Modal.
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var root: react.Props? /* React.HTMLAttributes<HTMLDivElement> & ModalUnstyledComponentsPropsOverrides */
    }

    /**
     * An HTML element or function that returns one.
     * The `container` will have the portal children appended to it.
     *
     * By default, it uses the body of the top-level document object,
     * so it's simply `document.body` most of the time.
     */
    var container: org.w3c.dom.Element?

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
    var onClose: ((event: dynamic, reason: String) -> Unit)?

    /**
     * If `true`, the component is shown.
     */
    var open: Boolean
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
 * - [Modal](https://mui.com/base/react-modal/)
 *
 * API:
 *
 * - [ModalUnstyled API](https://mui.com/base/api/modal-unstyled/)
 */
@JsName("default")
external val ModalUnstyled: react.FC<ModalUnstyledProps>
