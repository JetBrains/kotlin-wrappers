import ts from "typescript"

export default (node) => {
    if (
        node.parent
        && ts.isParameter(node.parent)
        && node.parent.parent
        && ts.isFunctionDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "useLinkClickHandler"
    ) {
        return "UseLinkClickHandlerOptions"
    }

    if (
        node.parent
        && ts.isParameter(node.parent)
        && node.parent.parent
        && ts.isFunctionDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "useFormAction"
    ) {
        return "UseFormActionOptions"
    }

    if (
        node.parent
        && ts.isParameter(node.parent)
        && node.parent.parent
        && ts.isFunctionDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "useScrollRestoration"
    ) {
        return "UseScrollRestorationOptions"
    }

    if (
        node.parent
        && ts.isParameter(node.parent)
        && node.parent.parent
        && ts.isFunctionDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "usePrompt"
    ) {
        return "UsePromptOptions"
    }

    return null
}
