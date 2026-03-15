package tanstack.router.core

import js.reflect.unsafeCast

sealed /* union */
external interface LoaderStaleReloadMode {
    companion object
}

inline val LoaderStaleReloadMode.Companion.background: LoaderStaleReloadMode
    get() = unsafeCast("background")

inline val LoaderStaleReloadMode.Companion.blocking: LoaderStaleReloadMode
    get() = unsafeCast("blocking")
