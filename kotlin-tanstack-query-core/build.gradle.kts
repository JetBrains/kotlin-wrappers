plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinBrowser)

    jsMainApi(npmv("@tanstack/query-core"))
}
