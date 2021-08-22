package react.virtual

import org.w3c.dom.Element
import react.Ref

external interface VirtualItem {
    val index: Int
    val start: Int
    val size: Int
    val end: Int
    val measureRef: Ref<Element>
}
