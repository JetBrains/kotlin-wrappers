package remix.run.router

import web.abort.internal.createCancellablePromise

fun <Context> LoaderFunction(
    block: suspend (args: LoaderFunctionArgs<Context>, handlerCtx: Any?) -> DataFunctionValue,
): LoaderFunction<Context> =
    LoaderFunctionAsync { args, handlerCtx ->
        createCancellablePromise(args.request) {
            block(args, handlerCtx)
        }
    }
