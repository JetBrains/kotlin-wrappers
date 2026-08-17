// Automatically generated - do not modify!

package web.xr

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface XRSessionMode

inline val XRSessionMode.Companion.inline: XRSessionMode
    get() = unsafeCast("inline")

inline val XRSessionMode.Companion.immersiveVr: XRSessionMode
    get() = unsafeCast("immersive-vr")

inline val XRSessionMode.Companion.immersiveAr: XRSessionMode
    get() = unsafeCast("immersive-ar")
