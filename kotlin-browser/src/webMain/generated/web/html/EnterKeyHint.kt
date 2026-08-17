// Automatically generated - do not modify!

package web.html

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface EnterKeyHint

inline val EnterKeyHint.Companion.enter: EnterKeyHint
    get() = unsafeCast("enter")

inline val EnterKeyHint.Companion.done: EnterKeyHint
    get() = unsafeCast("done")

inline val EnterKeyHint.Companion.go: EnterKeyHint
    get() = unsafeCast("go")

inline val EnterKeyHint.Companion.next: EnterKeyHint
    get() = unsafeCast("next")

inline val EnterKeyHint.Companion.previous: EnterKeyHint
    get() = unsafeCast("previous")

inline val EnterKeyHint.Companion.search: EnterKeyHint
    get() = unsafeCast("search")

inline val EnterKeyHint.Companion.send: EnterKeyHint
    get() = unsafeCast("send")
