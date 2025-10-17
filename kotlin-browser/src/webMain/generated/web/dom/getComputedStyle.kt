// Automatically generated - do not modify!

package web.dom

import web.cssom.CSSStyleDeclaration
import kotlin.js.definedExternally

/**
 * The **`Window.getComputedStyle()`** method returns a live read-only CSSStyleProperties object containing the resolved values of all CSS properties of an element, after applying active stylesheets and resolving any computation those values may contain.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/getComputedStyle)
 */
external fun getComputedStyle(
    element: Element,
    pseudoElement: String? = definedExternally,
): CSSStyleDeclaration
