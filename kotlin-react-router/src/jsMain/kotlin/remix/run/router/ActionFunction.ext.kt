package remix.run.router

import remix.run.router.internal.isolatedPromise

fun <Context> ActionFunction(
    block: suspend (args: ActionFunctionArgs<Context>, handlerCtx: Any?) -> DataFunctionValue,
): ActionFunction<Context> =
    ActionFunctionAsync { args, handlerCtx ->
        isolatedPromise(args) {
            block(args, handlerCtx)
        }
    }
