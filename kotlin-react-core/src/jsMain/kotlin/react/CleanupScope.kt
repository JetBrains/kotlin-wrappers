package react

import kotlinx.coroutines.CoroutineScope

class CleanupScope
internal constructor(
    source: CoroutineScope,
) : CoroutineScope by source
