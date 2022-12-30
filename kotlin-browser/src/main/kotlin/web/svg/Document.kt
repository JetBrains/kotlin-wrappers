package web.svg

private const val SVG_NAMESPACE: String = "http://www.w3.org/2000/svg"

fun <T : SVGElement> web.dom.Document.createElement(
    tagName: SvgTagName<T>,
): T =
    createElementNS(
        namespace = SVG_NAMESPACE,
        qualifiedName = tagName.unsafeCast<String>(),
    ).unsafeCast<T>()
