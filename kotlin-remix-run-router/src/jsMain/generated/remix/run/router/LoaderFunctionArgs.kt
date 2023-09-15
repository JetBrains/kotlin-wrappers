package remix.run.router


/**
 * Arguments passed to loader functions
 */

sealed external interface LoaderFunctionArgs<Context /* default is Any? */> : DataFunctionArgs<Context>
