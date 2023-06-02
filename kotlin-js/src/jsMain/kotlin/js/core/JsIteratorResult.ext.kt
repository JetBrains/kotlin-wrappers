package js.core

inline fun <T> JsIterator.Result<T, *>.asYieldOrNull(): JsIterator.YieldResult<T>? =
    takeIf { !it.done }.unsafeCast<JsIterator.YieldResult<T>?>()

inline fun <T> JsIterator.Result<T, *>.asYield(): JsIterator.YieldResult<T> =
    checkNotNull(asYieldOrNull())

inline fun <TReturn> JsIterator.Result<*, TReturn>.asReturnOrNull(): JsIterator.ReturnResult<TReturn>? =
    takeIf { it.done }.unsafeCast<JsIterator.ReturnResult<TReturn>?>()

inline fun <TReturn> JsIterator.Result<*, TReturn>.asReturn(): JsIterator.ReturnResult<TReturn> =
    checkNotNull(asReturnOrNull())
