package tanstack.router.core

import js.reflect.unsafeCast

sealed /* union */
external interface NotFoundMode {
    companion object
}

inline val NotFoundMode.Companion.root: NotFoundMode
    get() = unsafeCast("root")

inline val NotFoundMode.Companion.fuzzy: NotFoundMode
    get() = unsafeCast("fuzzy")
