import ts from "typescript";
import * as karakum from "karakum";

export default function (node, context, render) {
    if (
        ts.isInterfaceDeclaration(node)
        && (
            node.name.text === "SubmitFunction"
        )
    ) {
        const signature = node.members[0]

        const returnType = render(signature.type)

        return karakum.convertParameterDeclarations(signature, context, render, {
            strategy: "lambda",
            template: parameters => {
                return `typealias ${render(node.name)} = (${parameters}) -> ${returnType}`
            }
        })
    }
    return null
}
