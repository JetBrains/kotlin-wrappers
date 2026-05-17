package js.iterable

import js.disposable.AsyncDisposable
import js.internal.InternalApi
import js.reflect.JsExternalInheritorsOnly

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/AsyncIterator)
 */
@JsExternalInheritorsOnly
@SubclassOptInRequired(InternalApi::class)
external interface /* class */ AsyncIterator<out T : JsAny?> :
    AsyncIteratorLike<T>,
    AsyncIterable<T>,
    AsyncDisposable
