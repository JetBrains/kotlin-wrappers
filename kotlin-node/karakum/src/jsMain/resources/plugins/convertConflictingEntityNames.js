import ts from "typescript";
import * as karakum from "../karakum.mjs";

const conflictingEntities = {
    "inspector": [
        "Session",
    ],
    "readline": [
        "Interface",
        "ReadLineOptions",
        "Completer",
    ],
    "stream.d.ts": [
        "FinishedOptions",
    ],
}

function extractDeclaration(node, context) {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())

    const typeChecker = typeScriptService?.program.getTypeChecker()

    let symbol = typeChecker?.getSymbolAtLocation(node)
    if (!symbol) return null

    if ((symbol.flags & ts.SymbolFlags.Alias) !== 0) {
        symbol = typeChecker?.getAliasedSymbol(symbol) ?? symbol
    }

    const [declaration] = symbol.declarations ?? []

    return symbol.valueDeclaration ?? declaration
}

function convertNameByNamespace(node, context) {
    const declaration = extractDeclaration(node, context)
    if (!declaration) return null

    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())
    const namespace = typeScriptService?.findClosest(declaration, ts.isModuleDeclaration)
    if (!namespace) return null

    const namespaceConflictingEntities = conflictingEntities[namespace.name.text]
    if (!namespaceConflictingEntities) return null
    if (!namespaceConflictingEntities.includes(node.text)) return null

    return `_${node.text}`
}

function convertNameByFileName(node, context) {
    const declaration = extractDeclaration(node, context)
    if (!declaration) return null

    const sourceFileName = declaration.getSourceFile()?.fileName ?? "generated.d.ts"

    const [, fileNameConflictingEntities] = Object.entries(conflictingEntities)
        .find(([fileName]) => sourceFileName.endsWith(fileName)) ?? []

    if (!fileNameConflictingEntities) return null
    if (!fileNameConflictingEntities.includes(node.text)) return null

    return `_${node.text}`
}

export default function (node, context, render) {
    if (ts.isIdentifier(node)) {
        const result = convertNameByNamespace(node, context)
        if (result) return result

        return convertNameByFileName(node, context)
    }

    return null
}
