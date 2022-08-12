// Automatically generated - do not modify!

package node.events

sealed external interface NodeEventTarget {
    fun once(
        eventName: String, /* | Symbol */
        listener: Function<Unit>,
    ): NodeEventTarget
}
