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
     * Calculates the final resolution mode for a given module reference node. This function only returns a result when module resolution
     * settings allow differing resolution between ESM imports and CJS requires, or when a mode is explicitly provided via import attributes,
     * which cause an `import` or `require` condition to be used during resolution regardless of module resolution settings. In absence of
     * overriding attributes, and in modes that support differing resolution, the result indicates the syntax the usage would emit to JavaScript.
     * Some examples:
     *
     * ```ts
     * // tsc foo.mts --module nodenext
     * import {} from "mod";
     * // Result: ESNext - the import emits as ESM due to `impliedNodeFormat` set by .mts file extension
     *
     * // tsc foo.cts --module nodenext
     * import {} from "mod";
     * // Result: CommonJS - the import emits as CJS due to `impliedNodeFormat` set by .cts file extension
     *
     * // tsc foo.ts --module preserve --moduleResolution bundler
     * import {} from "mod";
     * // Result: ESNext - the import emits as ESM due to `--module preserve` and `--moduleResolution bundler`
     * // supports conditional imports/exports
     *
     * // tsc foo.ts --module preserve --moduleResolution node10
     * import {} from "mod";
     * // Result: undefined - the import emits as ESM due to `--module preserve`, but `--moduleResolution node10`
     * // does not support conditional imports/exports
     *
     * // tsc foo.ts --module commonjs --moduleResolution node10
     * import type {} from "mod" with { "resolution-mode": "import" };
     * // Result: ESNext - conditional imports/exports always supported with "resolution-mode" attribute
     * ```
     */
    fun getModeForUsageLocation(file: SourceFile, usage: StringLiteralLike): ResolutionMode

    /**
     * Calculates the final resolution mode for an import at some index within a file's `imports` list. This function only returns a result
     * when module resolution settings allow differing resolution between ESM imports and CJS requires, or when a mode is explicitly provided
     * via import attributes, which cause an `import` or `require` condition to be used during resolution regardless of module resolution
     * settings. In absence of overriding attributes, and in modes that support differing resolution, the result indicates the syntax the
     * usage would emit to JavaScript. Some examples:
     *
     * ```ts
     * // tsc foo.mts --module nodenext
     * import {} from "mod";
     * // Result: ESNext - the import emits as ESM due to `impliedNodeFormat` set by .mts file extension
     *
     * // tsc foo.cts --module nodenext
     * import {} from "mod";
     * // Result: CommonJS - the import emits as CJS due to `impliedNodeFormat` set by .cts file extension
     *
     * // tsc foo.ts --module preserve --moduleResolution bundler
     * import {} from "mod";
     * // Result: ESNext - the import emits as ESM due to `--module preserve` and `--moduleResolution bundler`
     * // supports conditional imports/exports
     *
     * // tsc foo.ts --module preserve --moduleResolution node10
     * import {} from "mod";
     * // Result: undefined - the import emits as ESM due to `--module preserve`, but `--moduleResolution node10`
     * // does not support conditional imports/exports
     *
     * // tsc foo.ts --module commonjs --moduleResolution node10
     * import type {} from "mod" with { "resolution-mode": "import" };
     * // Result: ESNext - conditional imports/exports always supported with "resolution-mode" attribute
     * ```
     */
    fun getModeForResolutionAtIndex(file: SourceFile, index: Double): ResolutionMode
    fun getProjectReferences(): (js.array.ReadonlyArray<ProjectReference>)?
    fun getResolvedProjectReferences(): (js.array.ReadonlyArray<(ResolvedProjectReference?)>)?
}
