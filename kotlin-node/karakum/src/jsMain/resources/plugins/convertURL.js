import ts from "typescript";

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("url.d.ts")
        && ts.isClassDeclaration(node)
        && node.name?.text === "URL"
    ) {
        // remove from conversion to avoid file creation for anonymous declarations
        return ""
    }


    return null
}
