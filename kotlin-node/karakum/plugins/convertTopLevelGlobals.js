import ts from "typescript";

export default function (node) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("globals.d.ts")
        && node.parent
        && ts.isSourceFile(node.parent)
    ) {
        if (
            ts.isModuleDeclaration(node)
            && ts.isIdentifier(node.name)
            && node.name.text === "NodeJS"
        ) {
            return null
        }
        // ignore all top-level globals, because all declared there are
        // borrowed declarations, node module specific stuff and declarations for backward compatibility
        return ""
    }
    return null
}
