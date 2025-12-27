// Automatically generated - do not modify!

package node

import js.promise.Promise

sealed external interface GCFunction {
    operator fun invoke(minor: Boolean = definedExternally)

    operator fun invoke(options: GCFunctionOptions): Promise<js.core.Void>

    operator fun invoke(options: GCOptions)
}
