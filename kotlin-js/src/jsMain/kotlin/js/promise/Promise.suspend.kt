package js.promise

import js.coroutines.internal.IsolatedCoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async

/**
 * Converts this promise value to the instance of [Deferred].
 *
 * [Original](original - https://github.com/Kotlin/kotlinx.coroutines/blob/master/kotlinx-coroutines-core/js/src/Promise.kt)
 */
fun <T> Promise<T>.asDeferred(): Deferred<T> {
    val deferred = asDynamic().deferred
    @Suppress("UnsafeCastFromDynamic")
    return deferred
        ?: IsolatedCoroutineScope()
            .async(start = CoroutineStart.UNDISPATCHED) { await() }
}
