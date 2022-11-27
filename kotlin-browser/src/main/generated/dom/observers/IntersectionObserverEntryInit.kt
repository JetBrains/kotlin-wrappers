// Automatically generated - do not modify!

package dom.observers

import dom.Element
import dom.geometry.DOMRectInit
import js.core.HighResTimeStamp

sealed external interface IntersectionObserverEntryInit {
    var boundingClientRect: DOMRectInit
    var intersectionRatio: Double
    var intersectionRect: DOMRectInit
    var isIntersecting: Boolean
    var rootBounds: DOMRectInit?
    var target: Element
    var time: HighResTimeStamp
}
