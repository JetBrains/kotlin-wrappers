// Automatically generated - do not modify!

package typescript

import kotlinx.js.ReadonlyArray

sealed external interface TypeChecker {
    fun getTypeOfSymbolAtLocation(
        symbol: Symbol,
        node: Node,
    ): Type

    fun getDeclaredTypeOfSymbol(symbol: Symbol): Type
    fun getPropertiesOfType(type: Type): ReadonlyArray<Symbol>
    fun getPropertyOfType(
        type: Type,
        propertyName: String,
    ): Symbol?

    fun getPrivateIdentifierPropertyOfType(
        leftType: Type,
        name: String,
        location: Node,
    ): Symbol?

    fun getIndexInfoOfType(
        type: Type,
        kind: IndexKind,
    ): IndexInfo?

    fun getIndexInfosOfType(type: Type): ReadonlyArray<IndexInfo>
    fun getSignaturesOfType(
        type: Type,
        kind: SignatureKind,
    ): ReadonlyArray<Signature>

    fun getIndexTypeOfType(
        type: Type,
        kind: IndexKind,
    ): Type?

    fun getBaseTypes(type: InterfaceType): ReadonlyArray<BaseType>
    fun getBaseTypeOfLiteralType(type: Type): Type
    fun getWidenedType(type: Type): Type
    fun getReturnTypeOfSignature(signature: Signature): Type
    fun getNullableType(
        type: Type,
        flags: TypeFlags,
    ): Type

    fun getNonNullableType(type: Type): Type
    fun getTypeArguments(type: TypeReference): ReadonlyArray<Type>

    /** Note that the resulting nodes cannot be checked. */
    fun typeToTypeNode(
        type: Type,
        enclosingDeclaration: Node?,
        flags: NodeBuilderFlags?,
    ): TypeNode?

    /** Note that the resulting nodes cannot be checked. */
    fun signatureToSignatureDeclaration(
        signature: Signature,
        kind: SyntaxKind,
        enclosingDeclaration: Node?,
        flags: NodeBuilderFlags?,
    ): SignatureDeclaration /* SignatureDeclaration & { typeArguments?: NodeArray<TypeNode>; } */?

    /** Note that the resulting nodes cannot be checked. */
    fun indexInfoToIndexSignatureDeclaration(
        indexInfo: IndexInfo,
        enclosingDeclaration: Node?,
        flags: NodeBuilderFlags?,
    ): IndexSignatureDeclaration?

    /** Note that the resulting nodes cannot be checked. */
    fun symbolToEntityName(
        symbol: Symbol,
        meaning: SymbolFlags,
        enclosingDeclaration: Node?,
        flags: NodeBuilderFlags?,
    ): EntityName?

    /** Note that the resulting nodes cannot be checked. */
    fun symbolToExpression(
        symbol: Symbol,
        meaning: SymbolFlags,
        enclosingDeclaration: Node?,
        flags: NodeBuilderFlags?,
    ): Expression?

    /** Note that the resulting nodes cannot be checked. */
    fun symbolToTypeParameterDeclarations(
        symbol: Symbol,
        enclosingDeclaration: Node?,
        flags: NodeBuilderFlags?,
    ): NodeArray<TypeParameterDeclaration>?

    /** Note that the resulting nodes cannot be checked. */
    fun symbolToParameterDeclaration(
        symbol: Symbol,
        enclosingDeclaration: Node?,
        flags: NodeBuilderFlags?,
    ): ParameterDeclaration?

    /** Note that the resulting nodes cannot be checked. */
    fun typeParameterToDeclaration(
        parameter: TypeParameter,
        enclosingDeclaration: Node?,
        flags: NodeBuilderFlags?,
    ): TypeParameterDeclaration?

    fun getSymbolsInScope(
        location: Node,
        meaning: SymbolFlags,
    ): ReadonlyArray<Symbol>

    fun getSymbolAtLocation(node: Node): Symbol?
    fun getSymbolsOfParameterPropertyDeclaration(
        parameter: ParameterDeclaration,
        parameterName: String,
    ): ReadonlyArray<Symbol>

    /**
     * The function returns the value (local variable) symbol of an identifier in the short-hand property assignment.
     * This is necessary as an identifier in short-hand property assignment can contains two meaning: property name and property value.
     */
    fun getShorthandAssignmentValueSymbol(location: Node?): Symbol?
    fun getExportSpecifierLocalTargetSymbol(location: dynamic /* ExportSpecifier | Identifier */): Symbol?

    /**
     * If a symbol is a local symbol with an associated exported symbol, returns the exported symbol.
     * Otherwise returns its input.
     * For example, at `export type T = number;`:
     *     - `getSymbolAtLocation` at the location `T` will return the exported symbol for `T`.
     *     - But the result of `getSymbolsInScope` will contain the *local* symbol for `T`, not the exported symbol.
     *     - Calling `getExportSymbolOfSymbol` on that local symbol will return the exported symbol.
     */
    fun getExportSymbolOfSymbol(symbol: Symbol): Symbol
    fun getPropertySymbolOfDestructuringAssignment(location: Identifier): Symbol?
    fun getTypeOfAssignmentPattern(pattern: AssignmentPattern): Type
    fun getTypeAtLocation(node: Node): Type
    fun getTypeFromTypeNode(node: TypeNode): Type
    fun signatureToString(
        signature: Signature,
        enclosingDeclaration: Node = definedExternally,
        flags: TypeFormatFlags = definedExternally,
        kind: SignatureKind = definedExternally,
    ): String

    fun typeToString(
        type: Type,
        enclosingDeclaration: Node = definedExternally,
        flags: TypeFormatFlags = definedExternally,
    ): String

    fun symbolToString(
        symbol: Symbol,
        enclosingDeclaration: Node = definedExternally,
        meaning: SymbolFlags = definedExternally,
        flags: SymbolFormatFlags = definedExternally,
    ): String

    fun typePredicateToString(
        predicate: TypePredicate,
        enclosingDeclaration: Node = definedExternally,
        flags: TypeFormatFlags = definedExternally,
    ): String

    fun getFullyQualifiedName(symbol: Symbol): String
    fun getAugmentedPropertiesOfType(type: Type): ReadonlyArray<Symbol>
    fun getRootSymbols(symbol: Symbol): ReadonlyArray<Symbol>
    fun getSymbolOfExpando(
        node: Node,
        allowDeclaration: Boolean,
    ): Symbol?

    fun getContextualType(node: Expression): Type?

    /**
     * returns unknownSignature in the case of an error.
     * returns undefined if the node is not valid.
     * @param argumentCount Apparent number of arguments, passed in case of a possibly incomplete call. This should come from an ArgumentListInfo. See `signatureHelp.ts`.
     */
    fun getResolvedSignature(
        node: CallLikeExpression,
        candidatesOutArray: ReadonlyArray<Signature> = definedExternally,
        argumentCount: Int = definedExternally,
    ): Signature?

    fun getSignatureFromDeclaration(declaration: SignatureDeclaration): Signature?
    fun isImplementationOfOverload(node: SignatureDeclaration): Boolean?
    fun isUndefinedSymbol(symbol: Symbol): Boolean
    fun isArgumentsSymbol(symbol: Symbol): Boolean
    fun isUnknownSymbol(symbol: Symbol): Boolean
    fun getConstantValue(node: dynamic /* EnumMember | PropertyAccessExpression | ElementAccessExpression */): dynamic /* string | number */
    fun isValidPropertyAccess(
        node: dynamic, /* PropertyAccessExpression | QualifiedName | ImportTypeNode */
        propertyName: String,
    ): Boolean

    /** Follow all aliases to get the original symbol. */
    fun getAliasedSymbol(symbol: Symbol): Symbol

    /** Follow a *single* alias to get the immediately aliased symbol. */
    fun getImmediateAliasedSymbol(symbol: Symbol): Symbol?
    fun getExportsOfModule(moduleSymbol: Symbol): ReadonlyArray<Symbol>
    fun getJsxIntrinsicTagNamesAt(location: Node): ReadonlyArray<Symbol>
    fun isOptionalParameter(node: ParameterDeclaration): Boolean
    fun getAmbientModules(): ReadonlyArray<Symbol>
    fun tryGetMemberInModuleExports(
        memberName: String,
        moduleSymbol: Symbol,
    ): Symbol?

    fun getApparentType(type: Type): Type
    fun getBaseConstraintOfType(type: Type): Type?
    fun getDefaultFromTypeParameter(type: Type): Type?
    fun getTypePredicateOfSignature(signature: Signature): TypePredicate?

    /**
     * Depending on the operation performed, it may be appropriate to throw away the checker
     * if the cancellation token is triggered. Typically, if it is used for error checking
     * and the operation is cancelled, then it should be discarded, otherwise it is safe to keep.
     */
    fun <T> runWithCancellationToken(
        token: CancellationToken,
        cb: (checker: TypeChecker) -> T,
    ): T
}
