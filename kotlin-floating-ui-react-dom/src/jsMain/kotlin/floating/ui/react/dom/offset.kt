@file:JsModule("@floating-ui/react-dom")

package floating.ui.react.dom

import floating.ui.core.OffsetOptions
import floating.ui.dom.Middleware
import react.DependencyList

/**
 * Modifies the placement by translating the floating element along the
 * specified axes.
 * A number (shorthand for `mainAxis` or distance), or an axes configuration
 * object may be passed.
 *
 * [API Docs](https://floating-ui.com/docs/offset)
 */
external fun offset(
    value: Double,
    dependencies: DependencyList = definedExternally,
): Middleware

external fun offset(
    value: OffsetOptions,
    dependencies: DependencyList = definedExternally,
): Middleware
