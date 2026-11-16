package karakum.react

internal fun String.removeDeprecatedMembers(): String =
    replace(Regex(""" +/\*\*[ \n]*.*@deprecated .*[ \n]*\*/\n +.+?\n"""), "")
        .replace(Regex(""" +/\*\*\n\s+\*.+\n\s+\*\s+@deprecated .*[ \n]*\*/\n +.+?\n"""), "")
        .replace("param: React.DetailedHTMLProps<React.ParamHTMLAttributes<HTMLParamElement>, HTMLParamElement>;\n", "")
