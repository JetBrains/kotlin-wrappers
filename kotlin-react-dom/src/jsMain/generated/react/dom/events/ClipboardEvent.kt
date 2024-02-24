// Automatically generated - do not modify!

package react.dom.events

import web.data.DataTransfer
import web.dom.Element

external interface ClipboardEvent<out T : Element> : SyntheticEvent<T, NativeClipboardEvent<T>> {
    val clipboardData: DataTransfer
}
