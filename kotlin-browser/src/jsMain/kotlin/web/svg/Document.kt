package web.svg

import web.dom.Document

fun <T : SVGElement> Document.createElement(
    tagName: SvgTagName<T>,
): T =
    createElementNS(
        namespaceURI = SVG_NAMESPACE,
        qualifiedName = tagName,
    )
