import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("stream.d.ts")
        && ts.isTypeParameterDeclaration(node)
        && node.parent
        && ts.isTypeAliasDeclaration(node.parent)
        && (
            node.parent.name.text === "PipelineCallback"
            || node.parent.name.text === "PipelineDestination"
            || node.parent.name.text === "PipelinePromise"
            || node.parent.name.text === "PipelineTransform"
        )
    ) {
        const name = render(node.name)

        const constraintType = node.constraint && render(node.constraint)
        const defaultType = node.default && render(node.default)

        const bound = `${karakum.ifPresent(constraintType, it => ` : ${it}`)}${karakum.ifPresent(defaultType, it => ` default is ${it}`)}`

        return `${name}${karakum.ifPresent(bound, it => ` /* ${it} */`)}`
    }

    if (
        sourceFileName.endsWith("util.d.ts")
        && ts.isTypeParameterDeclaration(node)
        && node.parent
        && ts.isTypeAliasDeclaration(node.parent)
        && node.parent.name.text === "CustomPromisify"
    ) {
        const name = render(node.name)

        const constraintType = node.constraint && render(node.constraint)
        const defaultType = node.default && render(node.default)

        const bound = `${karakum.ifPresent(constraintType, it => ` : ${it}`)}${karakum.ifPresent(defaultType, it => ` default is ${it}`)}`

        return `${name}${karakum.ifPresent(bound, it => ` /* ${it} */`)}`
    }


    return null
}
