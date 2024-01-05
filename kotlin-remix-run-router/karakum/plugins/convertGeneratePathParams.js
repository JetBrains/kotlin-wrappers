import ts from "typescript";

export default function (node) {
    if (
        ts.isMappedTypeNode(node)
        && ts.isParameter(node.parent)
        && ts.isFunctionDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "generatePath"
    ) {
        return "js.objects.ReadonlyRecord<String, String>"
    }
    return null
}
