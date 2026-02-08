// Automatically generated - do not modify!

package node.childProcess

sealed external interface SerializationType {
    companion object
}

inline val SerializationType.Companion.json: SerializationType
    get() = js.reflect.unsafeCast("json")

inline val SerializationType.Companion.advanced: SerializationType
    get() = js.reflect.unsafeCast("advanced")
