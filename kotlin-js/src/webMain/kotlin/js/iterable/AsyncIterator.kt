package js.iterable

import js.disposable.AsyncDisposable
import js.iterable.internal.iteratorFromAsyncIteratorLike
import js.reflect.JsExternalInheritorsOnly
import kotlin.js.JsAny

// TODO: add `@JsName`
@JsExternalInheritorsOnly
abstract external class AsyncIterator<out T : JsAny?> :
    AsyncIteratorLike<T>,
    AsyncIterable<T>,
    AsyncDisposable

inline operator fun <T : JsAny?> AsyncIterator<T>.iterator(): SuspendIterator<T> =
    iteratorFromAsyncIteratorLike(this)
