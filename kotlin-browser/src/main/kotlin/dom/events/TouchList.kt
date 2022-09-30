package dom.events

typealias TouchList = org.w3c.dom.TouchList

inline operator fun TouchList.get(
    index: Int,
): Touch? =
    asDynamic()[index]
