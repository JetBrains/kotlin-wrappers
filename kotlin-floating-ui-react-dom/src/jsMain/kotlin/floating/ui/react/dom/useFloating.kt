@file:JsModule("@floating-ui/react-dom")

package floating.ui.react.dom

import floating.ui.dom.VirtualElement
import web.dom.Element

/**
 * Provides data to position a floating element.
 * [API Docs](https://floating-ui.com/docs/useFloating)
 */
external fun <R : VirtualElement> useFloating(
    options: UseFloatingOptions<R> = definedExternally,
): UseFloatingReturn<R>

external fun <R : Element> useFloating(
    options: UseFloatingOptions<R> = definedExternally,
): UseFloatingReturn<R>
