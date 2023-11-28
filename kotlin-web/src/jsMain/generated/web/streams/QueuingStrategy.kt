// Automatically generated - do not modify!

package web.streams

sealed external interface QueuingStrategy<T> {
    val highWaterMark: Int?
    val size: QueuingStrategySize<T>?
}
