plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(npmv("@actions/artifact"))
    api(npmv("@actions/cache"))
    api(npmv("@actions/core"))
    api(npmv("@actions/exec"))
    // api(npmv("@actions/github"))
    api(npmv("@actions/glob"))
    api(npmv("@actions/http-client"))
    api(npmv("@actions/io"))
    api(npmv("@actions/tool-cache"))

    api(project(":kotlin-node"))
}
