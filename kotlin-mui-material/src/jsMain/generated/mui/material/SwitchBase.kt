// Automatically generated - do not modify!

@file:JsModule("@mui/material/internal/SwitchBase")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import web.dom.ElementId
import web.html.InputType

external interface SwitchBaseProps :
    mui.system.StandardProps,
    ButtonBaseProps {
    var autoFocus: Boolean?

    /**
     * If `true`, the component is checked.
     */
    var checked: Boolean?

    var checkedIcon: react.ReactNode

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SwitchBaseClasses?

    /**
     * The default checked state. Use when the component is not controlled.
     */
    var defaultChecked: Boolean?

    /**
     * If `true`, the component is disabled.
     */
    var disabled: Boolean?

    /**
     * If `true`, the ripple effect is disabled.
     * @default false
     */
    var disableRipple: Boolean?

    /**
     * If `true`, the  keyboard focus ripple is disabled.
     * @default false
     */
    var disableFocusRipple: Boolean?

    /**
     * If given, uses a negative margin to counteract the padding on one
     * side (this is often helpful for aligning the left or right
     * side of the icon with content above or below, without ruining the border
     * size and shape).
     * @default false
     */
    var edge: SwitchBaseEdge?

    var icon: react.ReactNode

    /**
     * The id of the `input` element.
     */
    var id: ElementId?

    /**
     * [Attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Attributes) applied to the `input` element.
     */
    var inputProps: react.dom.html.InputHTMLAttributes<web.html.HTMLInputElement>?

    /**
     * Pass a ref to the `input` element.
     */
    var inputRef: react.Ref<*>?

    /**
     * Name attribute of the `input` element.
     */
    var name: String?

    /**
     * Callback fired when the state is changed.
     *
     * @param {React.ChangeEvent<HTMLInputElement>} event The event source of the callback.
     * You can pull out the new value by accessing `event.target.value` (string).
     * You can pull out the new checked state by accessing `event.target.checked` (boolean).
     */
    var onChange: ((event: react.dom.events.ChangeEvent<web.html.HTMLInputElement>, checked: Boolean) -> Unit)?

    var readOnly: Boolean?

    /**
     * If `true`, the `input` element is required.
     * @default false
     */
    var required: Boolean?

    var tabIndex: Int?

    var type: InputType?

    /**
     * The value of the component. The DOM API casts this to a string.
     */
    var value: Any?
}


@JsName("default")
external val SwitchBase: react.FC<SwitchBaseProps>
