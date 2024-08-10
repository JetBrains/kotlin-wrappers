// Automatically generated - do not modify!

package typescript

sealed external interface ProgramHost<T : BuilderProgram> {
    /**
     * Used to create the program when need for program creation or recreation detected
     */
    var createProgram: CreateProgram<T>
    fun useCaseSensitiveFileNames(): Boolean
    fun getNewLine(): String
    fun getCurrentDirectory(): String
    fun getDefaultLibFileName(options: CompilerOptions): String
    val getDefaultLibLocation: (() -> String)?
    val createHash: ((data: String) -> String)?

    /**
     * Use to check file presence for source files and
     * if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well
     */
    fun fileExists(path: String): Boolean

    /**
     * Use to read file text for source files and
     * if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well
     */
    fun readFile(path: String, encoding: String = definedExternally): String?

    /** If provided, used for module resolution as well as to handle directory structure */
    val directoryExists: ((path: String) -> Boolean)?

    /** If provided, used in resolutions as well as handling directory structure */
    val getDirectories: ((path: String) -> js.array.ReadonlyArray<String>)?

    /** If provided, used to cache and handle directory structure modifications */
    val readDirectory: ((path: String, extensions: (js.array.ReadonlyArray<String>)? /* use undefined for default */, exclude: (js.array.ReadonlyArray<String>)? /* use undefined for default */, include: (js.array.ReadonlyArray<String>)? /* use undefined for default */, depth: Double? /* use undefined for default */) -> js.array.ReadonlyArray<String>)?

    /** Symbol links resolution */
    val realpath: ((path: String) -> String)?

    /** If provided would be used to write log about compilation */
    val trace: ((s: String) -> Unit)?

    /** If provided is used to get the environment variable */
    val getEnvironmentVariable: ((name: String) -> String?)?

    /**
     * @deprecated supply resolveModuleNameLiterals instead for resolution that can handle newer resolution modes like nodenext
     *
     * If provided, used to resolve the module names, otherwise typescript's default module resolution
     */
    val resolveModuleNames: ((moduleNames: js.array.ReadonlyArray<String>, containingFile: String, reusedNames: js.array.ReadonlyArray<String>?, redirectedReference: ResolvedProjectReference?, options: CompilerOptions, containingSourceFile: SourceFile? /* use undefined for default */) -> js.array.ReadonlyArray<(ResolvedModule?)>)?

    /**
     * @deprecated supply resolveTypeReferenceDirectiveReferences instead for resolution that can handle newer resolution modes like nodenext
     *
     * If provided, used to resolve type reference directives, otherwise typescript's default resolution
     */
    val resolveTypeReferenceDirectives: ((typeReferenceDirectiveNames: Any /* string[] | readonly FileReference[] */, containingFile: String, redirectedReference: ResolvedProjectReference?, options: CompilerOptions, containingFileMode: ResolutionMode /* use undefined for default */) -> js.array.ReadonlyArray<(ResolvedTypeReferenceDirective?)>)?
    val resolveModuleNameLiterals: ((moduleLiterals: js.array.ReadonlyArray<StringLiteralLike>, containingFile: String, redirectedReference: ResolvedProjectReference?, options: CompilerOptions, containingSourceFile: SourceFile, reusedNames: (js.array.ReadonlyArray<StringLiteralLike>)?) -> js.array.ReadonlyArray<ResolvedModuleWithFailedLookupLocations>)?
    val resolveTypeReferenceDirectiveReferences: (Function<Any?> /* resolveTypeReferenceDirectiveReferences?<T extends FileReference | string>(typeDirectiveReferences: readonly T[], containingFile: string, redirectedReference: ResolvedProjectReference | undefined, options: CompilerOptions, containingSourceFile: SourceFile | undefined, reusedNames: readonly T[] | undefined): readonly ResolvedTypeReferenceDirectiveWithFailedLookupLocations[]; */)?

    /** If provided along with custom resolveModuleNames or resolveTypeReferenceDirectives, used to determine if unchanged file path needs to re-resolve modules/type reference directives */
    val hasInvalidatedResolutions: ((filePath: Path) -> Boolean)?

    /**
     * Returns the module resolution cache used by a provided `resolveModuleNames` implementation so that any non-name module resolution operations (eg, package.json lookup) can reuse it
     */
    val getModuleResolutionCache: (() -> ModuleResolutionCache?)?
    var jsDocParsingMode: JSDocParsingMode?
}
