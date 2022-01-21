// Automatically generated - do not modify!

package typescript

external interface InvalidatedProjectBase {
    val kind: InvalidatedProjectKind
    val project: ResolvedConfigFileName

    /**
     *  To dispose this project and ensure that all the necessary actions are taken and state is updated accordingly
     */
    fun done(
        cancellationToken: CancellationToken = definedExternally,
        writeFile: WriteFileCallback = definedExternally,
        customTransformers: CustomTransformers = definedExternally,
    ): ExitStatus

    fun getCompilerOptions(): CompilerOptions
    fun getCurrentDirectory(): String
}
