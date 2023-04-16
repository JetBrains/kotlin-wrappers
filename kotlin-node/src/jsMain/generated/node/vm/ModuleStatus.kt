// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.vm

// language=JavaScript
@JsName("""(/*union*/{unlinked: 'unlinked', linking: 'linking', linked: 'linked', evaluating: 'evaluating', evaluated: 'evaluated', errored: 'errored'}/*union*/)""")
sealed external interface ModuleStatus {
    companion object {
        val unlinked: ModuleStatus
        val linking: ModuleStatus
        val linked: ModuleStatus
        val evaluating: ModuleStatus
        val evaluated: ModuleStatus
        val errored: ModuleStatus
    }
}
