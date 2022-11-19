package dom.observers

import dom.Element
import kotlinx.js.ReadonlyArray

external class IntersectionObserver(
    callback: IntersectionObserverCallback,
    options: IntersectionObserverOptions = definedExternally,
) {
    val root: Element? // or Document
    val rootMargin: String
    val thresholds: ReadonlyArray<Double>

    fun observe(target: Element)
    fun unobserve(target: Element)
    fun takeRecords(): ReadonlyArray<IntersectionObserverEntry>
    fun disconnect()
}
