// Automatically generated - do not modify!

package node.test

import kotlinx.coroutines.await

suspend fun test() {
    testAsync().await()
}

suspend fun test(
    name: String,
) {
    testAsync(
        name = name,
    ).await()
}

suspend fun test(
    name: String,
    fn: TestFn,
) {
    testAsync(
        name = name,
        fn = fn,
    ).await()
}

suspend fun test(
    name: String,
    options: TestOptions,
) {
    testAsync(
        name = name,
        options = options,
    ).await()
}

suspend fun test(
    name: String,
    options: TestOptions,
    fn: TestFn,
) {
    testAsync(
        name = name,
        options = options,
        fn = fn,
    ).await()
}

suspend fun test(
    options: TestOptions,
) {
    testAsync(
        options = options,
    ).await()
}

suspend fun test(
    options: TestOptions,
    fn: TestFn,
) {
    testAsync(
        options = options,
        fn = fn,
    ).await()
}

suspend fun test(
    fn: TestFn,
) {
    testAsync(
        fn = fn,
    ).await()
}
