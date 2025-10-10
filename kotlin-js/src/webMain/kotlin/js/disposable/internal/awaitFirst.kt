package js.disposable.internal

import js.function.unsafeInvoke
import js.objects.ReadonlyRecord
import js.promise.Promise
import js.promise.await
import js.reflect.unsafeCast
import kotlin.collections.filterNotNull
import kotlin.collections.firstNotNullOf
import kotlin.js.JsAny

internal suspend fun JsAny.awaitFirst(
    vararg methodKeys: JsAny?,
) {
    val record = unsafeCast<ReadonlyRecord<JsAny, JsAny?>>(this)

    val dispose = methodKeys
        .filterNotNull()
        .firstNotNullOf { record[it] }

    val result = unsafeInvoke<JsAny?>(dispose)
    result as Promise<*>
    result.await()
}
