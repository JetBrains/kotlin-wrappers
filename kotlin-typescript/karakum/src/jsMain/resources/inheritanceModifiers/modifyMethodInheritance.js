import ts from "typescript"

export default (node) => {
    if (
        ts.isMethodSignature(node)
        && ts.isIdentifier(node.name)
        && (
            (
                (
                    node.name.text === "getCompilationSettings"
                    || node.name.text === "trace"
                    || node.name.text === "realpath"
                    || node.name.text === "fileExists"
                    || node.name.text === "getDirectories"
                    || node.name.text === "useCaseSensitiveFileNames"
                )
                && node.parent
                && node.parent.name?.text === "LanguageServiceHost"
            )
            || (
                (
                    node.name.text === "fileExists"
                    || node.name.text === "readFile"
                    || node.name.text === "trace"
                )
                && node.parent
                && node.parent.name?.text === "ParseConfigHost"
            )
            || (
                node.name.text === "getCurrentDirectory"
                && node.parent
                && node.parent.name?.text === "Program"
            )
        )
    ) {
        return "override"
    }

    return null
}
