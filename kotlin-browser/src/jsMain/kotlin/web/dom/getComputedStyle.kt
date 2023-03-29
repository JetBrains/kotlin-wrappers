package web.dom

import web.cssom.CSSStyleDeclaration

external fun getComputedStyle(
    element: Element,
    pseudoElement: String? = definedExternally,
): CSSStyleDeclaration
