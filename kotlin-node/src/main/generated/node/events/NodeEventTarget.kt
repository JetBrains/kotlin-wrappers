// Automatically generated - do not modify!

package node.events

sealed external interface NodeEventTarget {
    fun once(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */
}
