// Automatically generated - do not modify!

package mui.base

import react.Props
import react.Ref
import react.RefCallback
import react.StateSetter
import react.dom.aria.AriaRole
import react.dom.events.FocusEventHandler
import react.dom.events.MouseEventHandler
import web.dom.Element
import web.dom.TagName
import web.html.ButtonType
import web.html.HTMLElement

external interface UseButtonParameters {
    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, allows a disabled button to receive focus.
     * @default false
     */
    var focusableWhenDisabled: Boolean?

    var href: String?

    var onFocusVisible: FocusEventHandler<*>?

    var rootRef: Ref<Element>?

    var tabIndex: Int?

    var to: String?

    /**
     * Type attribute applied when the `component` is `button`.
     * @default 'button'
     */
    var type: ButtonType?

    /**
     * The HTML element, e.g.'button', 'a' etc
     * @default ''
     */
    var rootElementName: TagName<out HTMLElement>?
}

external interface UseButtonRootSlotOwnProps : Props {
    // var `aria-disabled`: Any? /* React.AriaAttributes['aria-disabled'] */

    var disabled: Boolean?

    var tabIndex: Int?

    var type: ButtonType?

    var role: AriaRole?

    var onBlur: FocusEventHandler<*>

    var onFocus: FocusEventHandler<*>

    var onKeyDown: Any? /* MuiCancellableEventHandler<React.KeyboardEvent> */

    var onKeyUp: Any? /* MuiCancellableEventHandler<React.KeyboardEvent> */

    var onMouseDown: MouseEventHandler<*>

    var onMouseLeave: MouseEventHandler<*>
}

external interface UseButtonReturnValue {
    /**
     * Resolver for the root slot's props.
     * @param externalProps additional props for the root slot
     * @returns props that should be spread on the root slot
     */
    var getRootProps: Props /* <ExternalProps extends Record<string, any> = {}>(externalProps?: ExternalProps) => UseButtonRootSlotProps<ExternalProps> */

    /**
     * If `true`, the component is being focused using keyboard.
     */
    var focusVisible: Boolean

    /**
     * Callback for setting the `focusVisible` param.
     */
    var setFocusVisible: StateSetter<Boolean>

    /**
     * If `true`, the component is active (pressed).
     */
    var active: Boolean

    /**
     * A ref to the component's root DOM element.
     */
    var rootRef: RefCallback<Element>?
}
