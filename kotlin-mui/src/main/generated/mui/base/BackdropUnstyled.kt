// Automatically generated - do not modify!

@file:JsModule("@mui/base/BackdropUnstyled")
@file:JsNonModule

package mui.base

external interface BackdropUnstyledProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren,
    mui.types.PropsWithComponent {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * The components used for each slot inside the Backdrop.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: dynamic

    /**
     * The props used for each slot inside the Backdrop.
     * @default {}
     */
    var componentsProps: dynamic

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: BackdropUnstyledClasses?

    /**
     * If `true`, the backdrop is invisible.
     * It can be used when rendering a popover or a custom select component.
     * @default false
     */
    var invisible: Boolean?
}

/**
 *
 * Demos:
 *
 * - [Backdrop](https://mui.com/components/backdrop/)
 *
 * API:
 *
 * - [BackdropUnstyled API](https://mui.com/api/backdrop-unstyled/)
 */
@JsName("default")
external val BackdropUnstyled: react.FC<BackdropUnstyledProps>
