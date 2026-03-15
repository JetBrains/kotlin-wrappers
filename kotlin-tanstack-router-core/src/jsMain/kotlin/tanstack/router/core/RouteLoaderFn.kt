package tanstack.router.core

import js.promise.PromiseResult
import js.reflect.unsafeCast
import kotlinx.coroutines.CoroutineScope
import web.abort.internal.createCancellablePromise

external interface RouteLoaderFn

fun RouteLoaderFn(
    block: suspend CoroutineScope.(options: LoaderFnContext) -> LoaderData?,
): RouteLoaderFn =
    RouteLoaderFn(value = { options ->
        createCancellablePromise(options.abortController) {
            block(options)
        }
    })

private fun RouteLoaderFn(
    value: (options: LoaderFnContext) -> PromiseResult<LoaderData?>,
): RouteLoaderFn =
    unsafeCast(value)
