@file:Suppress(
    "NOTHING_TO_INLINE",
)

package remix.run.router

import js.promise.PromiseResult

inline fun <Context> LoaderFunction(
    noinline value: (args: LoaderFunctionArgs<Context>) -> PromiseResult<DataFunctionValue>,
): LoaderFunction<Context> =
    value.unsafeCast<LoaderFunction<Context>>()
