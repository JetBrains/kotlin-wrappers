package js.iterable

import js.disposable.AsyncDisposable
import js.internal.InternalApi
import js.reflect.JsExternalInheritorsOnly
import kotlin.js.JsAny

@JsExternalInheritorsOnly
@SubclassOptInRequired(InternalApi::class)
external interface /* class */ AsyncIterator<out T : JsAny?> :
    AsyncIteratorLike<T>,
    AsyncIterable<T>,
    AsyncDisposable
