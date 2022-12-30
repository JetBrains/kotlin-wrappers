// Automatically generated - do not modify!

package dom.observers

import dom.Element
import js.core.HighResTimeStamp
import web.geometry.DOMRectInit

sealed external interface IntersectionObserverEntryInit {
    var boundingClientRect: DOMRectInit
    var intersectionRatio: Double
    var intersectionRect: DOMRectInit
    var isIntersecting: Boolean
    var rootBounds: DOMRectInit?
    var target: Element
    var time: HighResTimeStamp
}
