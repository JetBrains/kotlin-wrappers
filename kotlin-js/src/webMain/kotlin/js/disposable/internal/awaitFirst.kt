package js.disposable.internal

import js.function.unsafeInvoke
import js.objects.PropertyKey
import js.objects.ReadonlyRecord
import js.promise.Promise
import js.promise.await
import js.reflect.unsafeCast
import kotlin.collections.filterNotNull
import kotlin.collections.firstNotNullOf
import kotlin.js.JsAny

internal suspend fun JsAny.awaitFirst(
    vararg methodKeys: PropertyKey?,
) {
    val record = unsafeCast<ReadonlyRecord<PropertyKey, AsyncDispose?>>(this)

    val dispose = methodKeys
        .filterNotNull()
        .firstNotNullOf { record[it] }
        .bind(this)

    val result = unsafeInvoke<JsAny?>(dispose)
    result as Promise<*>
    result.await()
}

private external interface AsyncDispose {
    fun bind(thisArg: JsAny): AsyncDispose
}
