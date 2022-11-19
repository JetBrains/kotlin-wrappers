package dom.observers

import dom.Element
import kotlinx.js.ReadonlyArray

external interface IntersectionObserverOptions {
    var root: Element? // or Document
    var rootMargin: String
    var threshold: ReadonlyArray<Double>
}
