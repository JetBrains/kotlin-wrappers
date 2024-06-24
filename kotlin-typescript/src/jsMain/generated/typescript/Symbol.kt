// Automatically generated - do not modify!

package typescript

sealed external interface Symbol {
    var flags: SymbolFlags
    var escapedName: __String
    var declarations: js.array.ReadonlyArray<Declaration>?
    var valueDeclaration: Declaration?
    var members: SymbolTable?
    var exports: SymbolTable?
    var globalExports: SymbolTable?
    val name: String
    fun getFlags(): SymbolFlags
    fun getEscapedName(): __String
    fun getName(): String
    fun getDeclarations(): js.array.ReadonlyArray<Declaration>?
    fun getDocumentationComment(typeChecker: TypeChecker?): js.array.ReadonlyArray<SymbolDisplayPart>
    fun getJsDocTags(checker: TypeChecker = definedExternally): js.array.ReadonlyArray<JSDocTagInfo>
}
