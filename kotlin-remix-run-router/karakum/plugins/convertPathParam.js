import ts from "typescript";

export default function (node) {
    const isGeneratePath = node.parent?.parent !== undefined
        && ts.isFunctionDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "generatePath"

    const isMatchPath = node.parent?.parent?.parent !== undefined
        && ts.isFunctionDeclaration(node.parent.parent.parent)
        && node.parent.parent.parent.name.text === "matchPath"

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "Path"
        && (isGeneratePath || isMatchPath)
    ) {
        return "String"
    }
    return null
}
