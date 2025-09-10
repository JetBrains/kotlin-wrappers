package js.disposable.internal

import js.core.JsPrimitives.toJsString
import js.function.unsafeInvoke
import js.internal.InternalApi
import js.objects.ReadonlyRecord
import js.promise.Promise
import js.promise.await
import js.reflect.unsafeCast
import js.symbol.Symbol
import kotlin.js.JsAny

@SubclassOptInRequired(InternalApi::class)
external interface AsyncCloseableDisposable

@PublishedApi
internal suspend fun AsyncCloseableDisposable.close() {
    val record = unsafeCast<ReadonlyRecord<JsAny, JsAny?>>(this)

    val dispose = listOfNotNull(
        Symbol.asyncDispose,
        "close".toJsString(),
        "cancel".toJsString(),
    ).firstNotNullOf { record[it] }

    val result = unsafeInvoke<JsAny?>(dispose)
    result as Promise<*>
    result.await()
}
