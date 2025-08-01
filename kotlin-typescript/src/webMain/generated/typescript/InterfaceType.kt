// Automatically generated - do not modify!

package typescript

/** Class and interface types (ObjectFlags.Class and ObjectFlags.Interface). */
sealed external interface InterfaceType : ObjectType {
    var typeParameters: js.array.ReadonlyArray<TypeParameter>?
    var outerTypeParameters: js.array.ReadonlyArray<TypeParameter>?
    var localTypeParameters: js.array.ReadonlyArray<TypeParameter>?
    var thisType: TypeParameter?
}
