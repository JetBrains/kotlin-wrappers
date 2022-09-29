package browser.clipboard

import buffer.Blob
import kotlinx.js.ReadonlyArray
import kotlinx.js.Record
import kotlin.js.Promise

sealed external interface ClipboardItemOptions {
    var presentationStyle: PresentationStyle?
}

external class ClipboardItem(
    items: Record<String, ClipboardItemDataType>,
    options: ClipboardItemOptions = definedExternally,
) {
    val types: ReadonlyArray<String>
    fun getType(type: String): Promise<Blob>
}
