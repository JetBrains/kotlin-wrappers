// Automatically generated - do not modify!

package node.vm

import js.core.ReadonlyArray
import node.buffer.Buffer

sealed external interface CompileFunctionOptions : BaseOptions {
    /**
     * Provides an optional data with V8's code cache data for the supplied source.
     */
    var cachedData: Buffer?

    /**
     * Specifies whether to produce new cache data.
     * Default: `false`,
     */
    var produceCachedData: Boolean?

    /**
     * The sandbox/context in which the said function should be compiled in.
     */
    var parsingContext: Context?

    /**
     * An array containing a collection of context extensions (objects wrapping the current scope) to be applied while compiling
     */
    var contextExtensions: ReadonlyArray<Any>?
}
