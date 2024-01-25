// Automatically generated - do not modify!

@file:JsModule("@mui/base/CssTransition")

package mui.base

import web.cssom.ClassName

external interface CssTransitionProps :
    react.PropsWithChildren,
    react.PropsWithClassName {
    override var children: react.ReactNode?

    override var className: ClassName?

    /**
     * The name of the CSS class applied to the component when the transition
     * is requested to enter.
     */
    var enterClassName: ClassName?

    /**
     * The name of the CSS class applied to the component when the transition
     * is requested to exit.
     */
    var exitClassName: ClassName?

    /**
     * The name of the CSS property that is transitioned the longest (has the largest `transition-duration`) on exit.
     * This is used to determine when the transition has ended.
     * If not specified, the transition will be considered finished end when the first property is transitioned.
     * If all properties have the same `transition-duration` (or there is just one transitioned property), this can be omitted.
     */
    var lastTransitionedPropertyOnExit: String?
}

/**
 * A utility component that hooks up to the Base UI transitions API and
 * applies a CSS transition to its children when necessary.
 *
 * Demos:
 *
 * - [Transitions](https://mui.com/base-ui/react-transitions/)
 *
 * API:
 *
 * - [CssTransition API](https://mui.com/base-ui/react-transitions/components-api/#css-transition)
 */
external val CssTransition: react.FC<CssTransitionProps>
