package browser.clipboard

import kotlinx.js.Void
import org.w3c.dom.DataTransfer
import kotlin.js.Promise

typealias Clipboard = org.w3c.dom.clipboard.Clipboard

// Details - https://youtrack.jetbrains.com/issue/KT-52211
inline fun Promise<DataTransfer>.apply_KT_52211_workaround(): Promise<ClipboardItems> =
    unsafeCast<Promise<ClipboardItems>>()

inline fun Clipboard.write(
    data: ClipboardItems,
): Promise<Void> =
    asDynamic().write(data)
