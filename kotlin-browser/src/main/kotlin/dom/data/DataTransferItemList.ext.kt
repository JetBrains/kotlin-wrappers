package dom.data

inline operator fun DataTransferItemList.get(
    index: Int,
): DataTransferItem? =
    asDynamic()[index]
