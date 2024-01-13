// Automatically generated - do not modify!

@file:JsModule("@mui/base/CssAnimation")

package mui.base

import web.cssom.ClassName

external interface CssAnimationProps :
    react.PropsWithChildren,
    react.PropsWithClassName {
    override var children: react.ReactNode?

    override var className: ClassName?

    /**
     * The name of the CSS animation (the `animation-name` CSS property) applied to the component when
     * the transition is requested to enter.
     */
    var enterAnimationName: String?

    /**
     * The name of the CSS class applied to the component when the transition
     * is requested to enter.
     */
    var enterClassName: ClassName?

    /**
     * The name of the CSS animation (the `animation-name` CSS property) applied to the component when
     * the transition is requested to exit.
     */
    var exitAnimationName: String?

    /**
     * The name of the CSS class applied to the component when the transition
     * is requested to exit.
     */
    var exitClassName: ClassName?
}

/**
 *
 * Demos:
 *
 * - [Transitions](https://mui.com/base-ui/react-transitions/)
 *
 * API:
 *
 * - [CssAnimation API](https://mui.com/base-ui/react-transitions/components-api/#css-animation)
 */
external val CssAnimation: react.FC<CssAnimationProps>
