// Automatically generated - do not modify!

package typescript

import kotlinx.js.ReadonlyArray

sealed external interface ConditionalRoot {
    var node: ConditionalTypeNode
    var checkType: Type
    var extendsType: Type
    var isDistributive: Boolean
    var inferTypeParameters: ReadonlyArray<TypeParameter>?
    var outerTypeParameters: ReadonlyArray<TypeParameter>?
    var instantiations: Map<Type>?
    var aliasSymbol: Symbol?
    var aliasTypeArguments: ReadonlyArray<Type>?
}
