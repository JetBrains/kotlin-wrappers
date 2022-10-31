package dom.svg

import dom.Document

const val SVG_NAMESPACE: String = "http://www.w3.org/2000/svg"

inline fun <T : SVGElement> Document.createElement(
    tagName: SvgTagName<T>,
): T =
    createElementNS(
        namespace = SVG_NAMESPACE,
        qualifiedName = tagName.unsafeCast<String>(),
    ).unsafeCast<T>()
