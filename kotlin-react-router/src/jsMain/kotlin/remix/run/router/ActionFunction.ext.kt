package remix.run.router

import remix.run.router.internal.createCancellablePromise

fun <Context> ActionFunction(
    block: suspend (args: ActionFunctionArgs<Context>, handlerCtx: Any?) -> DataFunctionValue,
): ActionFunction<Context> =
    ActionFunctionAsync { args, handlerCtx ->
        createCancellablePromise(args) {
            block(args, handlerCtx)
        }
    }
