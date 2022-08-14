// Automatically generated - do not modify!

package node.events

sealed external interface NodeEventTarget {
    fun once(
        event: String, /* | Symbol */
        listener: Function<Unit>,
    ): NodeEventTarget
}
