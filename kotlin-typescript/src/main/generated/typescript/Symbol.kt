// Automatically generated - do not modify!

package typescript

external interface Symbol {
    var flags: SymbolFlags
    var escapedName: __String
    var declarations: ReadonlyArray<Declaration>?
    var valueDeclaration: Declaration?
    var members: SymbolTable?
    var exports: SymbolTable?
    var globalExports: SymbolTable?
    val name: String
    fun getFlags(): SymbolFlags
    fun getEscapedName(): __String
    fun getName(): String
    fun getDeclarations(): ReadonlyArray<Declaration>?
    fun getDocumentationComment(typeChecker: TypeChecker?): ReadonlyArray<SymbolDisplayPart>
    fun getJsDocTags(checker: TypeChecker = definedExternally): ReadonlyArray<JSDocTagInfo>
}
