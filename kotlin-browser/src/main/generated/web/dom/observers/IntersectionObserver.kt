// Automatically generated - do not modify!

package web.dom.observers

import js.core.ReadonlyArray
import web.dom.Element

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
