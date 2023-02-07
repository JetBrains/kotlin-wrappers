// Automatically generated - do not modify!

package typescript

sealed external interface ScriptReferenceHost {
    fun getCompilerOptions(): CompilerOptions
    fun getSourceFile(fileName: String): SourceFile?
    fun getSourceFileByPath(path: Path): SourceFile?
    fun getCurrentDirectory(): String
}
