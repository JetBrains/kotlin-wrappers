// Automatically generated - do not modify!

package node.vm

sealed external interface SyntheticModuleOptions {
    /**
     * String used in stack traces.
     * @default 'vm:module(i)' where i is a context-specific ascending index.
     */
    var identifier: String?

    /**
     * The contextified object as returned by the `vm.createContext()` method, to compile and evaluate this module in.
     */
    var context: Context?
}
