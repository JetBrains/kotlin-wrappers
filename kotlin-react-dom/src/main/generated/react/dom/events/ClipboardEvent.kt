// Automatically generated - do not modify!

package react.dom.events

import dom.Element
import web.data.DataTransfer

external interface ClipboardEvent<out T : Element> : SyntheticEvent<T, NativeClipboardEvent> {
    val clipboardData: DataTransfer
}
