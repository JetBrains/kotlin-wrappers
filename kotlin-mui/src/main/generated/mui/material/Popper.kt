// Automatically generated - do not modify!

@file:JsModule("@mui/material/Popper")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

external interface PopperProps : react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement> {
    var ref: react.Ref<org.w3c.dom.HTMLDivElement>

    /**
     * An HTML element, [virtualElement](https://popper.js.org/docs/v2/virtual-elements/),
     * or a function that returns either.
     * It's used to set the position of the popper.
     * The return value will passed as the reference object of the Popper instance.
     */
    var anchorEl: dynamic

    /**
     * Popper render function or node.
     */
    var children: dynamic

    /**
     * An HTML element or function that returns one.
     * The `container` will have the portal children appended to it.
     *
     * By default, it uses the body of the top-level document object,
     * so it's simply `document.body` most of the time.
     */
    var container: dynamic /* PortalProps['container'] */

    /**
     * The `children` will be under the DOM hierarchy of the parent component.
     * @default false
     */
    var disablePortal: dynamic /* PortalProps['disablePortal'] */

    /**
     * Always keep the children in the DOM.
     * This prop can be useful in SEO situation or
     * when you want to maximize the responsiveness of the Popper.
     * @default false
     */
    var keepMounted: Boolean

    /**
     * Popper.js is based on a "plugin-like" architecture,
     * most of its features are fully encapsulated "modifiers".
     *
     * A modifier is a function that is called each time Popper.js needs to
     * compute the position of the popper.
     * For this reason, modifiers should be very performant to avoid bottlenecks.
     * To learn how to create a modifier, [read the modifiers documentation](https://popper.js.org/docs/v2/modifiers/).
     */
    var modifiers: dynamic /* Options['modifiers'] */

    /**
     * If `true`, the component is shown.
     */
    var open: Boolean

    /**
     * Popper placement.
     * @default 'bottom'
     */
    var placement: dynamic

    /**
     * Options provided to the [`Popper.js`](https://popper.js.org/docs/v2/constructors/#options) instance.
     * @default {}
     */
    var popperOptions: dynamic

    /**
     * A ref that points to the used popper instance.
     */
    var popperRef: react.Ref<dynamic>

    /**
     * Help supporting a react-transition-group/Transition component.
     * @default false
     */
    var transition: Boolean
}

/**
 * Poppers rely on the 3rd party library [Popper.js](https://popper.js.org/docs/v2/) for positioning.
 *
 * Demos:
 *
 * - [Autocomplete](https://mui.com/components/autocomplete/)
 * - [Menus](https://mui.com/components/menus/)
 * - [Popper](https://mui.com/components/popper/)
 *
 * API:
 *
 * - [Popper API](https://mui.com/api/popper/)
 */
@JsName("default")
external val Popper: react.FC<PopperProps>
