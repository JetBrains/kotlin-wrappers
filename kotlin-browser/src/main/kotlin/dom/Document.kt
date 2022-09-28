package dom

import org.w3c.dom.Element

typealias Document = org.w3c.dom.Document

inline val Document.fonts: FontFaceSet
    get() = asDynamic().fonts

inline fun <T : Element> Document.createElement(
    tagName: TagName<T>,
): T =
    createElement(tagName.unsafeCast<String>())
        .unsafeCast<T>()
