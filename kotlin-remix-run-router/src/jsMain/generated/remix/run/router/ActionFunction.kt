package remix.run.router


/**
 * Route action function signature
 */
typealias ActionFunction<Context> = (args: ActionFunctionArgs<Context>) -> Any? /* Promise<DataFunctionValue> | DataFunctionValue */
