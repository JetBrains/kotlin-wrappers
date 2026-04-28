package js.test

import js.coroutines.internal.IsolatedCoroutineScope
import js.coroutines.promise
import js.undefined.undefinedOrNull
import kotlinx.coroutines.CoroutineScope

fun runJsTest(
    block: suspend CoroutineScope.() -> Unit,
): TestResult =
    IsolatedCoroutineScope()
        .promise {
            block()
            undefinedOrNull
        }
