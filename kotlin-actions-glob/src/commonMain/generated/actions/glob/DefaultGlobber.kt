// Automatically generated - do not modify!

@file:JsModule("@actions/glob")

package actions.glob

import js.array.ReadonlyArray
import js.generator.AsyncGenerator
import js.promise.Promise

sealed external class DefaultGlobber : Globber {
    // private constructor()
    override fun getSearchPaths(): ReadonlyArray<String>
    override fun glob(): Promise<ReadonlyArray<String>>
    override fun globGenerator(): AsyncGenerator<String, *, *>

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
