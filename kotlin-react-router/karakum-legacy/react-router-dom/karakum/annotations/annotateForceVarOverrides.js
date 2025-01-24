import ts from "typescript"

export default (node) => {
    if (
        ts.isPropertySignature(node)
        && ts.isIdentifier(node.name)
        && (
            node.name.text === "method"
            || node.name.text === "action"
        )

        && ts.isInterfaceDeclaration(node.parent)
        && node.parent.name.text === "SharedFormProps"
    ) {
        return `@Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")`
    }

    return null
}
