package js.test

import js.core.Void
import js.coroutines.internal.IsolatedCoroutineScope
import js.coroutines.promise
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import kotlin.js.undefined

fun runJsTest(
    block: suspend CoroutineScope.() -> Unit,
): Promise<Void> =
    IsolatedCoroutineScope()
        .promise {
            block()
            undefined
        }
