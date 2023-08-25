// Automatically generated - do not modify!

package node.vm

sealed external interface RunningCodeOptions : RunningScriptOptions {
    var cachedData: Any? /* ScriptOptions['cachedData'] */
    var importModuleDynamically: ((specifier: String, script: Script, importAssertions: Any) -> Module /* ScriptOptions['importModuleDynamically'] */)?
}
