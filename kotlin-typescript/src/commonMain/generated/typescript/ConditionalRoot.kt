// Automatically generated - do not modify!

package typescript

sealed external interface ConditionalRoot {
    var node: ConditionalTypeNode
    var checkType: Type
    var extendsType: Type
    var isDistributive: Boolean
    var inferTypeParameters: js.array.ReadonlyArray<TypeParameter>?
    var outerTypeParameters: js.array.ReadonlyArray<TypeParameter>?
    var instantiations: js.collections.ReadonlyMap<String, Type>?
    var aliasSymbol: Symbol?
    var aliasTypeArguments: js.array.ReadonlyArray<Type>?
}
