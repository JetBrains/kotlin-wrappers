package web.dom.css

import web.cssom.CSSStyleDeclaration
import web.dom.Element

external fun getComputedStyle(
    element: Element,
    pseudoElement: String? = definedExternally,
): CSSStyleDeclaration
