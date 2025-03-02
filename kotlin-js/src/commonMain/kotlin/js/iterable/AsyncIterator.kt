@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
)

package js.iterable

import js.disposable.AsyncDisposable
import js.iterable.internal.iteratorFromAsyncIteratorLike
import js.reflect.JsExternalInheritorsOnly

// TODO: add `@JsName`
@JsExternalInheritorsOnly
abstract external class AsyncIterator<out T> :
    AsyncIteratorLike<T>,
    AsyncIterable<T>,
    AsyncDisposable {

    override inline operator fun iterator(): SuspendableIterator<T> =
        iteratorFromAsyncIteratorLike(this)
}
