// Automatically generated - do not modify!

package node.util

/**
 * Type of argument used in {@link parseArgs}.
 */
sealed external interface ParseArgsOptionsType {
    companion object
}

inline val ParseArgsOptionsType.Companion.boolean: ParseArgsOptionsType
    get() = js.reflect.unsafeCast("boolean")

inline val ParseArgsOptionsType.Companion.string: ParseArgsOptionsType
    get() = js.reflect.unsafeCast("string")
