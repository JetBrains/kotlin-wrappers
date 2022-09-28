package react.virtual

import dom.html.HTMLElement
import react.Key
import react.RefCallback

external interface VirtualItem {
    val key: Key
    val index: Int
    val start: Int
    val size: Int
    val end: Int
    val measureRef: RefCallback<HTMLElement>
}
