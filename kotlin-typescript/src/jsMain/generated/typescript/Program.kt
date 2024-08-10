// Automatically generated - do not modify!

package typescript

sealed external interface Program : ScriptReferenceHost, RequiredAffectedFileResultAffected {
    override fun getCurrentDirectory(): String

    /**
     * Get a list of root file names that were passed to a 'createProgram'
     */
    fun getRootFileNames(): js.array.ReadonlyArray<String>

    /**
     * Get a list of files in the program
     */
    fun getSourceFiles(): js.array.ReadonlyArray<SourceFile>

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

    fun getOptionsDiagnostics(cancellationToken: CancellationToken = definedExternally): js.array.ReadonlyArray<Diagnostic>
    fun getGlobalDiagnostics(cancellationToken: CancellationToken = definedExternally): js.array.ReadonlyArray<Diagnostic>
    fun getSyntacticDiagnostics(
        sourceFile: SourceFile = definedExternally,
        cancellationToken: CancellationToken = definedExternally,
    ): js.array.ReadonlyArray<DiagnosticWithLocation>

    /** The first time this is called, it will return global diagnostics (no location). */
    fun getSemanticDiagnostics(
        sourceFile: SourceFile = definedExternally,
        cancellationToken: CancellationToken = definedExternally,
    ): js.array.ReadonlyArray<Diagnostic>

    fun getDeclarationDiagnostics(
        sourceFile: SourceFile = definedExternally,
        cancellationToken: CancellationToken = definedExternally,
    ): js.array.ReadonlyArray<DiagnosticWithLocation>

    fun getConfigFileParsingDiagnostics(): js.array.ReadonlyArray<Diagnostic>

    /**
     * Gets a type checker that can be used to semantically analyze source files in the program.
     */
    fun getTypeChecker(): TypeChecker
    fun getNodeCount(): Double
    fun getIdentifierCount(): Double
    fun getSymbolCount(): Double
    fun getTypeCount(): Double
    fun getInstantiationCount(): Double
    fun getRelationCacheSizes(): ProgramGetRelationCacheSizesResult
    fun isSourceFileFromExternalLibrary(file: SourceFile): Boolean
    fun isSourceFileDefaultLibrary(file: SourceFile): Boolean

    /**
     * Calculates the final resolution mode for a given module reference node. This is the resolution mode explicitly provided via import
     * attributes, if present, or the syntax the usage would have if emitted to JavaScript. In `--module node16` or `nodenext`, this may
     * depend on the file's `impliedNodeFormat`. In `--module preserve`, it depends only on the input syntax of the reference. In other
     * `module` modes, when overriding import attributes are not provided, this function returns `undefined`, as the result would have no
     * impact on module resolution, emit, or type checking.
     */
    fun getModeForUsageLocation(file: SourceFile, usage: StringLiteralLike): ResolutionMode

    /**
     * Calculates the final resolution mode for an import at some index within a file's `imports` list. This is the resolution mode
     * explicitly provided via import attributes, if present, or the syntax the usage would have if emitted to JavaScript. In
     * `--module node16` or `nodenext`, this may depend on the file's `impliedNodeFormat`. In `--module preserve`, it depends only on the
     * input syntax of the reference. In other `module` modes, when overriding import attributes are not provided, this function returns
     * `undefined`, as the result would have no impact on module resolution, emit, or type checking.
     */
    fun getModeForResolutionAtIndex(file: SourceFile, index: Double): ResolutionMode
    fun getProjectReferences(): (js.array.ReadonlyArray<ProjectReference>)?
    fun getResolvedProjectReferences(): (js.array.ReadonlyArray<(ResolvedProjectReference?)>)?
}
