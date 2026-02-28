package tanstack.router.core

import js.objects.unsafeJso
import js.promise.await

suspend inline fun RouterCore.load() {
    loadAsync().await()
}

suspend inline fun RouterCore.load(
    block: LoadOptions.() -> Unit,
) {
    loadAsync(unsafeJso(block)).await()
}
