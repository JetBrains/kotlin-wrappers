// Automatically generated - do not modify!

package dom.observers

import dom.Element
import kotlinx.js.ReadonlyArray

external class IntersectionObserver(
    callback: IntersectionObserverCallback,
    options: IntersectionObserverInit = definedExternally,
) {
    val root: Element /* | Document */?
    val rootMargin: String
    val thresholds: ReadonlyArray<Double>
    fun disconnect()
    fun observe(target: Element)
    fun takeRecords(): ReadonlyArray<IntersectionObserverEntry>
    fun unobserve(target: Element)
}
