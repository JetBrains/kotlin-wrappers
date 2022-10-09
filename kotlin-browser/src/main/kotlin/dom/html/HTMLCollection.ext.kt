package dom.html

import dom.Element

inline operator fun HTMLCollection.get(
    index: Int,
): Element? =
    asDynamic()[index]
