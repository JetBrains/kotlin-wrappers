package web.mathml

import web.dom.Document

private const val MATHML_NAMESPACE: String = "http://www.w3.org/1998/Math/MathML"

fun <T : MathMLElement> Document.createElement(
    tagName: MathMLTagName<T>,
): T =
    createElementNS(
        namespace = MATHML_NAMESPACE,
        qualifiedName = tagName.unsafeCast<String>(),
    ).unsafeCast<T>()
