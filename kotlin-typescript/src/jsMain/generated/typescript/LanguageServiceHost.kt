// Automatically generated - do not modify!

package typescript

import js.array.ReadonlyArray

sealed external interface LanguageServiceHost : GetEffectiveTypeRootsHost, MinimalResolutionCacheHost {
    override fun getCompilationSettings(): CompilerOptions
    val getNewLine: (() -> String)?
    val getProjectVersion: (() -> String)?
    fun getScriptFileNames(): ReadonlyArray<String>
    val getScriptKind: ((fileName: String) -> ScriptKind)?
    fun getScriptVersion(fileName: String): String
    fun getScriptSnapshot(fileName: String): IScriptSnapshot?
    val getProjectReferences: (() -> ReadonlyArray<ProjectReference>?)?
    val getLocalizedDiagnosticMessages: (() -> Any)?
    val getCancellationToken: (() -> HostCancellationToken)?
    fun getCurrentDirectory(): String
    fun getDefaultLibFileName(options: CompilerOptions): String
    val log: ((s: String) -> Unit)?
    override val trace: ((s: String) -> Unit)?
    val error: ((s: String) -> Unit)?
    override /* val */ var useCaseSensitiveFileNames: (() -> Boolean)?
    val readDirectory: ((
        path: String,
        extensions: ReadonlyArray<String>?,
        exclude: ReadonlyArray<String>?,
        include: ReadonlyArray<String>?,
        depth: Int?,
    ) -> ReadonlyArray<String>)?
    override val realpath: ((path: String) -> String)?
    fun readFile(
        path: String,
        encoding: String = definedExternally,
    ): String?

    override fun fileExists(path: String): Boolean
    val getTypeRootsVersion: (() -> Int)?
    val getResolvedModuleWithFailedLookupLocationsFromCache: ((
        modulename: String,
        containingFile: String,
        resolutionMode: ResolutionMode?,
    ) -> ResolvedModuleWithFailedLookupLocations?)?
    val resolveModuleNameLiterals: ((
        moduleLiterals: ReadonlyArray<StringLiteralLike>,
        containingFile: String,
        redirectedReference: ResolvedProjectReference?,
        options: CompilerOptions,
        containingSourceFile: SourceFile,
        reusedNames: ReadonlyArray<StringLiteralLike>?,
    ) -> ReadonlyArray<ResolvedModuleWithFailedLookupLocations>)?
    val resolveTypeReferenceDirectiveReferences: ((
        typeDirectiveReferences: ReadonlyArray<Any /* T (FileReference | string) */>,
        containingFile: String,
        redirectedReference: ResolvedProjectReference?,
        options: CompilerOptions,
        containingSourceFile: SourceFile?,
        reusedNames: ReadonlyArray<Any /* T (FileReference | string) */>?,
    ) -> ReadonlyArray<ResolvedTypeReferenceDirectiveWithFailedLookupLocations>)?
    override val getDirectories: ((directoryName: String) -> ReadonlyArray<String>)?

    /**
     * Gets a set of custom transformers to use during emit.
     */
    val getCustomTransformers: (() -> CustomTransformers?)?
    val isKnownTypesPackageName: ((name: String) -> Boolean)?
    val installPackage: ((options: InstallPackageOptions) -> js.promise.Promise<ApplyCodeActionCommandResult>)?
    val writeFile: ((
        fileName: String,
        content: String,
    ) -> Unit)?
    val getParsedCommandLine: ((fileName: String) -> ParsedCommandLine?)?
    var jsDocParsingMode: JSDocParsingMode?
}
