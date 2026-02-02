package tanstack.react.router

import js.promise.PromiseResult

typealias ShouldBlockFn = (
    args: ShouldBlockFnArgs,
) -> PromiseResult<Boolean>
