// Automatically generated - do not modify!

package typescript

sealed external interface BuildInvalidedProject<T : BuilderProgram> : InvalidatedProjectBase {
    override val kind: InvalidatedProjectKind.Build
    fun getBuilderProgram(): T?
    fun getProgram(): Program?
    fun getSourceFile(fileName: String): SourceFile?
    fun getSourceFiles(): js.array.ReadonlyArray<SourceFile>
    fun getOptionsDiagnostics(cancellationToken: CancellationToken = definedExternally): js.array.ReadonlyArray<Diagnostic>
    fun getGlobalDiagnostics(cancellationToken: CancellationToken = definedExternally): js.array.ReadonlyArray<Diagnostic>
    fun getConfigFileParsingDiagnostics(): js.array.ReadonlyArray<Diagnostic>
    fun getSyntacticDiagnostics(
        sourceFile: SourceFile = definedExternally,
        cancellationToken: CancellationToken = definedExternally,
    ): js.array.ReadonlyArray<Diagnostic>

    fun getAllDependencies(sourceFile: SourceFile): js.array.ReadonlyArray<String>
    fun getSemanticDiagnostics(
        sourceFile: SourceFile = definedExternally,
        cancellationToken: CancellationToken = definedExternally,
    ): js.array.ReadonlyArray<Diagnostic>

    fun getSemanticDiagnosticsOfNextAffectedFile(
        cancellationToken: CancellationToken = definedExternally,
        ignoreSourceFile: (sourceFile: SourceFile) -> Boolean = definedExternally,
    ): AffectedFileResult<js.array.ReadonlyArray<Diagnostic>>

    fun emit(
        targetSourceFile: SourceFile = definedExternally,
        writeFile: WriteFileCallback = definedExternally,
        cancellationToken: CancellationToken = definedExternally,
        emitOnlyDtsFiles: Boolean = definedExternally,
        customTransformers: CustomTransformers = definedExternally,
    ): EmitResult?
}
