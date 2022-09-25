// Automatically generated - do not modify!

package node.stream.web

sealed external interface QueuingStrategy<T> {
    var highWaterMark: Number?
    var size: QueuingStrategySize<T>?
}
