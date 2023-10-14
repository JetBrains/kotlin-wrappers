import ts from "typescript"

export default (node) => {
    if (
        ts.isInterfaceDeclaration(node)
        && node.name.text === "AgnosticRouteMatch"
    ) {
        return ""
    }

    if (
        ts.isInterfaceDeclaration(node)
        || ts.isTypeAliasDeclaration(node)
        || ts.isTypeLiteralNode(node)
        || ts.isIntersectionTypeNode(node)
    ) {
        return "sealed"
    }

    return null
}
