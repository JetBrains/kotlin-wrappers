package tanstack.router.core

import js.reflect.unsafeCast

sealed /* union */
external interface SSROption {
    companion object
}

inline val SSROption.Companion.`false`: SSROption
    get() = unsafeCast(false)

inline val SSROption.Companion.`true`: SSROption
    get() = unsafeCast(true)

inline val SSROption.Companion.dataOnly: SSROption
    get() = unsafeCast("data-only")
