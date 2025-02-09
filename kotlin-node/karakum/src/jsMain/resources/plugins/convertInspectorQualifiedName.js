import ts from "typescript";

const modules = [
    "Console",
    "Debugger",
    "HeapProfiler",
    "Network",
    "NodeRuntime",
    "NodeTracing",
    "NodeWorker",
    "Profiler",
    "Runtime",
    "Schema",
]

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("inspector.d.ts")) return null

    for (const module of modules) {
        if (
            ts.isQualifiedName(node)
            && ts.isIdentifier(node.left)
            && node.left.text === module
        ) {
            return `node.inspector.${module.toLowerCase()}.${render(node.right)}`
        }

        if (
            ts.isPropertyAccessExpression(node)
            && ts.isIdentifier(node.expression)
            && node.expression.text === module
        ) {
            return `node.inspector.${module.toLowerCase()}.${render(node.name)}`
        }
    }

    return null
}
