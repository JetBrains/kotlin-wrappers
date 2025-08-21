package remix.run.router

import js.objects.ReadonlyRecord
import js.promise.Promise

inline fun DataStrategyFunction(
    noinline value: (args: DataStrategyFunctionArgs<*>) -> Promise<ReadonlyRecord<String, DataStrategyResult>>,
): DataStrategyFunction =
    DataStrategyFunctionAsync(value)
