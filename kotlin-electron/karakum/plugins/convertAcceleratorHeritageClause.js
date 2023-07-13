import ts from "typescript";

export default function (node) {
    if (
        ts.isHeritageClause(node)
        && node.parent?.name?.text === "Accelerator"
    ) {
        return ""
    }
    return null
}
