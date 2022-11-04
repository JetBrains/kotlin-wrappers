package dom.events

inline operator fun DataTransferItemList.get(
    index: Int,
): DataTransferItem? =
    asDynamic()[index]
