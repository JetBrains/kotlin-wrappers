package web.mathml

import web.dom.Document
import web.dom.TagName

fun <T : MathMLElement> Document.createElement(
    tagName: TagName<T>,
): T =
    createElementNS(
        namespaceURI = MATHML_NAMESPACE,
        qualifiedName = tagName,
    )
