// Automatically generated - do not modify!

package web.dom.observers

import js.core.ReadonlyArray
import web.dom.Element

external class IntersectionObserver(
    callback: IntersectionObserverCallback,
    options: IntersectionObserverInit = definedExternally,
) {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/root) */
    val root: Element /* | Document */?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/rootMargin) */
    val rootMargin: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/thresholds) */
    val thresholds: ReadonlyArray<Double>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/disconnect) */
    fun disconnect()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/observe) */
    fun observe(target: Element)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/takeRecords) */
    fun takeRecords(): ReadonlyArray<IntersectionObserverEntry>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/unobserve) */
    fun unobserve(target: Element)
}
