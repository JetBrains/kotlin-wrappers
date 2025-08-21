package remix.run.router

inline fun <Context> ActionFunction(
    noinline value: (args: ActionFunctionArgs<Context>, handlerCtx: Any? /* use undefined for default */) -> DataFunctionReturnValue,
): ActionFunction<Context> =
    ActionFunctionAsync(value)
