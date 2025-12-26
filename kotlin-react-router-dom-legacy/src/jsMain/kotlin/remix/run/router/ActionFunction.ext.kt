package remix.run.router

import web.abort.internal.createCancellablePromise

fun <Context> ActionFunction(
    block: suspend (args: ActionFunctionArgs<Context>, handlerCtx: Any?) -> DataFunctionValue,
): ActionFunction<Context> =
    ActionFunctionAsync { args, handlerCtx ->
        createCancellablePromise(args.request) {
            block(args, handlerCtx)
        }
    }
