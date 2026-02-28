package tanstack.router.core

import js.objects.unsafeJso
import js.promise.await

suspend fun RouterCore.navigate(
    block: NavigateOptions.() -> Unit,
) {
    navigateAsync(unsafeJso(block)).await()
}

suspend fun RouterCore.load() {
    loadAsync().await()
}

suspend fun RouterCore.load(
    block: LoadOptions.() -> Unit,
) {
    loadAsync(unsafeJso(block)).await()
}
