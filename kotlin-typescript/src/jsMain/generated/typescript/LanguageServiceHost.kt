// Automatically generated - do not modify!

package typescript

import js.promise.Promise

sealed external interface LanguageServiceHost : GetEffectiveTypeRootsHost, MinimalResolutionCacheHost {
    override fun getCompilationSettings(): CompilerOptions
    val getNewLine: (() -> String)?
    val getProjectVersion: (() -> String)?
    fun getScriptFileNames(): js.array.ReadonlyArray<String>
    val getScriptKind: ((fileName: String) -> ScriptKind)?
    fun getScriptVersion(fileName: String): String
    fun getScriptSnapshot(fileName: String): IScriptSnapshot?
    val getProjectReferences: (() -> (js.array.ReadonlyArray<ProjectReference>)?)?
    val getLocalizedDiagnosticMessages: (() -> Any?)?
    val getCancellationToken: (() -> HostCancellationToken)?
    fun getCurrentDirectory(): String
    fun getDefaultLibFileName(options: CompilerOptions): String
    val log: ((s: String) -> Unit)?
    override val trace: ((s: String) -> Unit)?
    val error: ((s: String) -> Unit)?

    @Suppress("PROPERTY_TYPE_MISMATCH_ON_OVERRIDE", "VAR_OVERRIDDEN_BY_VAL")
    override val useCaseSensitiveFileNames: (() -> Boolean)?
    val readDirectory: ((path: String, extensions: (js.array.ReadonlyArray<String>)? /* use undefined for default */, exclude: (js.array.ReadonlyArray<String>)? /* use undefined for default */, include: (js.array.ReadonlyArray<String>)? /* use undefined for default */, depth: Double? /* use undefined for default */) -> js.array.ReadonlyArray<String>)?
    override val realpath: ((path: String) -> String)?
    fun readFile(path: String, encoding: String = definedExternally): String?
    override fun fileExists(fileName: String): Boolean
    val getTypeRootsVersion: (() -> Double)?

    /** @deprecated supply resolveModuleNameLiterals instead for resolution that can handle newer resolution modes like nodenext */
    val resolveModuleNames: ((moduleNames: js.array.ReadonlyArray<String>, containingFile: String, reusedNames: js.array.ReadonlyArray<String>?, redirectedReference: ResolvedProjectReference?, options: CompilerOptions, containingSourceFile: SourceFile? /* use undefined for default */) -> js.array.ReadonlyArray<(ResolvedModule?)>)?
    val getResolvedModuleWithFailedLookupLocationsFromCache: ((modulename: String, containingFile: String, resolutionMode: ResolutionMode /* use undefined for default */) -> ResolvedModuleWithFailedLookupLocations?)?

    /** @deprecated supply resolveTypeReferenceDirectiveReferences instead for resolution that can handle newer resolution modes like nodenext */
    val resolveTypeReferenceDirectives: ((typeDirectiveNames: Any /* string[] | FileReference[] */, containingFile: String, redirectedReference: ResolvedProjectReference?, options: CompilerOptions, containingFileMode: ResolutionMode /* use undefined for default */) -> js.array.ReadonlyArray<(ResolvedTypeReferenceDirective?)>)?
    val resolveModuleNameLiterals: ((moduleLiterals: js.array.ReadonlyArray<StringLiteralLike>, containingFile: String, redirectedReference: ResolvedProjectReference?, options: CompilerOptions, containingSourceFile: SourceFile, reusedNames: (js.array.ReadonlyArray<StringLiteralLike>)?) -> js.array.ReadonlyArray<ResolvedModuleWithFailedLookupLocations>)?
    val resolveTypeReferenceDirectiveReferences: (Function<Any?> /* resolveTypeReferenceDirectiveReferences?<T extends FileReference | string>(typeDirectiveReferences: readonly T[], containingFile: string, redirectedReference: ResolvedProjectReference | undefined, options: CompilerOptions, containingSourceFile: SourceFile | undefined, reusedNames: readonly T[] | undefined): readonly ResolvedTypeReferenceDirectiveWithFailedLookupLocations[]; */)?
    override val getDirectories: ((path: String) -> js.array.ReadonlyArray<String>)?

    /**
     * Gets a set of custom transformers to use during emit.
     */
    val getCustomTransformers: (() -> CustomTransformers?)?
    val isKnownTypesPackageName: ((name: String) -> Boolean)?
    val installPackage: ((options: InstallPackageOptions) -> Promise<ApplyCodeActionCommandResult>)?
    val writeFile: ((fileName: String, content: String) -> Unit)?
    val getParsedCommandLine: ((fileName: String) -> ParsedCommandLine?)?
    var jsDocParsingMode: JSDocParsingMode?
}
