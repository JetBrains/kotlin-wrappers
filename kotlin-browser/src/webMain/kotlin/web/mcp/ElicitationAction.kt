package web.mcp

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ElicitationAction

inline val ElicitationAction.Companion.accept: ElicitationAction
    get() = unsafeCast("accept")

inline val ElicitationAction.Companion.decline: ElicitationAction
    get() = unsafeCast("decline")

inline val ElicitationAction.Companion.cancel: ElicitationAction
    get() = unsafeCast("cancel")
