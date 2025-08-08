package react.internal

import js.array.ReadonlyArray
import js.internal.InternalApi
import react.Cleanup

@InternalApi
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
