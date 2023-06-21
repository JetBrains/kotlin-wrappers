// Automatically generated - do not modify!

package web.dom.observers

import js.core.DOMHighResTimeStamp
import web.dom.Element
import web.geometry.DOMRectReadOnly

external class IntersectionObserverEntry(
    init: IntersectionObserverEntryInit,
) {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/boundingClientRect) */
    val boundingClientRect: DOMRectReadOnly

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/intersectionRatio) */
    val intersectionRatio: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/intersectionRect) */
    val intersectionRect: DOMRectReadOnly

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/isIntersecting) */
    val isIntersecting: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/rootBounds) */
    val rootBounds: DOMRectReadOnly?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/target) */
    val target: Element

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/time) */
    val time: DOMHighResTimeStamp
}
