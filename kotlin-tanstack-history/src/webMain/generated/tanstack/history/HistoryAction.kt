// Automatically generated - do not modify!

package tanstack.history

@js.union.JsUnion
sealed external interface HistoryAction

inline val HistoryAction.Companion.PUSH: HistoryAction
    get() = js.reflect.unsafeCast("PUSH")

inline val HistoryAction.Companion.REPLACE: HistoryAction
    get() = js.reflect.unsafeCast("REPLACE")

inline val HistoryAction.Companion.FORWARD: HistoryAction
    get() = js.reflect.unsafeCast("FORWARD")

inline val HistoryAction.Companion.BACK: HistoryAction
    get() = js.reflect.unsafeCast("BACK")

inline val HistoryAction.Companion.GO: HistoryAction
    get() = js.reflect.unsafeCast("GO")
