// Automatically generated - do not modify!

@file:JsModule("node:vm")

package node.vm

import js.core.ReadonlyArray

external class SyntheticModule : Module {
    /**
     * Creates a new `SyntheticModule` instance.
     * @param exportNames Array of names that will be exported from the module.
     * @param evaluateCallback Called when the module is evaluated.
     */
    constructor(
        exportNames: ReadonlyArray<String>,
        evaluateCallback: () -> Unit,
        options: SyntheticModuleOptions = definedExternally,
    )

    /**
     * This method is used after the module is linked to set the values of exports.
     * If it is called before the module is linked, an `ERR_VM_MODULE_STATUS` error will be thrown.
     * @param name
     * @param value
     */
    fun setExport(
        name: String,
        value: Any,
    )
}
