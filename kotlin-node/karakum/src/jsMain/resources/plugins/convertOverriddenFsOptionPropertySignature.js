import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("fs.d.ts") && !sourceFileName.endsWith("fs/promises.d.ts")) return null

    if (
        ts.isPropertySignature(node)
        && ts.isTypeLiteralNode(node.parent)
        && (
            node.name.text === "bigint"
            || node.name.text === "throwIfNoEntry"
            || (
                node.name.text === "recursive"

                && ts.isIntersectionTypeNode(node.parent.parent)
                && node.parent.parent.types[0]
                && ts.isTypeReferenceNode(node.parent.parent.types[0])
                && ts.isIdentifier(node.parent.parent.types[0].typeName)
                && node.parent.parent.types[0].typeName.text === "MakeDirectoryOptions"
            )
            || (
                node.name.text === "encoding"

                && ts.isIntersectionTypeNode(node.parent.parent)
                && node.parent.parent.types[0]
                && ts.isTypeReferenceNode(node.parent.parent.types[0])
                && ts.isIdentifier(node.parent.parent.types[0].typeName)
                && node.parent.parent.types[0].typeName.text === "WatchOptions"
            )
        )
    ) {
        const readonly = node.modifiers?.find(modifier => modifier.kind === ts.SyntaxKind.ReadonlyKeyword)

        const modifier = readonly
            ? "val "
            : "var "

        const name = render(node.name)

        const isOptional = Boolean(node.questionToken)

        const type = karakum.renderNullable(node.type, isOptional, context, render)

        const hasAlias = !isOptional

        if (hasAlias) {
            const alias = node.name.text === "bigint"
                ?  "requiredBigInt"
                : `required${karakum.capitalize(name)}`
            const jsName = `@JsName("${name}")`
            const aliasSignature = `${modifier}${alias}: ${type}`

            return [
                jsName,
                aliasSignature,
            ].join("\n")
        }

        return `override ${modifier}${name}: ${type}`
    }
    return null
}
