@file:JsModule("@floating-ui/react-dom")

package floating.ui.react.dom

import floating.ui.core.Middleware
import floating.ui.dom.AutoPlacementOptions
import react.DependencyList

/**
 * Optimizes the visibility of the floating element by choosing the placement
 * that has the most space available automatically, without needing to specify a
 * preferred placement. Alternative to `flip`.
 * [API Docs](https://floating-ui.com/docs/autoPlacement)
 */
external fun autoPlacement(
    options: AutoPlacementOptions, /* | Derivable<AutoPlacementOptions> */
    dependencies: DependencyList = definedExternally,
): Middleware
