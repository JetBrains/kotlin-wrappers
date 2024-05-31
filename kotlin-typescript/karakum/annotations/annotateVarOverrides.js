import ts from "typescript"

export default (node) => {
    if (
        ts.isPropertySignature(node)
        && ts.isIdentifier(node.name)
        && (
            node.name.text === "kind"
            || node.name.text === "type"
        )

        && ts.isInterfaceDeclaration(node.parent)
        && (
            node.parent.name.text === "AssertsIdentifierTypePredicate"
            || node.parent.name.text === "AssertsThisTypePredicate"
            || node.parent.name.text === "IdentifierTypePredicate"
            || node.parent.name.text === "ThisTypePredicate"
        )
    ) {
        return `@Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")`
    }

    if (
        ts.isPropertySignature(node)
        && ts.isIdentifier(node.name)
        && node.name.text === "value"

        && ts.isInterfaceDeclaration(node.parent)
        && (
            node.parent.name.text === "BigIntLiteralType"
            || node.parent.name.text === "StringLiteralType"
            || node.parent.name.text === "NumberLiteralType"
        )
    ) {
        return `@Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")`
    }

    if (
        ts.isPropertySignature(node)
        && ts.isIdentifier(node.name)
        && node.name.text === "moduleSpecifier"

        && ts.isInterfaceDeclaration(node.parent)
        && node.parent.name.text === "CompletionEntryDataResolved"
    ) {
        return `@Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")`
    }

    if (
        ts.isPropertySignature(node)
        && ts.isIdentifier(node.name)
        && node.name.text === "exportMapKey"

        && ts.isInterfaceDeclaration(node.parent)
        && node.parent.name.text === "CompletionEntryDataUnresolved"
    ) {
        return `@Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")`
    }

    if (
        ts.isPropertySignature(node)
        && ts.isIdentifier(node.name)
        && (
            node.name.text === "file"
            || node.name.text === "start"
            || node.name.text === "length"
        )

        && ts.isInterfaceDeclaration(node.parent)
        && node.parent.name.text === "DiagnosticWithLocation"
    ) {
        return `@Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")`
    }

    return null
}
