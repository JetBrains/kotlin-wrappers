package dom.observers

import dom.Element
import dom.geometry.DOMRectReadOnly
import kotlinx.js.HighResTimeStamp
import kotlinx.js.ReadonlyArray

typealias IntersectionObserverCallback = (
    entries: ReadonlyArray<IntersectionObserverEntry>,
    observer: IntersectionObserver,
) -> Unit

external interface IntersectionObserverOptions {
    var root: Element? // or Document
    var rootMargin: String
    var threshold: ReadonlyArray<Double>
}

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

external interface IntersectionObserverEntry {
    val boundingClientRect: DOMRectReadOnly
    val intersectionRatio: Double
    val intersectionRect: DOMRectReadOnly
    val isIntersecting: Boolean
    val rootBounds: DOMRectReadOnly?
    val target: Element
    val time: HighResTimeStamp
}
