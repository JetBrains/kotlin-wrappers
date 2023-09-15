package remix.run.router


/**
 * Route loader function signature
 */
typealias LoaderFunction<Context> = (args: LoaderFunctionArgs<Context>) -> Any /* Promise<DataFunctionValue> | DataFunctionValue */
