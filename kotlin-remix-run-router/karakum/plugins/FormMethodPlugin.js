import ts from "typescript";

export default {
    setup(context) {
    },

    traverse(node) {
        if (
            ts.isTypeAliasDeclaration(node)
            && node.name.text === "LowerCaseFormMethod"
        ) {
            this.sourceFormMethodNode = node
        }
    },

    render(node, context, next) {
        if (!this.sourceFormMethodNode) return null;

        if (
            ts.isTypeAliasDeclaration(node)
            && (
                node.name.text === "LowerCaseFormMethod"
                || node.name.text === "UpperCaseFormMethod"
            )
        ) {
            return ""
        }

        if (
            ts.isTypeAliasDeclaration(node)
            && node.name.text === "FormMethod"
        ) {
            const entries = this.sourceFormMethodNode.type.types
                .filter(type => ts.isLiteralTypeNode(type))
                .map(type => type.literal)
                .filter(literal => ts.isStringLiteral(literal))
                .map(literal => {
                    // normalize form methods to the upper case
                    const value = literal.text.toUpperCase()
                    return [value, value]
                })

            const name = next(node.name)

            const keys = entries.map(([key]) => key)

            const body = keys
                .map(key => `val ${key}: ${name}`)
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
companion object {
${body}
}
}
            `
        }

        return null
    },

    generate() {
        return [];
    },
}
