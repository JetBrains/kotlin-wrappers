package remix.run.router

inline fun <Context> ActionFunction(
    noinline value: (args: ActionFunctionArgs<Context>, handlerCtx: Any?) -> DataFunctionReturnValue,
): ActionFunction<Context> =
    ActionFunctionAsync(value)
