// Automatically generated - do not modify!

package web.streams

sealed external interface QueuingStrategy<T> {
    var highWaterMark: Int?
    var size: QueuingStrategySize<T>?
}
