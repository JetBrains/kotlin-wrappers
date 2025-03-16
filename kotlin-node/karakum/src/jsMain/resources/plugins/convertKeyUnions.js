import ts from "typescript";
import * as karakum from "../karakum.mjs";

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

        const keys = entries.map(([key]) => key)

        const body = keys
            .map(key => `sealed interface ${key} : ${name}`)
            .join("\n")

        const companionBody = entries
            .map(([key, value]) => (
                `
@seskar.js.JsValue("${value}")
val ${key}: ${key}
                    `.trim()
            ))
            .join("\n")

        return `
sealed external interface ${name} {
${body}

companion object {
${companionBody}
}
}
        `
    }


    return null
}
