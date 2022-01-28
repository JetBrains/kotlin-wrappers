// Automatically generated - do not modify!

package typescript

sealed external interface SourceFile : Declaration {
    override val kind: SyntaxKind.SourceFile
    val statements: NodeArray<Statement>
    val endOfFileToken: Token<SyntaxKind.EndOfFileToken>
    var fileName: String
    var text: String
    var amdDependencies: ReadonlyArray<AmdDependency>
    var moduleName: String?
    var referencedFiles: ReadonlyArray<FileReference>
    var typeReferenceDirectives: ReadonlyArray<FileReference>
    var libReferenceDirectives: ReadonlyArray<FileReference>
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
     * When `module` is `Node12` or `NodeNext`, this field controls whether the
     * source file in question is an ESNext-output-format file, or a CommonJS-output-format
     * module. This is derived by the module resolver as it looks up the file, since
     * it is derived from either the file extension of the module, or the containing
     * `package.json` context, and affects both checking and emit.
     *
     * It is _public_ so that (pre)transformers can set this field,
     * since it switches the builtin `node` module transform. Generally speaking, if unset,
     * the field is treated as though it is `ModuleKind.CommonJS`.
     */
    var impliedNodeFormat: NodeFormat?
    fun getLineAndCharacterOfPosition(pos: Int): LineAndCharacter
    fun getLineEndOfPosition(pos: Int): Int
    fun getLineStarts(): ReadonlyArray<Int>
    fun getPositionOfLineAndCharacter(
        line: Int,
        character: Int,
    ): Int

    fun update(
        newText: String,
        textChangeRange: TextChangeRange,
    ): SourceFile
}
