import ts from "typescript";
import * as karakum from "../karakum.mjs";

const conflictingEntities = {
    "inspector": [
        "Session",
    ],
    "readline": [
        "Interface",
    ],
}

function checkNameByNamespace(node, context) {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())
    const namespace = typeScriptService?.findClosest(node, ts.isModuleDeclaration)
    if (!namespace) return false

    const namespaceConflictingEntities = conflictingEntities[namespace.name.text]
    if (!namespaceConflictingEntities) return false

    return namespaceConflictingEntities.includes(node.name?.text);
}

function checkNameByFileName(node, context) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    const [, fileNameConflictingEntities] = Object.entries(conflictingEntities)
        .find(([fileName]) => sourceFileName.endsWith(fileName)) ?? []

    if (!fileNameConflictingEntities) return false

    return fileNameConflictingEntities.includes(node.name?.text);
}

export default (node, context) => {
    if (
        ts.isClassDeclaration(node)
        && node.name
        && (
            checkNameByNamespace(node, context)
            || checkNameByFileName(node, context)
        )
    ) {
        return `@JsName("${node.name.text}")`
    }

    return null
}
