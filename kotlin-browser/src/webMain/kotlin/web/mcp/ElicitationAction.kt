@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mcp

import js.reflect.unsafeCast

sealed external interface ElicitationAction {
    companion object
}

inline val ElicitationAction.Companion.accept: ElicitationAction
    get() = unsafeCast("accept")

inline val ElicitationAction.Companion.decline: ElicitationAction
    get() = unsafeCast("decline")

inline val ElicitationAction.Companion.cancel: ElicitationAction
    get() = unsafeCast("cancel")
