package react.internal

import js.coroutines.internal.IsolatedCoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import react.CleanupScope

internal fun isolatedJob(
    block: suspend CleanupScope.() -> Unit,
): Job =
    IsolatedCoroutineScope()
        .launch(
            start = CoroutineStart.UNDISPATCHED,
            block = { block(CleanupScopeImpl(this)) },
        )
