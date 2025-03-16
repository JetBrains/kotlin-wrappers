import ts from "typescript"

const renamedFunctions = {
    strictEqual: "equal",
    notStrictEqual: "notEqual",
    deepStrictEqual: "deepEqual",
    notDeepStrictEqual: "notDeepEqual",
}

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("assert.d.ts")
        && ts.isIdentifier(node)
        && node.text in renamedFunctions

        && node.parent
        && ts.isFunctionDeclaration(node.parent)
        && node.parent.name === node
    ) {
        return renamedFunctions[node.text]
    }

    return null
}
