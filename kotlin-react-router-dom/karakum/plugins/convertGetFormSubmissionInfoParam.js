import ts from "typescript"

export default (node) => {
    if (
        ts.isTypeLiteralNode(node)

        && node.parent
        && ts.isUnionTypeNode(node.parent)

        && node.parent.parent
        && ts.isParameter(node.parent.parent)

        && node.parent.parent.parent
        && ts.isFunctionDeclaration(node.parent.parent.parent)
        && node.parent.parent.parent.name.text === "getFormSubmissionInfo"
    ) {
        return "js.core.ReadonlyRecord<String, String>"
    }

    return null
}
