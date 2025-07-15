// Automatically generated - do not modify!

package web.intersection

import web.dom.Element
import web.geometry.DOMRectReadOnly
import web.time.DOMHighResTimeStamp

/**
 * The **`IntersectionObserverEntry`** interface of the Intersection Observer API describes the intersection between the target element and its root container at a specific moment of transition.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry)
 */
external class IntersectionObserverEntry
private constructor() {
    /**
     * The **`boundingClientRect`** read-only property of the IntersectionObserverEntry interface returns a DOMRectReadOnly which in essence describes a rectangle describing the smallest rectangle that contains the entire target element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/boundingClientRect)
     */
    val boundingClientRect: DOMRectReadOnly

    /**
     * The **`intersectionRatio`** read-only property of the IntersectionObserverEntry interface tells you how much of the target element is currently visible within the root's intersection ratio, as a value between 0.0 and 1.0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/intersectionRatio)
     */
    val intersectionRatio: Double

    /**
     * The **`intersectionRect`** read-only property of the IntersectionObserverEntry interface is a DOMRectReadOnly object which describes the smallest rectangle that contains the entire portion of the target element which is currently visible within the intersection root.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/intersectionRect)
     */
    val intersectionRect: DOMRectReadOnly

    /**
     * The **`isIntersecting`** read-only property of the IntersectionObserverEntry interface is a Boolean value which is `true` if the target element intersects with the intersection observer's root.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/isIntersecting)
     */
    val isIntersecting: Boolean

    /**
     * The **`rootBounds`** read-only property of the IntersectionObserverEntry interface is a DOMRectReadOnly corresponding to the IntersectionObserverEntry.target's root intersection rectangle, offset by the IntersectionObserver.rootMargin if one is specified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/rootBounds)
     */
    val rootBounds: DOMRectReadOnly?

    /**
     * The **`target`** read-only property of the IntersectionObserverEntry interface indicates which targeted Element has changed its amount of intersection with the intersection root.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/target)
     */
    val target: Element

    /**
     * The **`time`** read-only property of the IntersectionObserverEntry interface is a DOMHighResTimeStamp that indicates the time at which the intersection change occurred relative to the time at which the document was created.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/time)
     */
    val time: DOMHighResTimeStamp
}
