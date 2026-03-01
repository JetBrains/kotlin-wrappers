@file:JsModule("@floating-ui/react-dom")

package floating.ui.react.dom

import floating.ui.core.Middleware
import floating.ui.dom.ShiftOptions
import react.DependencyList

/**
 * Optimizes the visibility of the floating element by shifting it in order to
 * keep it in view when it will overflow the clipping boundary.
 * [API Docs](https://floating-ui.com/docs/shift)
 */
external fun shift(
    options: ShiftOptions, /* | Derivable<ShiftOptions> */
    dependencies: DependencyList = definedExternally,
): Middleware
