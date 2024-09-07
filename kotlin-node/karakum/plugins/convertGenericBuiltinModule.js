import ts from "typescript";

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("process.d.ts")) return null

    if (
        ts.isMethodSignature(node)
        && node.name.text === "getBuiltinModule"
        && node.typeParameters
    ) {
        return ""
    }

    return null
}
