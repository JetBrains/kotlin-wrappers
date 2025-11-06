package web.geolocation

import js.coroutines.resumeWithError
import js.errors.toThrowable
import js.objects.unsafeJso
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

/**
 * The **`getCurrentPosition()`** method of the Geolocation interface is used to get the current position of the device.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Geolocation/getCurrentPosition)
 */
suspend fun Geolocation.getCurrentPosition(
    options: PositionOptions = unsafeJso(),
): GeolocationPosition =
    suspendCoroutine { continuation ->
        getCurrentPositionWithCallbacks(
            successCallback = continuation::resume,
            errorCallback = continuation::resumeWithError,
            options = options,
        )
    }

/**
 * The **`watchPosition()`** method of the Geolocation interface is used to register a handler function that will be called automatically each time the position of the device changes. You can also, optionally, specify an error handling callback function.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Geolocation/watchPosition)
 */
fun Geolocation.watchPosition(
    options: PositionOptions = unsafeJso(),
): Flow<GeolocationPosition> =
    callbackFlow {
        val watchId = watchPositionWithCallbacks(
            successCallback = ::trySend,
            errorCallback = { error -> cancel(error.message, error.toThrowable()) },
            options = options,
        )

        awaitClose {
            clearWatch(watchId)
        }
    }
