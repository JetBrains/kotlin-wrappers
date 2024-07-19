package react.internal

import kotlinx.coroutines.CoroutineScope
import kotlin.coroutines.EmptyCoroutineContext

internal fun IsolatedCoroutineScope(): CoroutineScope =
    CoroutineScope(EmptyCoroutineContext)
