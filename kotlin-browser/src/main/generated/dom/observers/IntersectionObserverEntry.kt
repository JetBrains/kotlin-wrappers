// Automatically generated - do not modify!

package dom.observers

import dom.Element
import dom.geometry.DOMRectReadOnly
import js.core.HighResTimeStamp

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
