// Automatically generated - do not modify!

package typescript

sealed external interface CompilerOptions {
    var allowImportingTsExtensions: Boolean?
    var allowJs: Boolean?
    var allowArbitraryExtensions: Boolean?
    var allowSyntheticDefaultImports: Boolean?
    var allowUmdGlobalAccess: Boolean?
    var allowUnreachableCode: Boolean?
    var allowUnusedLabels: Boolean?
    var alwaysStrict: Boolean?

    /** @deprecated */
    var baseUrl: String?

    /** @deprecated */
    var charset: String?
    var checkJs: Boolean?
    var customConditions: js.array.ReadonlyArray<String>?
    var declaration: Boolean?
    var declarationMap: Boolean?
    var emitDeclarationOnly: Boolean?
    var declarationDir: String?
    var disableSizeLimit: Boolean?
    var disableSourceOfProjectReferenceRedirect: Boolean?
    var disableSolutionSearching: Boolean?
    var disableReferencedProjectLoad: Boolean?

    /** @deprecated */
    var downlevelIteration: Boolean?
    var emitBOM: Boolean?
    var emitDecoratorMetadata: Boolean?
    var exactOptionalPropertyTypes: Boolean?
    var experimentalDecorators: Boolean?
    var forceConsistentCasingInFileNames: Boolean?
    var ignoreDeprecations: String?
    var importHelpers: Boolean?

    /** @deprecated */
    var importsNotUsedAsValues: ImportsNotUsedAsValues?
    var inlineSourceMap: Boolean?
    var inlineSources: Boolean?
    var isolatedModules: Boolean?
    var isolatedDeclarations: Boolean?
    var jsx: JsxEmit?

    /** @deprecated */
    var keyofStringsOnly: Boolean?
    var lib: js.array.ReadonlyArray<String>?
    var libReplacement: Boolean?
    var locale: String?
    var mapRoot: String?
    var maxNodeModuleJsDepth: Double?
    var module: ModuleKind?
    var moduleResolution: ModuleResolutionKind?
    var moduleSuffixes: js.array.ReadonlyArray<String>?
    var moduleDetection: ModuleDetectionKind?
    var newLine: NewLineKind?
    var noEmit: Boolean?
    var noCheck: Boolean?
    var noEmitHelpers: Boolean?
    var noEmitOnError: Boolean?
    var noErrorTruncation: Boolean?
    var noFallthroughCasesInSwitch: Boolean?
    var noImplicitAny: Boolean?
    var noImplicitReturns: Boolean?
    var noImplicitThis: Boolean?

    /** @deprecated */
    var noStrictGenericChecks: Boolean?
    var noUnusedLocals: Boolean?
    var noUnusedParameters: Boolean?

    /** @deprecated */
    var noImplicitUseStrict: Boolean?
    var noPropertyAccessFromIndexSignature: Boolean?
    var assumeChangesOnlyAffectDirectDependencies: Boolean?
    var noLib: Boolean?
    var noResolve: Boolean?
    var noUncheckedIndexedAccess: Boolean?

    /** @deprecated */
    var out: String?
    var outDir: String?
    var outFile: String?
    var paths: MapLike<js.array.ReadonlyArray<String>>?
    var preserveConstEnums: Boolean?
    var noImplicitOverride: Boolean?
    var preserveSymlinks: Boolean?

    /** @deprecated */
    var preserveValueImports: Boolean?
    var project: String?
    var reactNamespace: String?
    var jsxFactory: String?
    var jsxFragmentFactory: String?
    var jsxImportSource: String?
    var composite: Boolean?
    var incremental: Boolean?
    var tsBuildInfoFile: String?
    var removeComments: Boolean?
    var resolvePackageJsonExports: Boolean?
    var resolvePackageJsonImports: Boolean?
    var rewriteRelativeImportExtensions: Boolean?
    var rootDir: String?
    var rootDirs: js.array.ReadonlyArray<String>?
    var skipLibCheck: Boolean?
    var skipDefaultLibCheck: Boolean?
    var sourceMap: Boolean?
    var sourceRoot: String?
    var strict: Boolean?
    var strictFunctionTypes: Boolean?
    var strictBindCallApply: Boolean?
    var strictNullChecks: Boolean?
    var strictPropertyInitialization: Boolean?
    var strictBuiltinIteratorReturn: Boolean?
    var stripInternal: Boolean?

    /** @deprecated */
    var suppressExcessPropertyErrors: Boolean?

    /** @deprecated */
    var suppressImplicitAnyIndexErrors: Boolean?
    var target: ScriptTarget?
    var traceResolution: Boolean?
    var useUnknownInCatchVariables: Boolean?
    var noUncheckedSideEffectImports: Boolean?
    var resolveJsonModule: Boolean?
    var types: js.array.ReadonlyArray<String>?

    /** Paths used to compute primary types search locations */
    var typeRoots: js.array.ReadonlyArray<String>?
    var verbatimModuleSyntax: Boolean?
    var erasableSyntaxOnly: Boolean?
    var esModuleInterop: Boolean?
    var useDefineForClassFields: Boolean?

    operator fun get(key: String): Any? // CompilerOptionsValue | TsConfigSourceFile | undefined

    operator fun set(key: String, value: Any? /* CompilerOptionsValue | TsConfigSourceFile | undefined */)
}
