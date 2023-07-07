package remix.run.router


/**
 * Route action function signature
 */
typealias ActionFunction = (args: ActionFunctionArgs) -> Any /* Promise<DataFunctionValue> | DataFunctionValue */
