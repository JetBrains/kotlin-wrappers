plugins {
    `kotlin-library-conventions`
    karakum()
}

dependencies {
    jsMainApi(projects.kotlinBrowser)

    jsMainApi(npmv("@remix-run/router"))
}
