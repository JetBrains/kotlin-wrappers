package remix.run.router


/**
 * Loaders and actions can return anything except `undefined` (`null` is a
 * valid return value if there is no data to return).  Responses are preferred
 * and will ease any future migration to Remix
 */
typealias DataFunctionValue = (Any /* Response | NonNullable<unknown> | null */)?
