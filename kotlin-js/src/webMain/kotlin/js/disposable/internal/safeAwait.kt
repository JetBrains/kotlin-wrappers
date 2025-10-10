package js.disposable.internal

import js.function.unsafeInvoke
import js.promise.Promise
import js.promise.await
import js.reflect.Reflect
import kotlin.js.JsAny

internal suspend fun JsAny.safeAwait(
    methodKey: JsAny?,
) {
    methodKey ?: return

    val dispose = Reflect.get(this, methodKey)
        ?: return

    val result = unsafeInvoke<JsAny?>(dispose)
    result as Promise<*>
    result.await()
}
