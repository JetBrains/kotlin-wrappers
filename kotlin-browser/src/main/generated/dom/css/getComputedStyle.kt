package dom.css

import cssom.CSSStyleDeclaration
import dom.Element

external fun getComputedStyle(
    element: Element,
    pseudoElement: String? = definedExternally,
): CSSStyleDeclaration
