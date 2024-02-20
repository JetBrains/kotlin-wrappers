// Automatically generated - do not modify!

package web.streams

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface QueuingStrategy<T> {
    val highWaterMark: Double?
    val size: QueuingStrategySize<T>?
}
