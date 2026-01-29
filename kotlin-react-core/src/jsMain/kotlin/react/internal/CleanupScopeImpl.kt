package react.internal

import kotlinx.coroutines.CoroutineScope
import react.CleanupScope
import kotlin.coroutines.CoroutineContext

internal class CleanupScopeImpl(
    private val source: CoroutineScope,
) : CleanupScope {
    override val coroutineContext: CoroutineContext
        get() = source.coroutineContext
}
