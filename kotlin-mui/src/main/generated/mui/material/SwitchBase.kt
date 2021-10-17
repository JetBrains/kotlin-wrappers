// Automatically generated - do not modify!

@file:JsModule("@mui/material/SwitchBase")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

external interface SwitchBaseProps :
    mui.system.StandardProps,
    ButtonBaseProps {
    var autoFocus: Boolean

    /**
     * If `true`, the component is checked.
     */
    var checked: Boolean

    var checkedIcon: react.ReactNode

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SwitchBaseClasses

    /**
     * The default checked state. Use when the component is not controlled.
     */
    var defaultChecked: Boolean

    var disabled: Boolean

    /**
     * If `true`, the ripple effect is disabled.
     */
    var disableRipple: Boolean

    /**
     * If `true`, the  keyboard focus ripple is disabled.
     * @default false
     */
    var disableFocusRipple: Boolean

    /**
     * If given, uses a negative margin to counteract the padding on one
     * side (this is often helpful for aligning the left or right
     * side of the icon with content above or below, without ruining the border
     * size and shape).
     * @default false
     */
    var edge: mui.system.Union /* 'start' | 'end' | false */

    var icon: react.ReactNode

    /**
     * The id of the `input` element.
     */
    var id: String

    /**
     * [Attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Attributes) applied to the `input` element.
     */
    var inputProps: dynamic

    /**
     * Pass a ref to the `input` element.
     */
    var inputRef: react.Ref<*>

    /**
     * Name attribute of the `input` element.
     */
    var name: String

    /**
     * Callback fired when the state is changed.
     *
     * @param {React.ChangeEvent<HTMLInputElement>} event The event source of the callback.
     * You can pull out the new value by accessing `event.target.value` (string).
     * You can pull out the new checked state by accessing `event.target.checked` (boolean).
     */
    var onChange: dynamic

    var readOnly: Boolean

    /**
     * If `true`, the `input` element is required.
     */
    var required: Boolean

    var tabIndex: Number

    var type: react.dom.html.InputType

    /**
     * The value of the component. The DOM API casts this to a string.
     */
    var value: dynamic
}


@JsName("default")
external val SwitchBase: react.FC<SwitchBaseProps>
