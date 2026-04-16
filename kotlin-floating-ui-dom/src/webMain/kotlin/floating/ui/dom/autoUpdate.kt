@file:JsModule("@floating-ui/dom")

package floating.ui.dom

import web.html.HTMLElement

/**
 * Automatically updates the position of the floating element when necessary.
 * Should only be called when the floating element is mounted on the DOM or
 * visible on the screen.
 * @returns cleanup function that should be invoked when the floating element is
 * removed from the DOM or hidden from the screen.
 * [API Docs](https://floating-ui.com/docs/autoUpdate)
 */
external fun <R : ReferenceElement> autoUpdate(
    reference: R,
    floating: HTMLElement?,
    update: () -> Unit,
    options: AutoUpdateOptions? = definedExternally,
): () -> Unit
