import ts from "typescript"

export default (node) => {
    if (
        ts.isUnionTypeNode(node)

        && node.parent
        && ts.isPropertySignature(node.parent)
        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "code"

        && node.parent?.parent?.parent?.parent // PropertySignature / TypeLiteral / IntersectionType / TypeAliasDeclaration
        && ts.isTypeAliasDeclaration(node.parent.parent.parent.parent)
        && ts.isIdentifier(node.parent.parent.parent.parent.name)
        && node.parent.parent.parent.parent.name.text === "ExecFileException"
    ) {
        return "dynamic"
    }

    return null
}
