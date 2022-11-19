// Automatically generated - do not modify!

package dom.observers

import dom.Element
import dom.geometry.DOMRectReadOnly
import kotlinx.js.HighResTimeStamp

external class IntersectionObserverEntry(
    intersectionObserverEntryInit: IntersectionObserverEntryInit,
) {
    val boundingClientRect: DOMRectReadOnly
    val intersectionRatio: Double
    val intersectionRect: DOMRectReadOnly
    val isIntersecting: Boolean
    val rootBounds: DOMRectReadOnly?
    val target: Element
    val time: HighResTimeStamp
}
