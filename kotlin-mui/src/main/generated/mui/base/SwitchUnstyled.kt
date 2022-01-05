// Automatically generated - do not modify!

@file:JsModule("@mui/base/SwitchUnstyled")
@file:JsNonModule

package mui.base

external interface SwitchUnstyledProps : react.Props {
    /**
     * Class name applied to the root element.
     */
    var className: String?

    /**
     * The component used for the Root slot.
     * Either a string to use a HTML element or a component.
     * This is equivalent to `components.Root`. If both are provided, the `component` is used.
     */
    var component: react.ElementType<*>?

    /**
     * The components used for each slot inside the Switch.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: dynamic

    /**
     * The props used for each slot inside the Switch.
     * @default {}
     */
    var componentsProps: dynamic
}

/**
 * The foundation for building custom-styled switches.
 *
 * Demos:
 *
 * - [Switches](https://mui.com/components/switches/)
 *
 * API:
 *
 * - [SwitchUnstyled API](https://mui.com/api/switch-unstyled/)
 */
@JsName("default")
external val SwitchUnstyled: react.FC<SwitchUnstyledProps>
