// Automatically generated - do not modify!

package typescript

import js.core.ReadonlyArray

sealed external interface Program : ScriptReferenceHost {
    override fun getCurrentDirectory(): String

    /**
     * Get a list of root file names that were passed to a 'createProgram'
     */
    fun getRootFileNames(): ReadonlyArray<String>

    /**
     * Get a list of files in the program
     */
    fun getSourceFiles(): ReadonlyArray<SourceFile>

    /**
     * Emits the JavaScript and declaration files.  If targetSourceFile is not specified, then
     * the JavaScript and declaration files will be produced for all the files in this program.
     * If targetSourceFile is specified, then only the JavaScript and declaration for that
     * specific file will be generated.
     *
     * If writeFile is not specified then the writeFile callback from the compiler host will be
     * used for writing the JavaScript and declaration files.  Otherwise, the writeFile parameter
     * will be invoked when writing the JavaScript and declaration files.
     */
    fun emit(
        targetSourceFile: SourceFile = definedExternally,
        writeFile: WriteFileCallback = definedExternally,
        cancellationToken: CancellationToken = definedExternally,
        emitOnlyDtsFiles: Boolean = definedExternally,
        customTransformers: CustomTransformers = definedExternally,
    ): EmitResult

    fun getOptionsDiagnostics(cancellationToken: CancellationToken = definedExternally): ReadonlyArray<Diagnostic>
    fun getGlobalDiagnostics(cancellationToken: CancellationToken = definedExternally): ReadonlyArray<Diagnostic>
    fun getSyntacticDiagnostics(
        sourceFile: SourceFile = definedExternally,
        cancellationToken: CancellationToken = definedExternally,
    ): ReadonlyArray<DiagnosticWithLocation>

    /** The first time this is called, it will return global diagnostics (no location). */
    fun getSemanticDiagnostics(
        sourceFile: SourceFile = definedExternally,
        cancellationToken: CancellationToken = definedExternally,
    ): ReadonlyArray<Diagnostic>

    fun getDeclarationDiagnostics(
        sourceFile: SourceFile = definedExternally,
        cancellationToken: CancellationToken = definedExternally,
    ): ReadonlyArray<DiagnosticWithLocation>

    fun getConfigFileParsingDiagnostics(): ReadonlyArray<Diagnostic>

    /**
     * Gets a type checker that can be used to semantically analyze source files in the program.
     */
    fun getTypeChecker(): TypeChecker
    fun getNodeCount(): Int
    fun getIdentifierCount(): Int
    fun getSymbolCount(): Int
    fun getTypeCount(): Int
    fun getInstantiationCount(): Int
    fun getRelationCacheSizes(): RelationCacheSizes
    fun isSourceFileFromExternalLibrary(file: SourceFile): Boolean
    fun isSourceFileDefaultLibrary(file: SourceFile): Boolean
    fun getProjectReferences(): ReadonlyArray<ProjectReference>?
    fun getResolvedProjectReferences(): ReadonlyArray<ResolvedProjectReference?>?
}
