package web.mathml

import web.dom.Document

fun <T : MathMLElement> Document.createElement(
    tagName: MathMLTagName<T>,
): T =
    createElementNS(
        namespace = MathML.NAMESPACE.unsafeCast<String>(),
        qualifiedName = tagName.unsafeCast<String>(),
    ).unsafeCast<T>()
