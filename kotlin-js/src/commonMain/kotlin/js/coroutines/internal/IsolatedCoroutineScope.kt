package js.coroutines.internal

import kotlinx.coroutines.CoroutineScope
import kotlin.coroutines.EmptyCoroutineContext

fun IsolatedCoroutineScope(): CoroutineScope =
    CoroutineScope(EmptyCoroutineContext)
