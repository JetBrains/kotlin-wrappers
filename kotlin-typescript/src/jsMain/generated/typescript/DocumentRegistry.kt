// Automatically generated - do not modify!

package typescript

/**
 * The document registry represents a store of SourceFile objects that can be shared between
 * multiple LanguageService instances. A LanguageService instance holds on the SourceFile (AST)
 * of files in the context.
 * SourceFile objects account for most of the memory usage by the language service. Sharing
 * the same DocumentRegistry instance between different instances of LanguageService allow
 * for more efficient memory utilization since all projects will share at least the library
 * file (lib.d.ts).
 *
 * A more advanced use of the document registry is to serialize sourceFile objects to disk
 * and re-hydrate them when needed.
 *
 * To create a default DocumentRegistry, use createDocumentRegistry to create one, and pass it
 * to all subsequent createLanguageService calls.
 */
sealed external interface DocumentRegistry {
    /**
     * Request a stored SourceFile with a given fileName and compilationSettings.
     * The first call to acquire will call createLanguageServiceSourceFile to generate
     * the SourceFile if was not found in the registry.
     *
     * @param fileName The name of the file requested
     * @param compilationSettingsOrHost Some compilation settings like target affects the
     * shape of a the resulting SourceFile. This allows the DocumentRegistry to store
     * multiple copies of the same file for different compilation settings. A minimal
     * resolution cache is needed to fully define a source file's shape when
     * the compilation settings include `module: node16`+, so providing a cache host
     * object should be preferred. A common host is a language service `ConfiguredProject`.
     * @param scriptSnapshot Text of the file. Only used if the file was not found
     * in the registry and a new one was created.
     * @param version Current version of the file. Only used if the file was not found
     * in the registry and a new one was created.
     */
    fun acquireDocument(
        fileName: String,
        compilationSettingsOrHost: CompilerOptions,
        scriptSnapshot: IScriptSnapshot,
        version: String,
        scriptKind: ScriptKind = definedExternally,
        sourceFileOptions: CreateSourceFileOptions = definedExternally,
    ): SourceFile

    /**
     * Request a stored SourceFile with a given fileName and compilationSettings.
     * The first call to acquire will call createLanguageServiceSourceFile to generate
     * the SourceFile if was not found in the registry.
     *
     * @param fileName The name of the file requested
     * @param compilationSettingsOrHost Some compilation settings like target affects the
     * shape of a the resulting SourceFile. This allows the DocumentRegistry to store
     * multiple copies of the same file for different compilation settings. A minimal
     * resolution cache is needed to fully define a source file's shape when
     * the compilation settings include `module: node16`+, so providing a cache host
     * object should be preferred. A common host is a language service `ConfiguredProject`.
     * @param scriptSnapshot Text of the file. Only used if the file was not found
     * in the registry and a new one was created.
     * @param version Current version of the file. Only used if the file was not found
     * in the registry and a new one was created.
     */
    fun acquireDocument(
        fileName: String,
        compilationSettingsOrHost: CompilerOptions,
        scriptSnapshot: IScriptSnapshot,
        version: String,
        scriptKind: ScriptKind = definedExternally,
        sourceFileOptions: ScriptTarget = definedExternally,
    ): SourceFile

    /**
     * Request a stored SourceFile with a given fileName and compilationSettings.
     * The first call to acquire will call createLanguageServiceSourceFile to generate
     * the SourceFile if was not found in the registry.
     *
     * @param fileName The name of the file requested
     * @param compilationSettingsOrHost Some compilation settings like target affects the
     * shape of a the resulting SourceFile. This allows the DocumentRegistry to store
     * multiple copies of the same file for different compilation settings. A minimal
     * resolution cache is needed to fully define a source file's shape when
     * the compilation settings include `module: node16`+, so providing a cache host
     * object should be preferred. A common host is a language service `ConfiguredProject`.
     * @param scriptSnapshot Text of the file. Only used if the file was not found
     * in the registry and a new one was created.
     * @param version Current version of the file. Only used if the file was not found
     * in the registry and a new one was created.
     */
    fun acquireDocument(
        fileName: String,
        compilationSettingsOrHost: MinimalResolutionCacheHost,
        scriptSnapshot: IScriptSnapshot,
        version: String,
        scriptKind: ScriptKind = definedExternally,
        sourceFileOptions: CreateSourceFileOptions = definedExternally,
    ): SourceFile

    /**
     * Request a stored SourceFile with a given fileName and compilationSettings.
     * The first call to acquire will call createLanguageServiceSourceFile to generate
     * the SourceFile if was not found in the registry.
     *
     * @param fileName The name of the file requested
     * @param compilationSettingsOrHost Some compilation settings like target affects the
     * shape of a the resulting SourceFile. This allows the DocumentRegistry to store
     * multiple copies of the same file for different compilation settings. A minimal
     * resolution cache is needed to fully define a source file's shape when
     * the compilation settings include `module: node16`+, so providing a cache host
     * object should be preferred. A common host is a language service `ConfiguredProject`.
     * @param scriptSnapshot Text of the file. Only used if the file was not found
     * in the registry and a new one was created.
     * @param version Current version of the file. Only used if the file was not found
     * in the registry and a new one was created.
     */
    fun acquireDocument(
        fileName: String,
        compilationSettingsOrHost: MinimalResolutionCacheHost,
        scriptSnapshot: IScriptSnapshot,
        version: String,
        scriptKind: ScriptKind = definedExternally,
        sourceFileOptions: ScriptTarget = definedExternally,
    ): SourceFile

    fun acquireDocumentWithKey(
        fileName: String,
        path: Path,
        compilationSettingsOrHost: CompilerOptions,
        key: DocumentRegistryBucketKey,
        scriptSnapshot: IScriptSnapshot,
        version: String,
        scriptKind: ScriptKind = definedExternally,
        sourceFileOptions: CreateSourceFileOptions = definedExternally,
    ): SourceFile

    fun acquireDocumentWithKey(
        fileName: String,
        path: Path,
        compilationSettingsOrHost: CompilerOptions,
        key: DocumentRegistryBucketKey,
        scriptSnapshot: IScriptSnapshot,
        version: String,
        scriptKind: ScriptKind = definedExternally,
        sourceFileOptions: ScriptTarget = definedExternally,
    ): SourceFile

    fun acquireDocumentWithKey(
        fileName: String,
        path: Path,
        compilationSettingsOrHost: MinimalResolutionCacheHost,
        key: DocumentRegistryBucketKey,
        scriptSnapshot: IScriptSnapshot,
        version: String,
        scriptKind: ScriptKind = definedExternally,
        sourceFileOptions: CreateSourceFileOptions = definedExternally,
    ): SourceFile

    fun acquireDocumentWithKey(
        fileName: String,
        path: Path,
        compilationSettingsOrHost: MinimalResolutionCacheHost,
        key: DocumentRegistryBucketKey,
        scriptSnapshot: IScriptSnapshot,
        version: String,
        scriptKind: ScriptKind = definedExternally,
        sourceFileOptions: ScriptTarget = definedExternally,
    ): SourceFile

    /**
     * Request an updated version of an already existing SourceFile with a given fileName
     * and compilationSettings. The update will in-turn call updateLanguageServiceSourceFile
     * to get an updated SourceFile.
     *
     * @param fileName The name of the file requested
     * @param compilationSettingsOrHost Some compilation settings like target affects the
     * shape of a the resulting SourceFile. This allows the DocumentRegistry to store
     * multiple copies of the same file for different compilation settings. A minimal
     * resolution cache is needed to fully define a source file's shape when
     * the compilation settings include `module: node16`+, so providing a cache host
     * object should be preferred. A common host is a language service `ConfiguredProject`.
     * @param scriptSnapshot Text of the file.
     * @param version Current version of the file.
     */
    fun updateDocument(
        fileName: String,
        compilationSettingsOrHost: CompilerOptions,
        scriptSnapshot: IScriptSnapshot,
        version: String,
        scriptKind: ScriptKind = definedExternally,
        sourceFileOptions: CreateSourceFileOptions = definedExternally,
    ): SourceFile

    /**
     * Request an updated version of an already existing SourceFile with a given fileName
     * and compilationSettings. The update will in-turn call updateLanguageServiceSourceFile
     * to get an updated SourceFile.
     *
     * @param fileName The name of the file requested
     * @param compilationSettingsOrHost Some compilation settings like target affects the
     * shape of a the resulting SourceFile. This allows the DocumentRegistry to store
     * multiple copies of the same file for different compilation settings. A minimal
     * resolution cache is needed to fully define a source file's shape when
     * the compilation settings include `module: node16`+, so providing a cache host
     * object should be preferred. A common host is a language service `ConfiguredProject`.
     * @param scriptSnapshot Text of the file.
     * @param version Current version of the file.
     */
    fun updateDocument(
        fileName: String,
        compilationSettingsOrHost: CompilerOptions,
        scriptSnapshot: IScriptSnapshot,
        version: String,
        scriptKind: ScriptKind = definedExternally,
        sourceFileOptions: ScriptTarget = definedExternally,
    ): SourceFile

    /**
     * Request an updated version of an already existing SourceFile with a given fileName
     * and compilationSettings. The update will in-turn call updateLanguageServiceSourceFile
     * to get an updated SourceFile.
     *
     * @param fileName The name of the file requested
     * @param compilationSettingsOrHost Some compilation settings like target affects the
     * shape of a the resulting SourceFile. This allows the DocumentRegistry to store
     * multiple copies of the same file for different compilation settings. A minimal
     * resolution cache is needed to fully define a source file's shape when
     * the compilation settings include `module: node16`+, so providing a cache host
     * object should be preferred. A common host is a language service `ConfiguredProject`.
     * @param scriptSnapshot Text of the file.
     * @param version Current version of the file.
     */
    fun updateDocument(
        fileName: String,
        compilationSettingsOrHost: MinimalResolutionCacheHost,
        scriptSnapshot: IScriptSnapshot,
        version: String,
        scriptKind: ScriptKind = definedExternally,
        sourceFileOptions: CreateSourceFileOptions = definedExternally,
    ): SourceFile

    /**
     * Request an updated version of an already existing SourceFile with a given fileName
     * and compilationSettings. The update will in-turn call updateLanguageServiceSourceFile
     * to get an updated SourceFile.
     *
     * @param fileName The name of the file requested
     * @param compilationSettingsOrHost Some compilation settings like target affects the
     * shape of a the resulting SourceFile. This allows the DocumentRegistry to store
     * multiple copies of the same file for different compilation settings. A minimal
     * resolution cache is needed to fully define a source file's shape when
     * the compilation settings include `module: node16`+, so providing a cache host
     * object should be preferred. A common host is a language service `ConfiguredProject`.
     * @param scriptSnapshot Text of the file.
     * @param version Current version of the file.
     */
    fun updateDocument(
        fileName: String,
        compilationSettingsOrHost: MinimalResolutionCacheHost,
        scriptSnapshot: IScriptSnapshot,
        version: String,
        scriptKind: ScriptKind = definedExternally,
        sourceFileOptions: ScriptTarget = definedExternally,
    ): SourceFile

    fun updateDocumentWithKey(
        fileName: String,
        path: Path,
        compilationSettingsOrHost: CompilerOptions,
        key: DocumentRegistryBucketKey,
        scriptSnapshot: IScriptSnapshot,
        version: String,
        scriptKind: ScriptKind = definedExternally,
        sourceFileOptions: CreateSourceFileOptions = definedExternally,
    ): SourceFile

    fun updateDocumentWithKey(
        fileName: String,
        path: Path,
        compilationSettingsOrHost: CompilerOptions,
        key: DocumentRegistryBucketKey,
        scriptSnapshot: IScriptSnapshot,
        version: String,
        scriptKind: ScriptKind = definedExternally,
        sourceFileOptions: ScriptTarget = definedExternally,
    ): SourceFile

    fun updateDocumentWithKey(
        fileName: String,
        path: Path,
        compilationSettingsOrHost: MinimalResolutionCacheHost,
        key: DocumentRegistryBucketKey,
        scriptSnapshot: IScriptSnapshot,
        version: String,
        scriptKind: ScriptKind = definedExternally,
        sourceFileOptions: CreateSourceFileOptions = definedExternally,
    ): SourceFile

    fun updateDocumentWithKey(
        fileName: String,
        path: Path,
        compilationSettingsOrHost: MinimalResolutionCacheHost,
        key: DocumentRegistryBucketKey,
        scriptSnapshot: IScriptSnapshot,
        version: String,
        scriptKind: ScriptKind = definedExternally,
        sourceFileOptions: ScriptTarget = definedExternally,
    ): SourceFile

    fun getKeyForCompilationSettings(settings: CompilerOptions): DocumentRegistryBucketKey

    /**
     * Informs the DocumentRegistry that a file is not needed any longer.
     *
     * Note: It is not allowed to call release on a SourceFile that was not acquired from
     * this registry originally.
     *
     * @param fileName The name of the file to be released
     * @param compilationSettings The compilation settings used to acquire the file
     * @param scriptKind The script kind of the file to be released
     *
     * @deprecated pass scriptKind and impliedNodeFormat for correctness
     */
    fun releaseDocument(
        fileName: String,
        compilationSettings: CompilerOptions,
        scriptKind: ScriptKind = definedExternally,
    ): Unit

    /**
     * Informs the DocumentRegistry that a file is not needed any longer.
     *
     * Note: It is not allowed to call release on a SourceFile that was not acquired from
     * this registry originally.
     *
     * @param fileName The name of the file to be released
     * @param compilationSettings The compilation settings used to acquire the file
     * @param scriptKind The script kind of the file to be released
     * @param impliedNodeFormat The implied source file format of the file to be released
     */
    fun releaseDocument(
        fileName: String,
        compilationSettings: CompilerOptions,
        scriptKind: ScriptKind,
        impliedNodeFormat: ResolutionMode,
    ): Unit

    /**
     * @deprecated pass scriptKind for and impliedNodeFormat correctness */
    fun releaseDocumentWithKey(
        path: Path,
        key: DocumentRegistryBucketKey,
        scriptKind: ScriptKind = definedExternally,
    ): Unit

    fun releaseDocumentWithKey(
        path: Path,
        key: DocumentRegistryBucketKey,
        scriptKind: ScriptKind,
        impliedNodeFormat: ResolutionMode,
    ): Unit

    fun reportStats(): String
}
