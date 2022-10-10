@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.clipboard

import buffer.Blob

sealed external interface ClipboardItemDataType

inline fun ClipboardItemDataType(
    value: String,
): ClipboardItemDataType =
    value.unsafeCast<ClipboardItemDataType>()

inline fun ClipboardItemDataType(
    value: Blob,
): ClipboardItemDataType =
    value.unsafeCast<ClipboardItemDataType>()
