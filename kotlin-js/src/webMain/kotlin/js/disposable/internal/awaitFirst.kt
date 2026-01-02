package js.disposable.internal

import js.core.Void
import js.objects.PropertyKey
import js.promise.Promise
import js.promise.await
import js.reflect.internal.getMethodOrNull
import kotlin.js.JsAny

internal suspend fun JsAny.awaitFirst(
    vararg methodKeys: PropertyKey?,
) {
    methodKeys
        .filterNotNull()
        .firstNotNullOf { getMethodOrNull<_, Promise<Void>>(propertyKey = it) }
        .invoke()
        .await()
}
