package karakum.react

internal fun String.removeDeprecatedMembers(): String =
    replace(Regex(""" +/\*\*[ \n]*.*@deprecated .*[ \n]*\*/\n +.+?\n"""), "")
        .replace("param: React.DetailedHTMLProps<React.ParamHTMLAttributes<HTMLParamElement>, HTMLParamElement>;\n", "")
