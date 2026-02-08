// Automatically generated - do not modify!

package node.fs

sealed external interface SymlinkType {
    companion object
}

inline val SymlinkType.Companion.dir: SymlinkType
    get() = js.reflect.unsafeCast("dir")

inline val SymlinkType.Companion.file: SymlinkType
    get() = js.reflect.unsafeCast("file")

inline val SymlinkType.Companion.junction: SymlinkType
    get() = js.reflect.unsafeCast("junction")
