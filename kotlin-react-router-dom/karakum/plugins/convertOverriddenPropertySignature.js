const ts = require("typescript");

const overriddenProps = {
    "NavLinkProps": {
        "className": ["classNameFn", "csstype.ClassName"],
        "style": ["styleFn", "react.CSSProperties"],
        "children": ["childrenFn", "react.ReactNode"],
    },
    "FormProps": {
        "method": ["routerMethod", "String"],
        "action": null,
        "onSubmit": null,
    },
}

module.exports = function (node, context, render) {
    if (
        ts.isPropertySignature(node)
        && ts.isInterfaceDeclaration(node.parent)
        && node.parent.name.text in overriddenProps
        && ts.isIdentifier(node.name)
        && node.name.text in overriddenProps[node.parent.name.text]
    ) {
        const readonly = node.modifiers?.find(modifier => modifier.kind === ts.SyntaxKind.ReadonlyKeyword)

        const modifier = readonly
            ? "val "
            : "var "

        const name = render(node.name)

        let type = render(node.type)

        const nullable = node.questionToken

        const overrideConfig = overriddenProps[node.parent.name.text][node.name.text]

        const hidden = overrideConfig !== null

        if (hidden) {
            const [alias, parentType] = overrideConfig

            const deprecation = `@Deprecated(message = "use ${alias}", level = DeprecationLevel.HIDDEN)`
            const signature = `override ${modifier}${name}: ${parentType}${nullable ? "?" : ""}`
            const jsName = `@JsName("${name}")`
            const aliasSignature = `${modifier}${alias}: ${type}${nullable ? "?" : ""}`

            return [
                deprecation,
                signature,
                jsName,
                aliasSignature,
            ].join("\n")
        }

        return `override ${modifier}${name}: ${type}${nullable ? "?" : ""}`
    }
    return null
}
