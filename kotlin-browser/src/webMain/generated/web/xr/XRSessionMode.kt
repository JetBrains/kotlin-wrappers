// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.xr

import js.reflect.unsafeCast

sealed external interface XRSessionMode {
    companion object
}

inline val XRSessionMode.Companion.inline: XRSessionMode
    get() = unsafeCast("inline")

inline val XRSessionMode.Companion.immersiveVr: XRSessionMode
    get() = unsafeCast("immersive-vr")

inline val XRSessionMode.Companion.immersiveAr: XRSessionMode
    get() = unsafeCast("immersive-ar")
