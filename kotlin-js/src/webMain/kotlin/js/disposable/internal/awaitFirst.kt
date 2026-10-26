package js.disposable.internal

import js.objects.PropertyKey
import js.promise.Promise
import js.promise.await
import js.reflect.internal.getMethodOrNull
import js.void.Void

internal suspend fun JsAny.awaitFirst(
    vararg methodKeys: PropertyKey?,
    strict: Boolean = true,
) {
    val method = methodKeys
        .filterNotNull()
        .firstNotNullOfOrNull { getMethodOrNull<_, Promise<Void>>(propertyKey = it) }
        ?: if (strict) {
            error("No method to await found!")
        } else return

    method().await()
}
