package web.http

import js.errors.name
import js.objects.jso
import js.promise.catch
import kotlinx.coroutines.suspendCancellableCoroutine
import web.abort.AbortController
import web.errors.DOMException
import web.url.URL
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

suspend fun fetch(
    input: Request,
): Response =
    suspendCancellableCoroutine { continuation ->
        val controller = AbortController()

        continuation.invokeOnCancellation {
            controller.abort()
        }

        val request = Request(
            input = input,
            init = jso {
                signal = controller.signal
            }
        )

        fetchAsync(request)
            .then { continuation.resume(it) }
            .catch { error ->
                if (error.name != DOMException.AbortError) {
                    continuation.resumeWithException(FetchException(error))
                }
            }
    }

suspend fun fetch(
    input: Request,
    init: RequestInit,
): Response =
    fetch(Request(input, init))

suspend fun fetch(
    input: String,
): Response =
    fetch(Request(input))

suspend fun fetch(
    input: String,
    init: RequestInit,
): Response =
    fetch(Request(input, init))

suspend fun fetch(
    input: URL,
): Response =
    fetch(Request(input))

suspend fun fetch(
    input: URL,
    init: RequestInit,
): Response =
    fetch(Request(input, init))
