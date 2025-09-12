package js.iterable

import js.disposable.AsyncDisposable
import js.iterable.internal.flowFromAsyncIteratorLike
import js.reflect.JsExternalInheritorsOnly
import kotlinx.coroutines.flow.Flow
import kotlin.js.JsAny

// TODO: add `@JsName`
@JsExternalInheritorsOnly
abstract external class AsyncIterator<out T : JsAny?> :
    AsyncIteratorLike<T>,
    AsyncIterable<T>,
    AsyncDisposable

inline fun <T : JsAny?> AsyncIterator<T>.asFlow(): Flow<T> =
    flowFromAsyncIteratorLike(this)
