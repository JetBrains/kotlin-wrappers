import ts from "typescript";
import * as karakum from "karakum";

const overriddenProps = {
    // crypto
    "X509Certificate": {
        "toString": null,
    },
}

export default function (node, context, render) {
    if (
        ts.isMethodDeclaration(node)
        && ts.isClassDeclaration(node.parent)
        && node.parent.name
        && node.parent.name.text in overriddenProps
        && ts.isIdentifier(node.name)
        && node.name.text in overriddenProps[node.parent.name.text]
    ) {
        const name = karakum.escapeIdentifier(render(node.name))

        const typeParameters = node.typeParameters
            ?.map(typeParameter => render(typeParameter))
            ?.join(", ")

        const returnType = node.type && render(node.type)

        return karakum.convertParameterDeclarations(node, context, render, {
            strategy: "function",
            template: parameters => {
                return `override fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)}`
            }
        })
    }
    return null
}
