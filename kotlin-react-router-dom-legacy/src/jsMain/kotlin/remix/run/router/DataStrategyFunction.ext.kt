package remix.run.router

import js.objects.ReadonlyRecord
import web.abort.internal.createCancellablePromise

fun DataStrategyFunction(
    block: suspend (args: DataStrategyFunctionArgs<*>) -> ReadonlyRecord<String, DataStrategyResult>,
): DataStrategyFunction =
    DataStrategyFunctionAsync { args ->
        createCancellablePromise(args.request) {
            block(args)
        }
    }
