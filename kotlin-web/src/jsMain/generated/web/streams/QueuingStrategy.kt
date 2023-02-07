// Automatically generated - do not modify!

package web.streams

sealed external interface QueuingStrategy<T> {
    var highWaterMark: Number?
    var size: QueuingStrategySize<T>?
}
