import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isEnumDeclaration(node)
        && (
            node.name.text === "SyntaxKind"
            || node.name.text === "TypePredicateKind"
            || node.name.text === "InvalidatedProjectKind"
        )
    ) {
        const name = render(node.name)

        const members = node.members
            .map(member => {
                const type = ts.isIdentifier(member.name)
                    ? member.name.text
                    : name

                return `${render(member)}: ${type}`
            })
            .join("\n")

        const body = node.members
            .map(member => `sealed interface ${render(member.name)} : ${name}`)
            .join("\n")

        return `
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface ${name} {
${body}

companion object {
${members}
}
}
        `
    }


    return null
}
