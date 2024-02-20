// Automatically generated - do not modify!

package web.dom.observers

import js.objects.JsPlainObject
import web.dom.Element
import web.geometry.DOMRectInit
import web.time.DOMHighResTimeStamp

@JsPlainObject
sealed external interface IntersectionObserverEntryInit {
    var boundingClientRect: DOMRectInit
    var intersectionRatio: Double
    var intersectionRect: DOMRectInit
    var isIntersecting: Boolean
    var rootBounds: DOMRectInit?
    var target: Element
    var time: DOMHighResTimeStamp
}
