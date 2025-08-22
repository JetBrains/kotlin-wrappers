package remix.run.router

import remix.run.router.internal.isolatedPromise

fun <Context> LoaderFunction(
    block: suspend (args: LoaderFunctionArgs<Context>, handlerCtx: Any?) -> DataFunctionValue,
): LoaderFunction<Context> =
    LoaderFunctionAsync { args, handlerCtx ->
        isolatedPromise(args) {
            block(args, handlerCtx)
        }
    }
