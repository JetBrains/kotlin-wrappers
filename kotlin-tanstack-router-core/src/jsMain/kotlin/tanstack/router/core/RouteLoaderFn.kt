package tanstack.router.core

import js.promise.PromiseResult

typealias RouteLoaderFn = (
    options: LoaderFnContext,
) -> PromiseResult<LoaderData?>
