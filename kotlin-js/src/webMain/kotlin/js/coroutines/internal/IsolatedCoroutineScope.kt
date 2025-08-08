package js.coroutines.internal

import js.internal.InternalApi
import kotlinx.coroutines.CoroutineScope
import kotlin.coroutines.EmptyCoroutineContext

@InternalApi
fun IsolatedCoroutineScope(): CoroutineScope =
    CoroutineScope(EmptyCoroutineContext)
