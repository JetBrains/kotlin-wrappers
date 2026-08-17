// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GPUStorageTextureAccess

inline val GPUStorageTextureAccess.Companion.readOnly: GPUStorageTextureAccess
    get() = unsafeCast("read-only")

inline val GPUStorageTextureAccess.Companion.readWrite: GPUStorageTextureAccess
    get() = unsafeCast("read-write")

inline val GPUStorageTextureAccess.Companion.writeOnly: GPUStorageTextureAccess
    get() = unsafeCast("write-only")
