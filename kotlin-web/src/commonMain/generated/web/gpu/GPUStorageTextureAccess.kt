// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.unsafeCast

sealed external interface GPUStorageTextureAccess {
    companion object
}

inline val GPUStorageTextureAccess.Companion.readOnly: GPUStorageTextureAccess
    get() = unsafeCast("read-only")

inline val GPUStorageTextureAccess.Companion.readWrite: GPUStorageTextureAccess
    get() = unsafeCast("read-write")

inline val GPUStorageTextureAccess.Companion.writeOnly: GPUStorageTextureAccess
    get() = unsafeCast("write-only")
