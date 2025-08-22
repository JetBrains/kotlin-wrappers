package remix.run.router

import js.objects.ReadonlyRecord
import remix.run.router.internal.isolatedPromise

fun DataStrategyFunction(
    block: suspend (args: DataStrategyFunctionArgs<*>) -> ReadonlyRecord<String, DataStrategyResult>,
): DataStrategyFunction =
    DataStrategyFunctionAsync { args ->
        isolatedPromise(args) {
            block(args)
        }
    }
