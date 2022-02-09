// Automatically generated - do not modify!

package typescript

import kotlinx.js.ReadonlyArray

/** Class and interface types (ObjectFlags.Class and ObjectFlags.Interface). */
sealed external interface InterfaceType : ObjectType {
    var typeParameters: ReadonlyArray<TypeParameter>?
    var outerTypeParameters: ReadonlyArray<TypeParameter>?
    var localTypeParameters: ReadonlyArray<TypeParameter>?
    var thisType: TypeParameter?
}
