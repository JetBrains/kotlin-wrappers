// Automatically generated - do not modify!

package typescript

import js.array.ReadonlyArray

sealed external interface TupleType : GenericType {
    var elementFlags: ReadonlyArray<ElementFlags>

    /** Number of required or variadic elements */
    var minLength: Int

    /** Number of initial required or optional elements */
    var fixedLength: Int

    /** True if tuple has any rest or variadic elements */
    var hasRestElement: Boolean
    var combinedFlags: ElementFlags
    var readonly: Boolean
    var labeledElementDeclarations: ReadonlyArray<Any? /* NamedTupleMember | ParameterDeclaration */>?
}
