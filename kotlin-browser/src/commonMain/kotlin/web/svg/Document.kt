package web.svg

import web.dom.Document
import web.dom.TagName

fun <T : SVGElement> Document.createElement(
    tagName: TagName<T>,
): T =
    createElementNS(
        namespaceURI = SVG_NAMESPACE,
        qualifiedName = tagName,
    )
