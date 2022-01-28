// Automatically generated - do not modify!

package typescript

sealed external interface BuildInvalidedProject<T : BuilderProgram> : InvalidatedProjectBase {
    override val kind: InvalidatedProjectKind.Build
    fun getBuilderProgram(): T?
    fun getProgram(): Program?
    fun getSourceFile(fileName: String): SourceFile?
    fun getSourceFiles(): ReadonlyArray<SourceFile>
    fun getOptionsDiagnostics(cancellationToken: CancellationToken = definedExternally): ReadonlyArray<Diagnostic>
    fun getGlobalDiagnostics(cancellationToken: CancellationToken = definedExternally): ReadonlyArray<Diagnostic>
    fun getConfigFileParsingDiagnostics(): ReadonlyArray<Diagnostic>
    fun getSyntacticDiagnostics(
        sourceFile: SourceFile = definedExternally,
        cancellationToken: CancellationToken = definedExternally,
    ): ReadonlyArray<Diagnostic>

    fun getAllDependencies(sourceFile: SourceFile): ReadonlyArray<String>
    fun getSemanticDiagnostics(
        sourceFile: SourceFile = definedExternally,
        cancellationToken: CancellationToken = definedExternally,
    ): ReadonlyArray<Diagnostic>

    fun getSemanticDiagnosticsOfNextAffectedFile(
        cancellationToken: CancellationToken = definedExternally,
        ignoreSourceFile: (sourceFile: SourceFile) -> Boolean = definedExternally,
    ): AffectedFileResult<ReadonlyArray<Diagnostic>>

    fun emit(
        targetSourceFile: SourceFile = definedExternally,
        writeFile: WriteFileCallback = definedExternally,
        cancellationToken: CancellationToken = definedExternally,
        emitOnlyDtsFiles: Boolean = definedExternally,
        customTransformers: CustomTransformers = definedExternally,
    ): EmitResult?
}
