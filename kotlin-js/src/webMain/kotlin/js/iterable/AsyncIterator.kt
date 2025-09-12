package js.iterable

import js.core.Void
import js.disposable.AsyncDisposable
import js.iterable.internal.flowFromAsyncIterable
import js.promise.Promise
import js.reflect.JsExternalInheritorsOnly
import kotlinx.coroutines.flow.Flow
import kotlin.js.JsAny

// TODO: add `@JsName`
@JsExternalInheritorsOnly
abstract external class AsyncIterator<out T : JsAny?> :
    AsyncIteratorLike<T>,
    AsyncIterable<T>,
    AsyncDisposable {
    internal fun `return`(): Promise<IteratorReturnResult<Void>>
}

inline fun <T : JsAny?> AsyncIterator<T>.asFlow(): Flow<T> =
    flowFromAsyncIterable(this)
