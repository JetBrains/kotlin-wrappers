package js.iterable

import js.disposable.AsyncDisposable
import js.promise.Promise
import js.reflect.JsExternalInheritorsOnly
import kotlin.js.JsAny

// TODO: add `@JsName`
@JsExternalInheritorsOnly
abstract external class AsyncIterator<out T : JsAny?> :
    AsyncIteratorLike<T>,
    AsyncIterable<T>,
    AsyncDisposable {
    fun `return`(): Promise<IteratorResult<T, *>>
}
