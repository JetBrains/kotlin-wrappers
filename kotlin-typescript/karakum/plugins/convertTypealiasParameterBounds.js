import ts from "typescript";
import * as karakum from "karakum";

export default function (node, context, render) {
    if (
        ts.isTypeParameterDeclaration(node)
        && node.parent
        && ts.isTypeAliasDeclaration(node.parent)
        && (
            node.parent.name.text === "Visitor"
            || node.parent.name.text === "VisitResult"
            || node.parent.name.text === "CreateProgram"
            || node.parent.name.text === "Transformer"
            || node.parent.name.text === "TransformerFactory"
            || node.parent.name.text === "InvalidatedProject"
        )
    ) {
        const name = render(node.name)

        const constraintType = node.constraint && render(node.constraint)
        const defaultType = node.default && render(node.default)

        const bound = `${karakum.ifPresent(constraintType, it => ` : ${it}`)}${karakum.ifPresent(defaultType, it => ` default is ${it}`)}`

        return `${name}${karakum.ifPresent(bound, it => ` /* ${it} */`)}`
    }


    return null
}
