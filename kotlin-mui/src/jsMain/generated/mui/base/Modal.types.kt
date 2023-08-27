// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName
import web.dom.Element

external interface ModalProps :
    ModalOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>

external interface ModalOwnProps : react.Props {
    /**
     * A single child content element.
     */
    var children: react.ReactNode?

    /**
     * When set to true the Modal waits until a nested Transition is completed before closing.
     * @default false
     */
    var closeAfterTransition: Boolean?

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
    var onClose: dynamic /* {
    bivarianceHack(event: {}, reason: 'backdropClick' | 'escapeKeyDown'): void;
}['bivarianceHack'] */

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
     * The props used for each slot inside the Modal.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'div', ModalRootSlotPropsOverrides, ModalOwnerState> */
        var backdrop: react.Props? /* SlotComponentProps<'div', ModalBackdropSlotPropsOverrides, ModalOwnerState> */
    }

    /**
     * The components used for each slot inside the Modal.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: ModalSlots?
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

external interface ModalRootSlotProps :
    react.PropsWithChildren,
    react.PropsWithClassName {
    override var children: react.ReactNode?

    override var className: ClassName?

    var onKeyDown: dynamic

    var ownerState: dynamic

    var role: react.dom.aria.AriaRole
}

external interface ModalBackdropSlotProps : react.PropsWithChildren {
    // var `aria-hidden`: dynamic /* React.AriaAttributes['aria-hidden'] */

    override var children: react.ReactNode?

    var onClick: react.dom.events.MouseEventHandler<*>

    var open: Boolean

    var ownerState: dynamic
}
