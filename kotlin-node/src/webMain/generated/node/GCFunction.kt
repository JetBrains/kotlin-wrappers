// Automatically generated - do not modify!

package node

sealed external interface GCFunction {
    operator fun invoke(minor: Boolean = definedExternally)

    operator fun invoke(options: GCFunctionOptions): js.promise.Promise<js.core.Void>

    operator fun invoke(options: GCOptions)
}
