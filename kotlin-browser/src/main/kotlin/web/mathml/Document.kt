package web.mathml

import web.dom.Document

fun <T : MathMLElement> Document.createElement(
    tagName: MathMLTagName<T>,
): T =
    createElementNS(
        namespace = MATHML_NAMESPACE.unsafeCast<String>(),
        qualifiedName = tagName.unsafeCast<String>(),
    ).unsafeCast<T>()
