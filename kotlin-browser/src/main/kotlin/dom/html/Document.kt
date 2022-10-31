package dom.html

import dom.Document

inline fun <T : HTMLElement> Document.createElement(
    tagName: HtmlTagName<T>,
): T =
    createElement(tagName.unsafeCast<String>())
        .unsafeCast<T>()
