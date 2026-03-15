package js.test

import js.coroutines.internal.IsolatedCoroutineScope
import js.coroutines.promise
import kotlinx.coroutines.CoroutineScope
import kotlin.js.undefined

fun runJsTest(
    block: suspend CoroutineScope.() -> Unit,
): TestResult =
    IsolatedCoroutineScope()
        .promise {
            block()
            undefined
        }
