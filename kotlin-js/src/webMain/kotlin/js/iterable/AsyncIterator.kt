package js.iterable

import js.core.JsAny
import js.disposable.AsyncDisposable
import js.iterable.internal.iteratorFromAsyncIteratorLike
import js.reflect.JsExternalInheritorsOnly

// TODO: add `@JsName`
@JsExternalInheritorsOnly
abstract external class AsyncIterator<out T : JsAny?> :
    AsyncIteratorLike<T>,
    AsyncIterable<T>,
    AsyncDisposable

inline operator fun <T : JsAny?> AsyncIterator<T>.iterator(): SuspendableIterator<T> =
    iteratorFromAsyncIteratorLike(this)
