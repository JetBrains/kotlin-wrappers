import ts from "typescript";
import * as karakum from "karakum";

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        ts.isTypeAliasDeclaration(node)
        && (
            node.name.text === "KeyType"
            || node.name.text === "KeyFormat"
        )
        && ts.isUnionTypeNode(node.type)
        && sourceFileName.endsWith("crypto.d.ts")
    ) {
        const name = render(node.name)

        const entries = node.type.types
            .filter(type => ts.isLiteralTypeNode(type))
            .map(type => type.literal)
            .filter(literal => ts.isStringLiteral(literal))
            .map(literal => {
                const value = literal.text
                const key = karakum.identifier(value)
                return [key, value]
            })

        const keys = entries.map(([key]) => karakum.escapeIdentifier(key))
        const uniqueKeys = Array.from(new Set(keys))

        const body = uniqueKeys
            .map(key => `object ${key} : ${name}`)
            .join("\n")

        const jsName = entries
            .map(([key, value]) => `${key}: '${value}'`)
            .join(", ")

        return `
@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{${jsName}}/*union*/)""")
sealed external interface ${name} {
${body}
}
        `
    }


    return null
}
