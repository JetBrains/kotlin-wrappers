package react.internal

import js.array.ReadonlyArray
import react.Cleanup

internal fun buildCleanup(
    cleanups: ReadonlyArray<Cleanup>,
): Cleanup? {
    if (cleanups.isEmpty())
        return undefined

    return {
        for (cleanup in cleanups)
            cleanup()
    }
}
