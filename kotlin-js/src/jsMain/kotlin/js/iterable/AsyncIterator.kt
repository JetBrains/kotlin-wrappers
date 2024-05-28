@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package js.iterable

import js.promise.Promise
import seskar.js.JsAsync

@JsExternalInheritorsOnly
external interface AsyncIterator<out T> {
    @JsName("next")
    fun nextAsync(): Promise<IteratorResult<T, *>>

    @JsAsync
    suspend fun next(): IteratorResult<T, *> = definedExternally

    inline operator fun iterator(): SuspendableIterator<T> =
        iteratorFor(this)
}
