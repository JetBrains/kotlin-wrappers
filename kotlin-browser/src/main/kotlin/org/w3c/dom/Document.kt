package org.w3c.dom

inline val Document.fonts: FontFaceSet
    get() = asDynamic().fonts

inline fun <T : Element> Document.createElement(
    tagName: TagName<T>,
): T =
    createElement(tagName.unsafeCast<String>())
        .unsafeCast<T>()
