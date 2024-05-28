// Automatically generated - do not modify!

package web.streams

// @JsPlainObject
sealed external interface QueuingStrategy<T> {
    val highWaterMark: Double?
    val size: QueuingStrategySize<T>?
}
