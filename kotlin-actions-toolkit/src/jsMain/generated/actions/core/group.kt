// Automatically generated - do not modify!

package actions.core

import kotlinx.coroutines.await
import kotlin.js.Promise

suspend fun <T> group(
    name: String,
    fn: () -> Promise<T>,
): T =
    groupAsync(
        name = name,
        fn = fn,
    ).await()
