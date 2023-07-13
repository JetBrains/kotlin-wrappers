import ts from "typescript"

export default (node) => {
    if (
        ts.isInterfaceDeclaration(node)
        || ts.isTypeAliasDeclaration(node)
        || ts.isTypeLiteralNode(node)
    ) {
        return "sealed"
    }

    return null
}
