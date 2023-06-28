// Automatically generated - do not modify!

@file:JsModule("@actions/glob")

package actions.glob

import js.core.ReadonlyArray
import js.promise.Promise

sealed external class DefaultGlobber : Globber {
    // private constructor()
    override fun getSearchPaths(): ReadonlyArray<String>
    override fun glob(): Promise<ReadonlyArray<String>>
    override fun globGenerator(): Any /* AsyncGenerator<string, void> */

    companion object {
        /**
         * Constructs a DefaultGlobber
         */
        fun create(
            patterns: String,
            options: GlobOptions = definedExternally,
        ): Promise<DefaultGlobber>
    }
}
