package dom.events

inline operator fun TouchList.get(
    index: Int,
): Touch? =
    asDynamic()[index]
