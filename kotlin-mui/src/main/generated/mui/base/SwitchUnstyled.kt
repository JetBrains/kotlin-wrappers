// Automatically generated - do not modify!

@file:JsModule("@mui/base/SwitchUnstyled")
@file:JsNonModule

package mui.base

import csstype.ClassName

external interface SwitchUnstyledProps :
    UseSwitchProps,
    react.PropsWithClassName {
    /**
     * Class name applied to the root element.
     */
    override var className: ClassName?

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
    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
        var Thumb: react.ElementType<*>?
        var Input: react.ElementType<*>?
        var Track: react.ElementType<*>? /* React.ElementType | null */
    }

    /**
     * The props used for each slot inside the Switch.
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var root: react.Props? /* React.HTMLAttributes<HTMLSpanElement> & SwitchUnstyledComponentsPropsOverrides */
        var thumb: react.Props? /* React.HTMLAttributes<HTMLSpanElement> & SwitchUnstyledComponentsPropsOverrides */
        var input: react.Props? /* React.InputHTMLAttributes<HTMLInputElement> & SwitchUnstyledComponentsPropsOverrides */
        var track: react.Props? /* React.HTMLAttributes<HTMLSpanElement> & SwitchUnstyledComponentsPropsOverrides */
    }
}

/**
 * The foundation for building custom-styled switches.
 *
 * Demos:
 *
 * - [Switch](https://mui.com/base/react-switch/)
 *
 * API:
 *
 * - [SwitchUnstyled API](https://mui.com/base/api/switch-unstyled/)
 */
@JsName("default")
external val SwitchUnstyled: react.FC<SwitchUnstyledProps>
