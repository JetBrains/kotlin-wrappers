// Automatically generated - do not modify!

package web.dom.observers

import js.core.HighResTimeStamp
import web.dom.Element
import web.geometry.DOMRectReadOnly

external class IntersectionObserverEntry(
    init: IntersectionObserverEntryInit,
) {
    val boundingClientRect: DOMRectReadOnly
    val intersectionRatio: Double
    val intersectionRect: DOMRectReadOnly
    val isIntersecting: Boolean
    val rootBounds: DOMRectReadOnly?
    val target: Element
    val time: HighResTimeStamp
}
