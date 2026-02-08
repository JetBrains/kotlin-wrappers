// Automatically generated - do not modify!

package node.perfHooks

sealed external interface EntryType {
    companion object
} // available on the Web

inline val EntryType.Companion.dns: EntryType
    get() = js.reflect.unsafeCast("dns")

inline val EntryType.Companion.function: EntryType
    get() = js.reflect.unsafeCast("function")

inline val EntryType.Companion.gc: EntryType
    get() = js.reflect.unsafeCast("gc")

inline val EntryType.Companion.http2: EntryType
    get() = js.reflect.unsafeCast("http2")

inline val EntryType.Companion.http: EntryType
    get() = js.reflect.unsafeCast("http")

inline val EntryType.Companion.mark: EntryType
    get() = js.reflect.unsafeCast("mark")

inline val EntryType.Companion.measure: EntryType
    get() = js.reflect.unsafeCast("measure")

inline val EntryType.Companion.net: EntryType
    get() = js.reflect.unsafeCast("net")

inline val EntryType.Companion.node: EntryType
    get() = js.reflect.unsafeCast("node")

inline val EntryType.Companion.resource: EntryType
    get() = js.reflect.unsafeCast("resource")
