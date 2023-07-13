import ts from "typescript"

export default (node) => {
    if (
        node.parent
        && ts.isParameter(node.parent)

        && node.parent.parent
        && ts.isFunctionTypeNode(node.parent.parent)

        && node.parent.parent.parent
        && ts.isParenthesizedTypeNode(node.parent.parent.parent)

        && node.parent.parent.parent.parent
        && ts.isUnionTypeNode(node.parent.parent.parent.parent)

        && node.parent.parent.parent.parent.parent
        && ts.isPropertySignature(node.parent.parent.parent.parent.parent)
        && ts.isIdentifier(node.parent.parent.parent.parent.parent.name)
        && (
            node.parent.parent.parent.parent.parent.name.text === "className"
            || node.parent.parent.parent.parent.parent.name.text === "style"
            || node.parent.parent.parent.parent.parent.name.text === "children"
        )

        && node.parent.parent.parent.parent.parent.parent
        && ts.isInterfaceDeclaration(node.parent.parent.parent.parent.parent.parent)
        && node.parent.parent.parent.parent.parent.parent.name.text === "NavLinkProps"
    ) {
        return "NavLinkOptions"
    }

    return null
}
