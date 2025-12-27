// Automatically generated - do not modify!

package node.os

sealed external interface SignalConstants {
    operator fun <Key : node.process.Signals> get(key: Key): Double?

    operator fun <Key : node.process.Signals> set(
        key: Key,
        value: Double?,
    )
}
