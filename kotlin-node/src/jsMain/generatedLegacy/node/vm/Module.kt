// Automatically generated - do not modify!

@file:JsModule("node:vm")

package node.vm

import js.core.ReadonlyArray
import js.core.Void
import js.promise.Promise

open external class Module {
    /**
     * The specifiers of all dependencies of this module.
     */
    open var dependencySpecifiers: ReadonlyArray<String>

    /**
     * If the `module.status` is `'errored'`, this property contains the exception thrown by the module during evaluation.
     * If the status is anything else, accessing this property will result in a thrown exception.
     */
    open var error: Any

    /**
     * The identifier of the current module, as set in the constructor.
     */
    open var identifier: String
    open var context: Context

    /**
     * The namespace object of the module. This is only available after linking (`module.link()`) has completed.
     */
    open var namespace: Any

    /**
     * The current status of the module.
     */
    open var status: ModuleStatus

    /**
     * Evaluate the module.
     *
     * This must be called after the module has been linked; otherwise it will reject
     * It could be called also when the module has already been evaluated, in which case it will either do nothing
     * if the initial evaluation ended in success (`module.status` is `'evaluated'`) or it will re-throw the exception
     * that the initial evaluation resulted in (`module.status` is `'errored'`).
     *
     * This method cannot be called while the module is being evaluated (`module.status` is `'evaluating'`).
     */
    open fun evaluate(options: ModuleEvaluateOptions = definedExternally): Promise<Void>

    /**
     * Link module dependencies. This method must be called before evaluation, and can only be called once per module.
     */
    open fun link(linker: ModuleLinker): Promise<Void>
}
