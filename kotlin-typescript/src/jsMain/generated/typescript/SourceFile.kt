// Automatically generated - do not modify!

package typescript

sealed external interface SourceFile : Declaration, LocalsContainer, BlockLike, ModuleDeclarationParent,
    ImportEqualsDeclarationParent, ImportDeclarationParent, ExportDeclarationParent,
    RequiredAffectedFileResultAffected {
    override val kind: SyntaxKind.SourceFile
    val statements: NodeArray<Statement>
    val endOfFileToken: Token<SyntaxKind.EndOfFileToken>
    var fileName: String
    var text: String
    var amdDependencies: js.array.ReadonlyArray<AmdDependency>
    var moduleName: String?
    var referencedFiles: js.array.ReadonlyArray<FileReference>
    var typeReferenceDirectives: js.array.ReadonlyArray<FileReference>
    var libReferenceDirectives: js.array.ReadonlyArray<FileReference>
    var languageVariant: LanguageVariant
    var isDeclarationFile: Boolean

    /**
     * lib.d.ts should have a reference comment like
     *
     *  /// <reference no-default-lib="true"/>
     *
     * If any other file has this comment, it signals not to include lib.d.ts
     * because this containing file is intended to act as a default library.
     */
    var hasNoDefaultLib: Boolean
    var languageVersion: ScriptTarget

    /**
     * When `module` is `Node16` or `NodeNext`, this field controls whether the
     * source file in question is an ESNext-output-format file, or a CommonJS-output-format
     * module. This is derived by the module resolver as it looks up the file, since
     * it is derived from either the file extension of the module, or the containing
     * `package.json` context, and affects both checking and emit.
     *
     * It is _public_ so that (pre)transformers can set this field,
     * since it switches the builtin `node` module transform. Generally speaking, if unset,
     * the field is treated as though it is `ModuleKind.CommonJS`.
     *
     * Note that this field is only set by the module resolution process when
     * `moduleResolution` is `Node16` or `NodeNext`, which is implied by the `module` setting
     * of `Node16` or `NodeNext`, respectively, but may be overriden (eg, by a `moduleResolution`
     * of `node`). If so, this field will be unset and source files will be considered to be
     * CommonJS-output-format by the node module transformer and type checker, regardless of extension or context.
     */
    var impliedNodeFormat: ResolutionMode
    fun getLineAndCharacterOfPosition(pos: Double): LineAndCharacter
    fun getLineEndOfPosition(pos: Double): Double
    fun getLineStarts(): js.array.ReadonlyArray<Double>
    fun getPositionOfLineAndCharacter(line: Double, character: Double): Double
    fun update(newText: String, textChangeRange: TextChangeRange): SourceFile
}
