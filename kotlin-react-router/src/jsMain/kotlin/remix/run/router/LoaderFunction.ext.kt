package remix.run.router

import remix.run.router.internal.createCancellablePromise

fun <Context> LoaderFunction(
    block: suspend (args: LoaderFunctionArgs<Context>, handlerCtx: Any?) -> DataFunctionValue,
): LoaderFunction<Context> =
    LoaderFunctionAsync { args, handlerCtx ->
        createCancellablePromise(args) {
            block(args, handlerCtx)
        }
    }
