import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isHeritageClause(node)

        && node.parent
        && ts.isInterfaceDeclaration(node.parent)
        && node.parent.name.text === "StatSyncFn"
    ) {
        return ""
    }

    return null
}
