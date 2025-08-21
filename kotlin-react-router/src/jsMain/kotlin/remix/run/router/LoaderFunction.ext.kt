package remix.run.router

inline fun <Context> LoaderFunction(
    noinline value: (args: LoaderFunctionArgs<Context>, handlerCtx: Any? /* use undefined for default */) -> DataFunctionReturnValue,
): LoaderFunction<Context> =
    LoaderFunctionAsync(value)
