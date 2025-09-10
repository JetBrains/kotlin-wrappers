package js.coroutines.internal

import js.coroutines.promise
import js.internal.InternalApi
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart.DEFAULT
import kotlinx.coroutines.CoroutineStart.UNDISPATCHED
import kotlinx.coroutines.isActive
import kotlin.js.JsAny

@InternalApi
fun <R : JsAny?> CoroutineScope.safePromise(
    block: suspend CoroutineScope.() -> R,
): Promise<R> =
    promise(
        start = if (isActive) UNDISPATCHED else DEFAULT,
        block = block,
    )
