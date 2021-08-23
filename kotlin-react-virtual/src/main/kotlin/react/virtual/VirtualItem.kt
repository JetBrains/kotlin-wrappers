package react.virtual

import org.w3c.dom.HTMLElement

external interface VirtualItem {
    val index: Int
    val start: Int
    val size: Int
    val end: Int
    val measureRef: (el: HTMLElement?) -> Unit
}
