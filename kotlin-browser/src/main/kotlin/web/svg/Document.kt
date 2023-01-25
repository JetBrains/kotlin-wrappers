package web.svg

import web.dom.Document

fun <T : SVGElement> Document.createElement(
    tagName: SvgTagName<T>,
): T =
    createElementNS(
        namespace = SVG.NAMESPACE.unsafeCast<String>(),
        qualifiedName = tagName.unsafeCast<String>(),
    ).unsafeCast<T>()
