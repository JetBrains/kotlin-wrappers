@file:Suppress(
    "NOTHING_TO_INLINE",
)

package browser.clipboard

import org.w3c.files.Blob

sealed external interface ClipboardItemDataType

inline fun ClipboardItemDataType(
    value: String,
): ClipboardItemDataType =
    value.unsafeCast<ClipboardItemDataType>()

inline fun ClipboardItemDataType(
    value: Blob,
): ClipboardItemDataType =
    value.unsafeCast<ClipboardItemDataType>()
