// Automatically generated - do not modify!

package web.streams

sealed external interface QueuingStrategy<T> {
    val highWaterMark: Double?
    val size: QueuingStrategySize<T>?
}
