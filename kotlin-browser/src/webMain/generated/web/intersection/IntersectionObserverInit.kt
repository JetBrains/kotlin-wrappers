// Automatically generated - do not modify!

package web.intersection

import js.array.ReadonlyArray
import js.numbers.JsDouble
import kotlinx.js.JsPlainObject
import web.dom.ParentNode

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/IntersectionObserver#options)
 */
@JsPlainObject
external interface IntersectionObserverInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/IntersectionObserver#root)
     */
    var root: ParentNode /* Element | Document */?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/IntersectionObserver#rootmargin)
     */
    var rootMargin: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/IntersectionObserver#scrollmargin)
     */
    var scrollMargin: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/IntersectionObserver#threshold)
     */
    var threshold: ReadonlyArray<JsDouble>?
}
