package dom.css

import dom.Element
import web.cssom.CSSStyleDeclaration

external fun getComputedStyle(
    element: Element,
    pseudoElement: String? = definedExternally,
): CSSStyleDeclaration
