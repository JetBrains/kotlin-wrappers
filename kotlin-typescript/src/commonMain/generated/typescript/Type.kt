// Automatically generated - do not modify!

package typescript

sealed external interface Type : FlowType {
    var flags: TypeFlags
    var symbol: Symbol
    var pattern: DestructuringPattern?
    var aliasSymbol: Symbol?
    var aliasTypeArguments: (js.array.ReadonlyArray<Type>)?
    fun getFlags(): TypeFlags
    fun getSymbol(): Symbol?
    fun getProperties(): js.array.ReadonlyArray<Symbol>
    fun getProperty(propertyName: String): Symbol?
    fun getApparentProperties(): js.array.ReadonlyArray<Symbol>
    fun getCallSignatures(): js.array.ReadonlyArray<Signature>
    fun getConstructSignatures(): js.array.ReadonlyArray<Signature>
    fun getStringIndexType(): Type?
    fun getNumberIndexType(): Type?
    fun getBaseTypes(): js.array.ReadonlyArray<BaseType>?
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
    fun isIndexType(): Boolean /* this is IndexType */
}
