package js.promise

import js.coroutines.internal.IsolatedCoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlin.js.JsAny

/**
 * Converts this promise value to the instance of [Deferred].
 *
 * [Original](https://github.com/Kotlin/kotlinx.coroutines/blob/master/kotlinx-coroutines-core/js/src/Promise.kt)
 */
fun <T : JsAny?> Promise<T>.asDeferred(): Deferred<T> {
    return deferred
        ?: IsolatedCoroutineScope()
            .async(start = CoroutineStart.UNDISPATCHED) { await() }
}
