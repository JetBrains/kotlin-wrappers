package remix.run.router

import js.objects.ReadonlyRecord
import remix.run.router.internal.createCancellablePromise

fun DataStrategyFunction(
    block: suspend (args: DataStrategyFunctionArgs<*>) -> ReadonlyRecord<String, DataStrategyResult>,
): DataStrategyFunction =
    DataStrategyFunctionAsync { args ->
        createCancellablePromise(args) {
            block(args)
        }
    }
