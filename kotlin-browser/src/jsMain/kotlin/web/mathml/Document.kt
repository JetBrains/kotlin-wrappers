package web.mathml

import web.dom.Document

fun <T : MathMLElement> Document.createElement(
    tagName: MathMLTagName<T>,
): T =
    createElementNS(
        namespaceURI = MATHML_NAMESPACE,
        qualifiedName = tagName,
    )
