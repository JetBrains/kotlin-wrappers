import ts from "typescript";

const overriddenProps = {
    "NavLinkProps": {
        "className": "classNameFn",
        "style": "styleFn",
        "children": "childrenFn",
        "unstable_viewTransition": null,
    },
    "FetcherFormProps": {
        "method": ["routerMethod", "String"],
        "encType": ["routerEncType", "String"],
        "action": null,
        "onSubmit": null,
    },
}

export default function (node, context, render) {
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

        const hasAlias = overrideConfig !== null

        if (hasAlias) {
            let alias
            let parentType

            if (Array.isArray(overrideConfig)) {
                [alias, parentType] = overrideConfig
            } else {
                alias = overrideConfig
            }

            const jsName = `@JsName("${name}")`
            const aliasSignature = `${modifier}${alias}: ${type}${nullable ? "?" : ""}`

            if (parentType) {
                const deprecation = `@Deprecated(message = "use ${alias}", level = DeprecationLevel.HIDDEN)`
                const signature = `override ${modifier}${name}: ${parentType}${nullable ? "?" : ""}`

                return [
                    deprecation,
                    signature,
                    jsName,
                    aliasSignature,
                ].join("\n")
            } else {
                return [
                    jsName,
                    aliasSignature,
                ].join("\n")
            }
        }

        return `override ${modifier}${name}: ${type}${nullable ? "?" : ""}`
    }
    return null
}
