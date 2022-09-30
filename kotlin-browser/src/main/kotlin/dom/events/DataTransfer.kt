package dom.events

typealias DataTransfer = org.w3c.dom.DataTransfer
typealias DataTransferItem = org.w3c.dom.DataTransferItem
typealias DataTransferItemList = org.w3c.dom.DataTransferItemList

inline operator fun DataTransferItemList.get(
    index: Int,
): DataTransferItem? =
    asDynamic()[index]
