// Automatically generated - do not modify!

package typescript

external interface TupleType : GenericType {
    var elementFlags: js.array.ReadonlyArray<ElementFlags>

    /** Number of required or variadic elements */
    var minLength: Int

    /** Number of initial required or optional elements */
    var fixedLength: Int

    var combinedFlags: ElementFlags
    var readonly: Boolean
    var labeledElementDeclarations:
            (js.array.ReadonlyArray<(Any? /* NamedTupleMember | ParameterDeclaration | undefined */)>)?
}
