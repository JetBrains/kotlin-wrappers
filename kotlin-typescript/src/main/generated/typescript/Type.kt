// Automatically generated - do not modify!

package typescript

sealed external interface Type {
    var flags: TypeFlags
    var symbol: Symbol
    var pattern: DestructuringPattern?
    var aliasSymbol: Symbol?
    var aliasTypeArguments: ReadonlyArray<Type>?
    fun getFlags(): TypeFlags
    fun getSymbol(): Symbol?
    fun getProperties(): ReadonlyArray<Symbol>
    fun getProperty(propertyName: String): Symbol?
    fun getApparentProperties(): ReadonlyArray<Symbol>
    fun getCallSignatures(): ReadonlyArray<Signature>
    fun getConstructSignatures(): ReadonlyArray<Signature>
    fun getStringIndexType(): Type?
    fun getNumberIndexType(): Type?
    fun getBaseTypes(): ReadonlyArray<BaseType>?
    fun getNonNullableType(): Type
    fun getConstraint(): Type?
    fun getDefault(): Type?
    fun isUnion(): Boolean /* this is UnionType */
    fun isIntersection(): Boolean /* this is IntersectionType */
    fun isUnionOrIntersection(): Boolean /* this is UnionOrIntersectionType */
    fun isLiteral(): Boolean /* this is LiteralType */
    fun isStringLiteral(): Boolean /* this is StringLiteralType */
    fun isNumberLiteral(): Boolean /* this is NumberLiteralType */
    fun isTypeParameter(): Boolean /* this is TypeParameter */
    fun isClassOrInterface(): Boolean /* this is InterfaceType */
    fun isClass(): Boolean /* this is InterfaceType */
}
