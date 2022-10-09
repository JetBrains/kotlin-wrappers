package dom.html

import dom.Element

typealias HTMLCollection = org.w3c.dom.HTMLCollection

inline operator fun HTMLCollection.get(
    index: Int,
): Element? =
    asDynamic()[index]
