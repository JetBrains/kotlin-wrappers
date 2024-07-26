plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(npmv("@actions/artifact"))
    jsMainApi(npmv("@actions/cache"))
    jsMainApi(npmv("@actions/core"))
    jsMainApi(npmv("@actions/exec"))
    jsMainApi(npmv("@actions/github"))
    jsMainApi(npmv("@actions/glob"))
    jsMainApi(npmv("@actions/http-client"))
    jsMainApi(npmv("@actions/io"))
    jsMainApi(npmv("@actions/tool-cache"))

    jsMainApi(projects.kotlinNode)
    jsMainImplementation(kotlinxCoroutines("core"))
}
