package remix.run.router


/**
 * Route loader function signature
 */
typealias LoaderFunction = (args: LoaderFunctionArgs) -> Any /* Promise<DataFunctionValue> | DataFunctionValue */
