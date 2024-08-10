// Automatically generated - do not modify!

package typescript

sealed external interface TupleType : GenericType {
    var elementFlags: js.array.ReadonlyArray<ElementFlags>

    /** Number of required or variadic elements */
    var minLength: Double

    /** Number of initial required or optional elements */
    var fixedLength: Double

    /** True if tuple has any rest or variadic elements */
    var hasRestElement: Boolean
    var combinedFlags: ElementFlags
    var readonly: Boolean
    var labeledElementDeclarations: (js.array.ReadonlyArray<(Any? /* NamedTupleMember | ParameterDeclaration | undefined */)>)?
}
