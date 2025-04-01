// Automatically generated - do not modify!

package actions.glob

import js.array.ReadonlyArray
import js.generator.AsyncGenerator
import js.promise.Promise

external interface Globber {
    /**
     * Returns the search path preceding the first glob segment, from each pattern.
     * Duplicates and descendants of other paths are filtered out.
     *
     * Example 1: The patterns `/foo/ *` and `/bar/ *` returns `/foo` and `/bar`.
     *
     * Example 2: The patterns `/foo/ *` and `/foo/bar/ *` returns `/foo`.
     */
    fun getSearchPaths(): ReadonlyArray<String>

    /**
     * Returns files and directories matching the glob patterns.
     *
     * Order of the results is not guaranteed.
     */
    fun glob(): Promise<ReadonlyArray<String>>

    /**
     * Returns files and directories matching the glob patterns.
     *
     * Order of the results is not guaranteed.
     */
    fun globGenerator(): AsyncGenerator<String, *, *>
}
