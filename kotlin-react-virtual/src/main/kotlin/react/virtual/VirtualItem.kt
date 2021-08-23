package react.virtual

import org.w3c.dom.HTMLElement
import react.RefCallback

external interface VirtualItem {
    val index: Int
    val start: Int
    val size: Int
    val end: Int
    val measureRef: RefCallback<HTMLElement>
}
