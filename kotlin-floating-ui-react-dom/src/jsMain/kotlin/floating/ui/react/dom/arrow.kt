@file:JsModule("@floating-ui/react-dom")

package floating.ui.react.dom

import floating.ui.dom.Middleware
import react.DependencyList

/**
 * Provides data to position an inner element of the floating element so that it
 * appears centered to the reference element.
 * This wraps the core `arrow` middleware to allow React refs as the element.
 *
 * [API Docs](https://floating-ui.com/docs/arrow)
 */
external fun arrow(
    options: ArrowOptions, /* | Derivable<ArrowOptions> */
    dependencies: DependencyList = definedExternally,
): Middleware
