// Automatically generated - do not modify!

package web.dom.observers

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.dom.ParentNode

@JsPlainObject
sealed external interface IntersectionObserverInit {
    var root: ParentNode /* Element | Document */?
    var rootMargin: String?
    var threshold: ReadonlyArray<Double>?
}
