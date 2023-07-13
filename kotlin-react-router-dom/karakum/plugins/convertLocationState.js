import ts from "typescript"

export default (node) => {
    if (
        node.kind === ts.SyntaxKind.AnyKeyword

        && node.parent
        && ts.isPropertySignature(node.parent)
        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "state"

        && ts.isInterfaceDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "LinkProps"
    ) {
        return "remix.run.router.LocationState?"
    }

    if (
        node.kind === ts.SyntaxKind.AnyKeyword

        && node.parent
        && ts.isPropertySignature(node.parent)
        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "state"

        && ts.isTypeLiteralNode(node.parent.parent)

        && ts.isParameter(node.parent.parent.parent)

        && ts.isFunctionDeclaration(node.parent.parent.parent.parent)
        && node.parent.parent.parent.parent.name.text === "useLinkClickHandler"
    ) {
        return "remix.run.router.LocationState?"
    }

    return null
}
