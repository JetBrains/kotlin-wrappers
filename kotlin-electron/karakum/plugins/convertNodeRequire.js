import ts from "typescript";

export default function (node) {
    if (
        ts.isInterfaceDeclaration(node)
        && (
            node.name.text === "NodeRequire"
            || node.name.text === "NodeRequireFunction"
        )
    ) {
        return ""
    }
    return null
}
