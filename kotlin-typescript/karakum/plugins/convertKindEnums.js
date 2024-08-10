import ts from "typescript";
import * as karakum from "karakum";

export default function (node, context, render) {
    if (
        ts.isEnumDeclaration(node)
        && (
            node.name.text === "SyntaxKind"
            || node.name.text === "ScriptKind"
            || node.name.text === "TypePredicateKind"
            || node.name.text === "InvalidatedProjectKind"
            || node.name.text === "CommandTypes"
        )
    ) {
        const name = render(node.name)

        const injectionService = context.lookupService(karakum.injectionServiceKey)

        const heritageInjections = injectionService?.resolveInjections(node, karakum.InjectionType.HERITAGE_CLAUSE, context, render)

        const injectedHeritageClauses = heritageInjections
            ?.filter(Boolean)
            ?.join(", ")

        const members = node.members
            .map(member => {
                const type = ts.isIdentifier(member.name)
                    ? member.name.text
                    : name

                return `${render(member)}: ${type}`
            })
            .join("\n")

        const body = node.members
            .map(member => {
                const memberHeritageInjections = injectionService?.resolveInjections(member, karakum.InjectionType.HERITAGE_CLAUSE, context, render)

                const memberInjectedHeritageClauses = memberHeritageInjections
                    ?.filter(Boolean)
                    ?.join(", ")

                const heritageClauses = [name, memberInjectedHeritageClauses]
                    .filter(Boolean)
                    .join(", ")

                return `sealed interface ${render(member.name)}${karakum.ifPresent(heritageClauses, it => ` : ${it}`)}`
            })
            .join("\n")

        return `
sealed external interface ${name}${karakum.ifPresent(injectedHeritageClauses, it => ` : ${it}`)} {
${body}

companion object {
${members}
}
}
        `
    }


    return null
}
